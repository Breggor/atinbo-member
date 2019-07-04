package com.atinbo.member.entity;

import lombok.Data;

import java.util.Date;

/**
 * 用户地址
 */
@Data
public class UserAddress {

    /**
     * 标识
     */
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 固定电话
     */
    private String tel;

    /**
     * 收货人
     */
    private String receiver;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;//市

    /**
     * 区
     */
    private String district;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 邮编
     */
    private String postCode;

    /**
     * 默认地址为1
     */
    private Boolean isDefault;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 删除标记 0-删除 1-未删除
     */
    private Byte deleted;
}