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
 * 家庭成员
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "member_family")
@Where(clause = "deleted = 0")
@DynamicInsert
@DynamicUpdate
public class MemberFamily extends BaseEntity {

    /**
     * 标识
     */
    @Id
    private Long id;
    /**
     * 会员Id
     */
    private Long memberId;
    /**
     * 家人昵称
     */
    private String name;
    /**
     * 出生日期
     */
    private Date birthday;
    /**
     * 体重(kg)
     */
    private String weight;
    /**
     * 身高(cm)
     */
    private String height;

    /**
     * 性别，默认0女/1男
     */
    private Integer sex;
    /**
     * 头像地址
     */
    private String avatar;
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