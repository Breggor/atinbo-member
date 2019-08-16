package com.atinbo.member.service;

import com.atinbo.member.model.UserDetailBO;
import com.atinbo.member.model.UserDetailParam;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


@Service(version = "${member.service.version}")
public class MemberDetailServiceImpl implements IMemberDetailService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void saveOrUpdate(UserDetailParam param) {

    }

    @Override
    public void saveUserDetail(UserDetailParam userDetailParam) {

    }

    @Override
    public void updateFiveAndConstellation(UserDetailParam param) {

    }

    @Override
    public void deleteUserDetialByUserId(Long userId) {

    }

    @Override
    public UserDetailBO findUserDetailById(long userId) {
        return null;
    }

    @Override
    public List<String> findUserImageByUserIds(List<Long> userIds) {
        return null;
    }

    @Override
    public List<String> findUserImageByRandom(int total) {
        return null;
    }

    @Override
    public boolean judgeUserDetaiIsFullFinished(Long userId) {
        return false;
    }

    @Override
    public boolean validateNickName(String nickName) {
        return false;
    }

    @Override
    public List<String> findUserImageForProduct(Long productId) {
        return null;
    }

    @Override
    public String findUserImageByUserId(Long userId) {
        return null;
    }

    @Override
    public List<UserDetailBO> findUserDetailsListByPage() {
        return null;
    }

    @Override
    public List<UserDetailBO> findUserDetailsListByVirtualName() {
        return null;
    }

    @Override
    public List<Long> findUserIdList(String phone) {
        return null;
    }
}
