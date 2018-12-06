package com.inesanet.utils;

import java.util.UUID;

/**
 * @Auther: liuweikai
 * @Date: 2018/12/3 15:47
 * @Description:
 */
public class Utils {
    /**
     * @return 返回UUID作为主键
     */
    public static String generateUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
