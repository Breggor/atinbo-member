package com.atinbo.member.service;

import com.atinbo.member.model.UserParam;
import com.atinbo.member.model.UserVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 会员接口实现类
 */
@Service("memberServiceImpl")
public class MemberServiceImpl implements IMemberService {
    @Override
    public String findPhone(Long userId, String wxUnionId) {
        return null;
    }

    @Override
    public boolean checkLoginNamePassword(String loginName, String password) {
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
