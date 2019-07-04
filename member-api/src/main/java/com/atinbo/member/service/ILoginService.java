package com.atinbo.member.service;

import com.atinbo.member.model.LoginBO;
import com.atinbo.member.model.UserParam;

public interface ILoginService {


    /**
     * 用户登录
     *
     * @param userParam
     * @return
     */
    LoginBO login(UserParam userParam);

    /**
     * 微信用户登录
     *
     * @param userParam
     * @return
     */
    LoginBO wxLogin(UserParam userParam);
}
