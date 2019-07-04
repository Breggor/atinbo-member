package com.atinbo.member.exception;

public class UserBizException extends RuntimeException {

    /**
     * 构造函数
     */
    public UserBizException() {
        super();
    }

    /**
     * 构造函数
     *
     * @param message 异常信息
     * @param cause   异常类
     */
    public UserBizException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * 构造函数
     *
     * @param message 异常信息
     */
    public UserBizException(String message) {
        super(message);
    }

    /**
     * 构造函数
     *
     * @param cause 异常类
     */
    public UserBizException(Throwable cause) {
        super(cause);
    }
}
