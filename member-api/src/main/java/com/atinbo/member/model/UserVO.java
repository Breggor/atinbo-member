package com.atinbo.member.model;

import lombok.Data;

import java.io.Serializable;


@Data
public class UserVO implements Serializable {

    private Long userId;
    private String username;
    private String password;
    private int userSource;
    private String deviceId;
    private String wxUnionId;
    private String globalId;
    private int platform;
    private String channel;

    private String rtnOpenId;
    private String rtnNickname;
    private String rtnPhone;
}
