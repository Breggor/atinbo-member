package com.atinbo.member.entity;

import java.util.Date;

/**
 * 用户信息
 */
public class UserInfo {
    /**
     * id
     */
    private Long id;

    /**
     * 账号
     */
    private String account;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 密码
     */
    private String password;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 类型
     */
    private Integer type;

    /**
     * vip
     */
    private Integer vip;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 授权
     */
    private String accessToken;

    /**
     * 授权key
     */
    private String accessTokenKey;

    /**
     * 注册日期
     */
    private Date registerDt;

    /**
     * 注册Ip
     */
    private String registerIp;

    /**
     * 修改时间
     */
    private Date updatePwTime;

    /**
     * 更新时间
     */
    private Long updateDt;

    /**
     * 来源类型
     */
    private String sourceType;

    /**
     *
     */
    private String gid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getVip() {
        return vip;
    }

    public void setVip(Integer vip) {
        this.vip = vip;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken == null ? null : accessToken.trim();
    }

    public String getAccessTokenKey() {
        return accessTokenKey;
    }

    public void setAccessTokenKey(String accessTokenKey) {
        this.accessTokenKey = accessTokenKey == null ? null : accessTokenKey.trim();
    }

    public Date getRegisterDt() {
        return registerDt;
    }

    public void setRegisterDt(Date registerDt) {
        this.registerDt = registerDt;
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp == null ? null : registerIp.trim();
    }

    public Date getUpdatePwTime() {
        return updatePwTime;
    }

    public void setUpdatePwTime(Date updatePwTime) {
        this.updatePwTime = updatePwTime;
    }

    public Long getUpdateDt() {
        return updateDt;
    }

    public void setUpdateDt(Long updateDt) {
        this.updateDt = updateDt;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType == null ? null : sourceType.trim();
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }
}