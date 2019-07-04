package com.atinbo.member.constants;

/**
 * 平台枚举
 *
 * @author guojd 2015-12-16
 */
public enum Platform {

    ANDROID(1),     //Android
    IOS(2),          //IOS
    WEIXIN(3),      //优品店
    DRP(4);         //分销系统

    private int platform;

    private Platform(int platform) {
        this.platform = platform;
    }

    public int getValue() {
        return platform;
    }
}
