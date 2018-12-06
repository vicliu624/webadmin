package com.inesanet.domain.service;

/**
 * @Auther: liuweikai
 * @Date: 2018/12/3 15:04
 * @Description:
 */
public enum ResultStatus {
    SUCCESS(100, "成功"),
    DATA_NOT_NULL(-1004, "字段不能为空"),
    ADMIN_NOT_FOUND(-1002, "管理员不存在"),
    USER_NOT_FOUND(-1002, "用户不存在"),
    USERNAME_OR_PASSWORD_ERROR(-1001, "用户名或密码错误"),
    NOT_SUPER_ADMIN(-1010, "没有超级管理员权限"),
    USERNAME_HAS_EXISTS(-1005, "用户名已存在");

    /**
     * 返回码
     */
    private int code;
    /**
     * 返回结果描述
     */
    private String message;

    ResultStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
