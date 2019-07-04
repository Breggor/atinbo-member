package com.atinbo.member.service;

import com.atinbo.member.model.UserFamilyParam;
import com.atinbo.member.model.UserFamilyVO;

import java.util.List;

/**
 * 用户家人操作service接口
 *
 * @author fangqy
 * @date 2016年4月18日 下午4:26:11
 */
public interface IUserFamilyService {

    /**
     * 新增\编辑家人接口
     *
     * @param param
     */
    void saveOrUpdate(UserFamilyParam param);

    /**
     * 删除家人接口
     *
     * @param id
     */
    void delete(Long id);


    /**
     * 获取单个家人接口
     *
     * @param id
     * @return
     */
    UserFamilyVO findUserFamilyById(Long id);

    /**
     * 获取家人列表接口
     *
     * @param userId 用户ID
     * @return
     */
    List<UserFamilyVO> findUserFamilyListByUserId(long userId);

}
