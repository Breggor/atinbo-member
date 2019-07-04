package com.atinbo.member.entity;

import lombok.Data;

/**
 * 用户
 *
 * @author guojd 2015-11-30
 */
@Data
public class User {

    /**
     * 主键，自增长
     */
    private Long userId;

    /**
     * 用户名（app:mobile， thrid:openId，guest:device_id）
     */
    private String username;

    /**
     * 密码，MD5加密
     */
    private String password;

    /**
     * 用户来源（-3:sina， -2:qq， -1:weixin，0:guest，1:bcp）
     */
    private int userSource;

    /**
     * 唯一设备识别符
     */
    private String deviceId;

    /**
     * 微信统一用户帐号ID
     */
    private String wxUnionId;

    /**
     * 统一用户帐号ID
     */
    private String globalId;

    /**
     * 平台（1:android，2:ios）
     */
    private int platform;

    /**
     * 渠道来源
     */
    private String channel;

    /**
     * 用户注册版本号
     */
    private String version;
}
