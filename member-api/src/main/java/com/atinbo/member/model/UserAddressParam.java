package com.atinbo.member.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
@Setter
@Getter
@NoArgsConstructor
public class UserAddressParam implements Serializable {
    private Long id;

    private Long userId;

    private String phone;

    private String tel;

    private String receiver;

    private String province;//省

    private String city;//市

    private String district;//区

    private String address;//详细地址

    private String postCode;

    private Boolean isDefault;

    private Date createTime;

    private Byte deleted;

}
