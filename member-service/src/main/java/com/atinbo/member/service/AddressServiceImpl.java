package com.atinbo.member.service;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import com.atinbo.member.mapper.AddressMapper;
import com.atinbo.member.model.UserAddressBO;
import com.atinbo.member.model.UserAddressParam;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * 会员收货地址
 *
 * @author breggor
 */
@Service
@SofaService(interfaceType = IAddressService.class, uniqueId = "${service.unique.id}", bindings = {@SofaServiceBinding(bindingType = "bolt")})
public class AddressServiceImpl implements IAddressService {
    @Resource
    AddressMapper addressMapper;

    /**
     * 查询用户的地址
     * @param memberId
     * @return
     */
    @Override
    public UserAddressBO findAddressBy(Long memberId) {
        UserAddressBO result = addressMapper.findAddressById();
        return result;
    }

    /**
     * 查询用户的
     * @param list
     * @return
     */
    @Override
    public List<UserAddressBO> findUserAddressListByUserId(List<Long> list) {
        List<UserAddressBO> userAddressList=addressMapper.findUserAddressListByUserId();
        return userAddressList;
    }

    @Override
    public UserAddressBO findDefaultAddressByUserId(List<Long> list) {
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
