package com.atinbo.member.constants;

/**
 * 登录方式枚举
 *
 * @author guojd 2015-12-16
 */
public enum LoginMode {

    NORMAL("1"),
    PHONE_VERIFYCODE("2");

    private String loginMode;

    private LoginMode(String loginMode) {
        this.loginMode = loginMode;
    }

    public String getValue() {
        return loginMode;
    }
}
