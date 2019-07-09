package com.atinbo.member.mapper;

import com.atinbo.member.model.UserAddressBO;

import java.util.List;

public interface AddressMapper {

    UserAddressBO findAddressById();

    List<UserAddressBO> findUserAddressListByUserId();
}
