package pers.vicliu.ynyt.web.springboot.core.exception;

/**
 * @Auther: liuweikai
 * @Date: 2018/8/28 14:11
 * @Description:
 */
public class ValidatorException extends RuntimeException{
    public ValidatorException() {
    }

    public ValidatorException(String message) {
        super(message);
    }

    public ValidatorException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValidatorException(Throwable cause) {
        super(cause);
    }
}
