package com.atinbo.member.service;

import org.springframework.stereotype.Service;

/**
 * 授权操作services实现
 *
 * @author chenxiaolei
 * @version 5.3.20
 * @date 2017/3/21 17:25
 */
@Service("authorizeService")
public class AuthorizeServiceImpl implements IAuthorizeService {

    @Override
    public void addAuthCode(String authCode, String username, int expireSeconds) {

    }

    @Override
    public void addAccessToken(String accessToken, String username, int expireSeconds) {

    }

    @Override
    public void addRefreshToken(String refreshToken, String accessToken, int expireSeconds) {

    }

    @Override
    public void delRefreshToken(String refreshToken) {

    }

    @Override
    public void evict(String authCode) {

    }

    @Override
    public boolean checkAccessToken(String accessToken) {
        return false;
    }

    @Override
    public String findUsernameByAccessToken(String accessToken) {
        return null;
    }

    @Override
    public boolean checkRefreshToken(String refreshToken) {
        return false;
    }

    @Override
    public String findAccessTokenByRefreshToken(String refreshToken) {
        return null;
    }

    @Override
    public boolean checkAuthCode(String authCode) {
        return false;
    }

    @Override
    public String findUsernameByAuthCode(String authCode) {
        return null;
    }
}
