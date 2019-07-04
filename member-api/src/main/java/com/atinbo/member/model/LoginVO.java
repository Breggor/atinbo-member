package com.atinbo.member.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
public class LoginVO implements Serializable {
    /**
     * openId
     */
    private String openId;
    /**
     * 是否第一次登陆
     */
    private boolean isFirstLogin;
    /**
     * 是否绑定手机
     */
    private boolean isBindPhone;

}
