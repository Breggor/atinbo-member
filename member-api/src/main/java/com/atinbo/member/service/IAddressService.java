package com.atinbo.member.service;

import com.atinbo.member.model.UserAddressParam;
import com.atinbo.member.model.UserAddressVO;

import java.util.List;

/**
 * 用户地址查询service接口
 *
 * @author fangqy
 * @date 2016年4月18日 下午3:40:50
 */
public interface IAddressService {


    /**
     * 获取单个地址接口
     *
     * @param id
     * @author fangqy
     */
    UserAddressVO findUserAddressById(Long id);

    /**
     * 获取地址列表接口
     *
     * @param list
     */
    List<UserAddressVO> findUserAddressListByUserId(List<Long> list);

    /**
     * 获取用户默认收货地址
     *
     * @param list
     */
    UserAddressVO findDefaultAddressByUserId(List<Long> list);

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
