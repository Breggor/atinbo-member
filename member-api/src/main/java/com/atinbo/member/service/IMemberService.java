package com.atinbo.member.service;

import com.atinbo.member.model.UserParam;
import com.atinbo.member.model.UserVO;

import java.util.List;

/**
 * 会员接口
 *
 * @author breggor
 */
public interface IMemberService {


    /**
     * 微信公众号账号是否绑定了手机，如果已经绑定了手机， 如果绑定了手机，返回对应的手机号码，否则返回null。
     *
     * @param userId
     * @param wxUnionId
     * @return String
     * @version
     */
    String findPhone(Long userId, String wxUnionId);

    /**
     * 检测登录密码
     *
     * @param loginName 用户名
     * @param password  密码
     * @return boolean
     */
    boolean checkLoginNamePassword(String loginName, String password);

    /**
     * 获取用户信息
     *
     * @param username 用户名
     * @return
     */
    UserVO findByUsername(String username);

    /**
     * 获取用户信息
     *
     * @param userId 用户ID
     * @return
     */
    UserVO findByUserId(Long userId);

    /**
     * 根据wxUnionId获取关联账号信息，且优先返回APP微信账户
     *
     * @param wxUnionId 微信统一用户帐号ID
     * @return UserVO
     * @version 1.1.0(5.3.10)
     */
    UserVO findByWxUnionId(String wxUnionId);

    /**
     * 校验当前手机号能否继续获取验证码
     *
     * @param phone
     * @param type
     * @return
     */
    int checkVerifyCode(String phone, Integer type);

    /**
     * 根据统一用户帐号ID获取所有关联的userId
     *
     * @param globalId
     * @return
     * @version
     */
    List<Long> findUserIdsByGlobalId(String globalId);

    /**
     * 生成验证码
     *
     * @param phone 手机号
     * @return
     */
    String generateCode(String phone);

    /**
     * 验证码较验
     *
     * @param phone 手机号
     * @param code  验证码
     * @return
     */
    boolean validate(String phone, String code);


    /**
     * 禁用用户信息
     *
     * @param ids
     */
    void updateUserInfo(String ids);

    /**
     * 添加用户
     *
     * @param userParam 用户基本信息
     * @return
     */
    UserVO addUser(UserParam userParam);

    /**
     * 补全微信统一用户帐号ID
     *
     * @param userId
     * @param wxUnionId
     * @return
     * @version 1.1.0(5.3.10)
     */
    void updateUnionId(Long userId, String wxUnionId);

    /**
     * 绑定用户手机号码
     *
     * @param userId
     * @param phone
     * @return
     * @version 1.1.0(5.3.10)
     */
    void bindphone(Long userId, String phone);

    /**
     * @param @param userId 用户id
     * @param @param newPassword  新密码
     * @return void
     * @throws
     * @Title: updatePassword
     * @Description: 修改用户密码
     * @author fangqy
     */
    void updatePassword(UserVO userVO);

    /**
     * 更新用户信息
     *
     * @param userId   用户ID
     * @param deviceId 用户来源
     * @param deviceId 唯一设备识别符
     * @param platform 平台
     * @param channel  渠道
     */
    void updateUserByUserId(Long userId, String deviceId, int platform, String channel);

    /**
     * 根据userId删除用户
     *
     * @param userId
     */
    void deleteUserByUserId(Long userId);

    /**
     * 注册App用户
     *
     * @param version
     * @param platform
     * @param phone
     * @param userSource
     */
    Long registerAppUser(String version, int platform, String phone, String userSource);
}
