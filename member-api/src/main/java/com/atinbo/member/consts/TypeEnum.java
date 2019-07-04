package com.atinbo.member.consts;

/**
 * @author chenxl
 * @version 5.3.40
 * @date 2017/5/4 17:04
 */
public enum TypeEnum {

    //注册
    REGISTER(0),
    //频率过快
    FREQUENCYFAST(2),
    //新增验证码次数
    INCRNUM(1),
    //登录
    LOGIN(2),
    //验证码次数超过范围
    OVERRANGE(3);

    private int type;

    TypeEnum(int type) {
        this.type = type;
    }

    public int getValue() {
        return type;
    }
}
