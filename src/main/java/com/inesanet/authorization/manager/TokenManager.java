package com.inesanet.authorization.manager;


import com.inesanet.authorization.model.TokenModel;

/**
 * @Auther: liuweikai
 * @Date: 2018/10/8 14:18
 * @Description:
 */
public interface TokenManager {
    /**
     * 创建一个token关联上指定用户id
     * @param userId
     * @return 生成的token
     */
    TokenModel createToken(int userId);

    /**
     * 从字符串中解析token
     * @param authentication 加密后的字符串
     * @return
     */
    TokenModel getToken(String authentication);

    /**
     * 检查token是否有效
     * @param model
     * @return 是否有效
     */
    boolean checkToken(TokenModel model);

    /**
     * 清除 token
     * @param userId 登录用户的userId
     */
    void deleteToken(int userId);
}
