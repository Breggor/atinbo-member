package com.atinbo.member.service;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import com.atinbo.member.model.UserFamilyParam;
import com.atinbo.member.model.UserFamilyBO;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@SofaService(interfaceType = IMemberFamilyService.class, uniqueId = "${service.unique.id}", bindings = {@SofaServiceBinding(bindingType = "bolt")})
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
