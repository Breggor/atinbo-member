package com.atinbo.member.model;

import lombok.Data;


@Data
public class UserParam implements java.io.Serializable {

    private String clientId;
    private String clientSecret;
    private String username;

    private String password;
    private int userSource;
    private String deviceId;
    private int platform;

    private String nickname;
    private String avatar;
    private String wxUnionId;
    private String channel;
    private String version;
    private String verifyCode;
}
