package com.atinbo.member.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class MemberParam implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 登录名（app:mobile， thrid:openId，guest:deviceId）
     */
    private String loginName;

    /**
     * 密码，MD5加密
     */
    private String password;

    /**
     * 会员来源（1.weixin，2.qq）
     */
    private int source;

    /**
     * 唯一设备识别符
     */
    private String deviceId;

    /**
     * 微信开发平台unionId
     */
    private String wxUnionId;

    /**
     * 统一用户帐号ID
     */
    private String globalId;

    /**
     * 平台（1:android，2:ios）
     */
    private int plat;

    /**
     * 渠道来源
     */
    private String channel;
}
