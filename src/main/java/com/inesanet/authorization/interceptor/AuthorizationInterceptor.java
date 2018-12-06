package com.inesanet.authorization.interceptor;

import com.inesanet.authorization.annotation.Authorization;
import com.inesanet.authorization.manager.TokenManager;
import com.inesanet.authorization.model.TokenModel;
import com.inesanet.config.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @Auther: liuweikai
 * @Date: 2018/10/8 14:17
 * @Description:
 */
@Component
public class AuthorizationInterceptor extends HandlerInterceptorAdapter {
    private static Logger LOG = LogManager.getLogger(AuthorizationInterceptor.class.getName());

    @Autowired
    private TokenManager manager;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        LOG.debug(request.getRequestURI());
//        如果不是映射到方法直接通过
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
//        从header中得到token
        String authorization = request.getHeader(Constants.AUTHORIZATION);

//        验证token
        TokenModel model = this.manager.getToken(authorization);

        String url = request.getRequestURI();
        if (method.getAnnotation(Authorization.class) != null) {
            if (null == model) {
                response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
                return false;
            }
            // 不是 admin 不能访问 /admin 的接口
            if (url.split("/")[1].equals("admin")) {
                if (String.valueOf(model.getUserId()).length() != 3) {
                    System.out.println("ss");
                    response.setStatus(HttpServletResponse.SC_FORBIDDEN);
                    return false;
                }
            }

//            if (url.split("/")[1].equals("user")) {
//                if (String.valueOf(model.getUserId()).length() != 8) {
//                    response.setStatus(HttpServletResponse.SC_FORBIDDEN);
//                    return false;
//                }
//            }
        }


        if (this.manager.checkToken(model)) {
//            如果token验证成功，将token对应的userId存在request中，便于之后注入
            request.setAttribute(Constants.CURRENT_USER_ID, model.getUserId());
            return true;
        }
//        如果验证token失败，并且方法注明了Authorization， 返回401错误
        if (method.getAnnotation(Authorization.class) != null) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return false;
        }
        return true;
    }
}
