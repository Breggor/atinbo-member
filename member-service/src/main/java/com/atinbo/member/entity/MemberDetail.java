package com.atinbo.member.entity;


import com.atinbo.member.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 会员明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "member_detail")
@Where(clause = "deleted = 0")
@DynamicInsert
@DynamicUpdate
public class MemberDetail extends BaseEntity {

    /**
     * 会员Id
     */
    @Id
    private Long id;
    /**
     * 用户昵称
     */
    private String nickname;
    /**
     * 真实姓名
     */
    private String realname;
    /**
     * 用户头像
     */
    private String avatar;
    /**
     * 性别（0:女, 1:男）
     */
    private Integer sex;
    /**
     * 民族
     */
    private String ethnicity;
    /**
     * 手机号码
     */
    private String phone;
    /**
     * 用户邮箱
     */
    private String email;
    /**
     * QQ
     */
    private String qq;
    /**
     * 生日
     */
    private Date birthday;
    /**
     * 生肖
     */
    private String zodiac;
    /**
     * 星座
     */
    private String constellation;
    /**
     * 个性签名
     */
    private String signature;
    /**
     * 血型ABO
     */
    private String blood;
    /**
     * 身高CM
     */
    private String height;
    /**
     * 体重
     */
    private String weight;
    /**
     * 家乡省份
     */
    private String homeProvince;
    /**
     * 家乡市级
     */
    private String homeCity;
    /**
     * 家乡所在区
     */
    private String homeDistrict;
}