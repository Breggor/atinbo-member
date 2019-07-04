package com.atinbo.member.service;

import com.atinbo.member.model.UserDetailParam;
import com.atinbo.member.model.UserDetailVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户资料操作service实现
 *
 * @author fangqy
 * @date 2016年4月18日 下午2:50:41
 */
@Service("userDetailService")
public class UserDetailServiceImpl implements IUserDetailService {

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
    public UserDetailVO findUserDetailById(long userId) {
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
    public List<UserDetailVO> findUserDetailsListByPage() {
        return null;
    }

    @Override
    public List<UserDetailVO> findUserDetailsListByVirtualName() {
        return null;
    }

    @Override
    public List<Long> findUserIdList(String phone) {
        return null;
    }
}
