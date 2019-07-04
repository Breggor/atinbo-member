package com.atinbo.member.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class UserFamilyParam implements Serializable {
    private Long id;

    private Long userId;

    private String relationshipName;

    private Date birthday;

    private String hour;

    private String weight;

    private String height;

    private Date createTime;

    private String fiveName;

    private String constellation;

    private Integer sex;

    private String avatar;

    private String homeProvince;

    private String homeCity;

    private String homeDistrict;

    private Boolean deleted;
}