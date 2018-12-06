package com.inesanet.authorization.resolvers;

import com.inesanet.authorization.annotation.CurrentUserId;
import com.inesanet.config.Constants;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.multipart.support.MissingServletRequestPartException;

/**
 * @Auther: liuweikai
 * @Date: 2018/10/8 14:16
 * @Description:
 */
@Component
public class CurrentUserIdMethodArgumentResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        if (methodParameter.getParameterType().isAssignableFrom(Integer.class) &&
                methodParameter.hasParameterAnnotation(CurrentUserId.class)) {
            return true;
        }
        return false;
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        Integer currentUserId = (Integer) nativeWebRequest.getAttribute(Constants.CURRENT_USER_ID, RequestAttributes.SCOPE_REQUEST);

        if (null != currentUserId) {
            return currentUserId;
        }

        throw new MissingServletRequestPartException(Constants.CURRENT_USER_ID);
    }
}
