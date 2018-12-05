package pers.vicliu.ynyt.web.springboot.core.mvc.advice;

import com.github.pagehelper.Page;
import com.google.common.collect.Maps;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.core.MethodParameter;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;
import pers.vicliu.ynyt.web.springboot.core.mybatis.domain.TableResponse;

import java.util.List;
import java.util.Map;

/**
 * @Auther: liuweikai
 * @Date: 2018/8/28 13:59
 * @Description:
 */
@ControllerAdvice
public class MyResponseBodyAdvice implements ResponseBodyAdvice {
    private static Logger LOG = LogManager.getLogger(MyResponseBodyAdvice.class.getName());
    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        LOG.info("remote host:[{}],method:[{}],",request.getRemoteAddress().getHostName(),request.getMethod().name());
        // 静态页面无需拦截
        if (body instanceof Resource) {
            LOG.info("body instanceof Resource 静态页面无需拦截");
            return body;
        }
        if (body == null) {
            LOG.info("body == null)");
            return null;
        }
        // 分页
        if (body instanceof Page) {
            LOG.info("body instanceof Page");
            Page page = (Page) body;
            TableResponse<Page> result = new TableResponse<>();
            result.setTotal(page.getTotal());
            result.setList(page);
            return result;
        }
        // 如果返回的是数组，前端通过 data.array 来获取
        if (body instanceof List || body.getClass().isArray()) {
            LOG.info("body instanceof List || body.getClass().isArray()");
            Map<String, Object> result = Maps.newHashMap();
            result.put("array", body);
            return result;
        }
        return body;
    }
}
