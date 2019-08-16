package com.atinbo.member.service;

import com.atinbo.member.model.UserFamilyBO;
import com.atinbo.member.model.UserFamilyParam;
import org.apache.dubbo.config.annotation.Service;

import java.util.List;


@Service(version = "${member.service.version}")
public class MemberFamilyServiceImpl implements IMemberFamilyService {


    @Override
    public void saveOrUpdate(UserFamilyParam param) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public UserFamilyBO findUserFamilyById(Long id) {
        return null;
    }

    @Override
    public List<UserFamilyBO> findUserFamilyListByUserId(long userId) {
        return null;
    }
}
