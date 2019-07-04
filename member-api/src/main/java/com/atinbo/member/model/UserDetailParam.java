package com.atinbo.member.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class UserDetailParam implements Serializable {
    public Long userId;

    public String nickName;

    public String realname;

    public String avatar;

    public Integer sex;

    public String ethnicity;

    public String phone;

    public String email;

    public String qq;

    public Date birthday;

    public String hour;

    public String zodiac;

    public String constellation;

    public String signature;

    public String blood;

    public String height;

    public String weight;

    public String homeProvince;

    public String homeCity;

    public String homeDistrict;

    public String fiveName;

    public Date createTime;

    public Date updateTime;

    private Boolean isBracelet;
}
