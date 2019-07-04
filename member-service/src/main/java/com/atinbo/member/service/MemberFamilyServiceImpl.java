package com.atinbo.member.service;

import com.atinbo.member.model.UserFamilyParam;
import com.atinbo.member.model.UserFamilyVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 会员家庭成员
 *
 * @author breggor
 */
@Service("memberFamilyService")
public class MemberFamilyServiceImpl implements IMemberFamilyService {


    @Override
    public void saveOrUpdate(UserFamilyParam param) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public UserFamilyVO findUserFamilyById(Long id) {
        return null;
    }

    @Override
    public List<UserFamilyVO> findUserFamilyListByUserId(long userId) {
        return null;
    }
}
