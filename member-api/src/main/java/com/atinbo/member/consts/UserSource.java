package com.atinbo.member.consts;

/**
 * 用户来源枚举
 *
 * @author guojd 2015-12-16
 */
public enum UserSource {
    WEIXIN_GONG_ZHONG_HAO_COMMISSION(-5),
    WEIXIN_GONG_ZHONG_HAO(-4),
    SINA(-3),
    QQ(-2),
    WEIXIN(-1),
    GUEST(0),
    BCP(1),
    DRP(2);

    private int userSource;

    private UserSource(int userSource) {
        this.userSource = userSource;
    }

    public int getValue() {
        return userSource;
    }
}
