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

/**
 * 会员地址
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "address")
@Where(clause = "deleted = 0")
@DynamicInsert
@DynamicUpdate
public class Address extends BaseEntity {


    @Id
    private Long id;

    /**
     * 会员Id
     */
    private Long memberId;

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
    private String city;

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
    private boolean isDefault;
}