package com.atinbo.member.service;

import com.atinbo.member.model.UserFamilyParam;
import com.atinbo.member.model.UserFamilyVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户家人操作service实现
 *
 * @author fangqy
 * @date 2016年4月19日 上午10:50:25
 */
@Service("userFamilyService")
public class UserFamilyServiceImpl implements IUserFamilyService {


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
