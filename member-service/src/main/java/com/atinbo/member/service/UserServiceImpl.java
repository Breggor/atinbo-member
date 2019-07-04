package com.atinbo.member.service;

import com.atinbo.member.model.UserParam;
import com.atinbo.member.model.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户实现
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public String findPhoneByWeixinGongZhongHao(Long userId, String wxUnionId) {
        return null;
    }

    @Override
    public boolean checkUsernamePassword(String username, String password) {
        return false;
    }

    @Override
    public UserVO findByUsername(String username) {
        return null;
    }

    @Override
    public UserVO findByUserId(Long userId) {
        return null;
    }

    @Override
    public UserVO findByWxUnionId(String wxUnionId) {
        return null;
    }

    @Override
    public int checkVerifyCode(String phone, Integer type) {
        return 0;
    }

    @Override
    public List<Long> findUserIdsByGlobalId(String globalId) {
        return null;
    }

    @Override
    public String generateCode(String phone) {
        return null;
    }

    @Override
    public boolean validate(String phone, String code) {
        return false;
    }

    @Override
    public void updateUserInfo(String ids) {

    }

    @Override
    public UserVO addUser(UserParam userParam) {
        return null;
    }

    @Override
    public void updateUnionId(Long userId, String wxUnionId) {

    }

    @Override
    public void bindphone(Long userId, String phone) {

    }

    @Override
    public void updatePassword(UserVO userVO) {

    }

    @Override
    public void updateUserByUserId(Long userId, String deviceId, int platform, String channel) {

    }

    @Override
    public void deleteUserByUserId(Long userId) {

    }

    @Override
    public Long registerAppUser(String version, int platform, String phone, String userSource) {
        return null;
    }
}
