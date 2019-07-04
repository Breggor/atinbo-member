package com.atinbo.member.service;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import com.atinbo.member.model.UserAddressParam;
import com.atinbo.member.model.UserAddressVO;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@SofaService(interfaceType = IAuthorizeService.class, uniqueId = "${service.unique.id}", bindings = {@SofaServiceBinding(bindingType = "bolt")})
public class AddressServiceImpl implements IAddressService {


    @Override
    public UserAddressVO findUserAddressById(Long id) {
        return null;
    }

    @Override
    public List<UserAddressVO> findUserAddressListByUserId(List<Long> list) {
        return null;
    }

    @Override
    public UserAddressVO findDefaultAddressByUserId(List<Long> list) {
        return null;
    }

    @Override
    public String findNewestAddress(List<Long> list) {
        return null;
    }

    @Override
    public Long saveOrUpdate(UserAddressParam param, List<Long> list) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void updateDefaultStatus(String id) {

    }
}
