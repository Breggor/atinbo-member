package com.atinbo.member.entity;

import com.atinbo.member.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 会员用户
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "member")
@Where(clause = "deleted = 0")
@DynamicInsert
@DynamicUpdate
public class Member extends BaseEntity {

    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 登录名（app:mobile， thrid:openId，guest:deviceId）
     */
    @Column(columnDefinition = "varchar(50) default null comment '登录名'")
    private String loginName;

    /**
     * 密码，MD5加密
     */
    @Column(columnDefinition = "varchar(80) default null comment '密码'")
    private String password;

    /**
     * 会员来源（1.weixin，2.qq）
     */
    @Column(columnDefinition = "tinyint default null comment '会员来源'")
    private int source;

    /**
     * 唯一设备识别符
     */
    @Column(columnDefinition = "varchar(50) default null comment '设备标识符'")
    private String deviceId;

    /**
     * 微信开发平台unionId
     */
    @Column(columnDefinition = "varchar(50) default null comment '微信开发平台unionId'")
    private String wxUnionId;

    /**
     * 统一用户帐号ID
     */
    @Column(columnDefinition = "varchar(50) default null comment '统一用户帐号ID'")
    private String globalId;

    /**
     * 平台（1:android，2:ios）
     */
    @Column(columnDefinition = "tinyint default null comment '平台（1:android，2:ios)'")
    private int plat;

    /**
     * 渠道来源
     */
    @Column(columnDefinition = "varchar(80) default null comment '渠道来源'")
    private String channel;
}
