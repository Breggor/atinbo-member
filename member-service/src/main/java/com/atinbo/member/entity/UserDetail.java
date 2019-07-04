package com.atinbo.member.entity;


import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;


public class UserDetail {

    /**
     * 用户ID
     */
    private Long userId;
    /**
     * 用户昵称
     */
    private String nickName;
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
     * 是否是手环用户 1-是 0-否
     */
    private Boolean isBracelet;
    /**
     * 家乡市级
     */
    private String homeCity;
    /**
     * 家乡所在区
     */
    private String homeDistrict;
    /**
     * 五行名称
     */
    private String fiveName;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 时辰
     */
    private String hour;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity == null ? null : ethnicity.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getZodiac() {
        return zodiac;
    }

    public void setZodiac(String zodiac) {
        this.zodiac = zodiac == null ? null : zodiac.trim();
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation == null
                ? null
                : constellation.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood == null ? null : blood.trim();
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height == null ? null : height.trim();
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    public String getHomeProvince() {
        return homeProvince;
    }

    public void setHomeProvince(String homeProvince) {
        this.homeProvince = homeProvince == null ? null : homeProvince.trim();
    }

    public Boolean getIsBracelet() {
        return isBracelet;
    }

    public void setIsBracelet(Boolean isBracelet) {
        this.isBracelet = isBracelet;
    }

    public String getHomeCity() {
        return homeCity;
    }

    public void setHomeCity(String homeCity) {
        this.homeCity = homeCity == null ? null : homeCity.trim();
    }

    public String getHomeDistrict() {
        return homeDistrict;
    }

    public void setHomeDistrict(String homeDistrict) {
        this.homeDistrict = homeDistrict == null ? null : homeDistrict.trim();
    }

    public String getFiveName() {
        return fiveName;
    }

    public void setFiveName(String fiveName) {
        this.fiveName = fiveName == null ? null : fiveName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour == null ? null : hour.trim();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("userId", userId)
                .append("nickName", nickName)
                .append("realname", realname)
                .append("avatar", avatar)
                .append("sex", sex)
                .append("ethnicity", ethnicity)
                .append("phone", phone)
                .append("email", email)
                .append("qq", qq)
                .append("birthday", birthday)
                .append("zodiac", zodiac)
                .append("constellation", constellation)
                .append("signature", signature)
                .append("blood", blood)
                .append("height", height)
                .append("weight", weight)
                .append("homeProvince", homeProvince)
                .append("isBracelet", isBracelet)
                .append("homeCity", homeCity)
                .append("homeDistrict", homeDistrict)
                .append("fiveName", fiveName)
                .append("createTime", createTime)
                .append("updateTime", updateTime)
                .append("hour", hour)
                .toString();
    }
}