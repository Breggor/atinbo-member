package com.atinbo.member.entity;

import java.util.Date;

public class UserFamily {

    /**
     * 标识
     */
    private Long id;
    /**
     *用户uid
     */
    private Long userId;
    /**
     *家人昵称
     */
    private String relationshipName;
    /**
     *出生日期
     */
    private Date birthday;
    /**
     *体重(kg)
     */
    private String weight;
    /**
     *身高(cm)
     */
    private String height;
    /**
     *添加日期
     */
    private Date createTime;
    /**
     *五行名称
     */
    private String fiveName;
    /**
     *星座
     */
    private String constellation;
    /**
     *性别，默认0女/1男
     */
    private Integer sex;
    /**
     *头像地址
     */
    private String avatar;
    /**
     *家乡省份
     */
    private String homeProvince;
    /**
     *家乡市级
     */
    private String homeCity;
    /**
     *家乡所在区
     */
    private String homeDistrict;
    /**
     *删除标记 0-删除 1-未删除
     */
    private Boolean deleted;
    /**
     *时辰
     */
    private String hour;
    /**
     *修改时间
     */
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getRelationshipName() {
        return relationshipName;
    }

    public void setRelationshipName(String relationshipName) {
        this.relationshipName = relationshipName == null
                ? null
                : relationshipName.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height == null ? null : height.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getFiveName() {
        return fiveName;
    }

    public void setFiveName(String fiveName) {
        this.fiveName = fiveName == null ? null : fiveName.trim();
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation == null
                ? null
                : constellation.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getHomeProvince() {
        return homeProvince;
    }

    public void setHomeProvince(String homeProvince) {
        this.homeProvince = homeProvince == null ? null : homeProvince.trim();
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

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour == null ? null : hour.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}