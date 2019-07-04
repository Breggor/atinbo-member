package com.atinbo.member.model;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class UserDetailVO implements Serializable {
    private Long userId;

    private String nickName;

    private String realname;

    private String avatar;

    private Integer sex;

    private String ethnicity;

    private String phone;

    private String email;

    private String qq;

    private Date birthday;

    private String hour;

    private String zodiac;

    private String constellation;

    private String signature;

    private String blood;

    private String height;

    private String weight;

    private String homeProvince;

    private String homeCity;

    private String homeDistrict;

    private String fiveName;

    private Date createTime;

    private Date updateTime;

    private Boolean isBracelet;
}
