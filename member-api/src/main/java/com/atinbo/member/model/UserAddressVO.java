package com.atinbo.member.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class UserAddressVO implements Serializable {
    private Long id;

    private Long userId;

    private String phone;

    private String tel;

    private String receiver;

    private String province;

    private String city;//市

    private String district;

    private String address;

    private String postCode;

    private Boolean isDefault;

    private Date createTime;

    private Byte deleted;

    private String fee;//地址对应的邮费
}
