package com.atinbo.member.service;

import com.atinbo.member.model.LoginVO;
import com.atinbo.member.model.UserParam;

public interface ILoginService {


    /**
     * 用户登录
     *
     * @param userParam
     * @return
     */
    LoginVO login(UserParam userParam);

    /**
     * 微信用户登录
     *
     * @param userParam
     * @return
     */
    LoginVO wxLogin(UserParam userParam);
}
