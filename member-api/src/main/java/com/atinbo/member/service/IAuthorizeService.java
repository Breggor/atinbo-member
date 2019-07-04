package com.atinbo.member.service;

/**
 * 授权操作service
 *
 * @author breggor
 */
public interface IAuthorizeService {

    /**
     * 添加授权代码
     *
     * @param authCode 授权代码
     * @param username 用户名
     */
    void addAuthCode(String authCode, String username, int expireSeconds);

    /**
     * 添加访问令牌
     *
     * @param accessToken 访问令牌
     * @param username    用户名
     */
    void addAccessToken(String accessToken, String username, int expireSeconds);

    /**
     * 添加刷新令牌
     *
     * @param refreshToken 刷新令牌
     * @param accessToken  访问令牌
     */
    void addRefreshToken(String refreshToken, String accessToken, int expireSeconds);


    /**
     * 删除刷新令牌
     *
     * @param refreshToken 刷新令牌
     */
    void delRefreshToken(String refreshToken);

    /**
     * 清除授权码 确保一个code只能使用一次
     *
     * @param authCode
     */
    void evict(String authCode);


    /**
     * 验证访问令牌是否有效
     *
     * @param accessToken 访问令牌
     * @return boolean
     */
    boolean checkAccessToken(String accessToken);

    /**
     * 根据令牌获取用户名
     *
     * @param accessToken 访问令牌
     * @return 用户名
     */
    String findUsernameByAccessToken(String accessToken);

    /**
     * 验证刷新令牌是否有效
     *
     * @param refreshToken 刷新令牌
     * @return true/false
     */
    boolean checkRefreshToken(String refreshToken);

    /**
     * 根据刷新令牌获取访问令牌
     *
     * @param refreshToken 刷新令牌
     * @return 访问令牌
     */
    String findAccessTokenByRefreshToken(String refreshToken);


    /**
     * 验证授权代码是否有效
     *
     * @param authCode 授权代码
     * @return true/false
     */
    boolean checkAuthCode(String authCode);

    /**
     * 根据授权代码获取用户名
     *
     * @param authCode
     * @return 用户名
     */
    String findUsernameByAuthCode(String authCode);
}
