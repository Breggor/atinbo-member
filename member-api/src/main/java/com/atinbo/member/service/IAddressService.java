package com.atinbo.member.service;

import com.atinbo.member.model.UserAddressParam;
import com.atinbo.member.model.UserAddressBO;

import java.util.List;

/**
 * 会员地址接口
 *
 * @author breggor
 */
public interface IAddressService {


    /**
     * 获取单个地址接口
     *
     * @param memberId
     * @author fangqy
     */
    UserAddressBO findAddressBy(Long memberId);

    /**
     * 获取地址列表接口
     *
     * @param list
     */
    List<UserAddressBO> findUserAddressListByUserId(List<Long> list);

    /**
     * 获取用户默认收货地址
     *
     * @param list
     */
    UserAddressBO findDefaultAddressByUserId(List<Long> list);

    /**
     * 获取最新一条地址
     *
     * @param list
     * @return
     */
    String findNewestAddress(List<Long> list);


    /**
     * 新增\编辑地址接口
     *
     * @param list
     * @param list 用户所有的身份id
     * @Description:
     */
    Long saveOrUpdate(UserAddressParam param, List<Long> list);

    /**
     * 删除地址接口
     *
     * @param
     * @author fangqy
     */
    void delete(Long id);

    /**
     * 设置默认地址
     *
     * @param id
     * @return void
     * @author fangqy
     */
    void updateDefaultStatus(String id);
}
