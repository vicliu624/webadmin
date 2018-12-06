package com.inesanet.authorization.annotation;

/**
 * @Auther: liuweikai
 * @Date: 2018/10/8 14:15
 * @Description:
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface CurrentUserId {
}
