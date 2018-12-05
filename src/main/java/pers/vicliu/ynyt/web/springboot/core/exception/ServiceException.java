package pers.vicliu.ynyt.web.springboot.core.exception;

/**
 * @Auther: liuweikai
 * @Date: 2018/8/28 14:11
 * @Description:
 */
public class ServiceException extends RuntimeException{
    public ServiceException() {
        super();
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }
}
