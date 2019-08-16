package com.atinbo.member.service;

import com.atinbo.member.model.UserAddressBO;
import com.atinbo.member.model.UserAddressParam;
import org.apache.dubbo.config.annotation.Service;

import java.util.List;

/**
 * 会员收货地址
 *
 * @author breggor
 */
@Service(version = "${member.service.version}")
public class AddressServiceImpl implements IAddressService {

    @Override
    public UserAddressBO findAddressBy(Long memberId) {
        return null;
    }

    @Override
    public List<UserAddressBO> findUserAddressListByUserId(List<Long> list) {
        return null;
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
