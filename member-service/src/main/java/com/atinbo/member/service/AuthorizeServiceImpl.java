package com.atinbo.member.service;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import org.springframework.stereotype.Service;


@Service
@SofaService(interfaceType = IAuthorizeService.class, uniqueId = "${service.unique.id}", bindings = {@SofaServiceBinding(bindingType = "bolt")})
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
