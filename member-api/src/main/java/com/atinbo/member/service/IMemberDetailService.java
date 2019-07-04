package com.atinbo.member.service;

import com.atinbo.member.model.UserDetailParam;
import com.atinbo.member.model.UserDetailVO;

import java.util.List;

/**
 * 用户明细接口
 *
 * @author breggor
 */
public interface IMemberDetailService {

    /**
     * 完善/编辑个人信息
     *
     * @param param
     */
    void saveOrUpdate(UserDetailParam param);

    /**
     * 保存用户详细
     *
     * @param userDetailParam
     */
    void saveUserDetail(UserDetailParam userDetailParam);

    /**
     * 更新老用户五行和星座
     *
     * @param param
     */
    void updateFiveAndConstellation(UserDetailParam param);

    /**
     * 根据userId删除用户详情
     *
     * @param userId
     */
    void deleteUserDetialByUserId(Long userId);

    /**
     * 根据用户id查询用户资料信息
     *
     * @param userId
     * @return
     */
    UserDetailVO findUserDetailById(long userId);

    /**
     * 根据用户id查找用户头像
     *
     * @param userIds
     * @return
     */
    List<String> findUserImageByUserIds(List<Long> userIds);


    /**
     * 随机获取用户头像
     *
     * @param total
     * @return
     */
    List<String> findUserImageByRandom(int total);

    /**
     * 判断用户资料是否100%完成
     *
     * @param userId
     * @return
     */
    boolean judgeUserDetaiIsFullFinished(Long userId);


    /**
     * 校验用户昵称
     *
     * @param nickName
     * @return
     */
    boolean validateNickName(String nickName);


    /**
     * 商品随机获取10用户头像
     *
     * @param productId
     * @return
     */
    List<String> findUserImageForProduct(Long productId);

    /**
     * 根据用户id查找单个用户头像
     *
     * @param userId
     * @return
     */
    String findUserImageByUserId(Long userId);

    /**
     * 获取用户详情列表
     *
     * @return
     */
    List<UserDetailVO> findUserDetailsListByPage();

    /**
     * 获取虚拟用户详情列表
     *
     * @return
     */
    List<UserDetailVO> findUserDetailsListByVirtualName();

    /**
     * 根据手机号码获取用户ID列表
     *
     * @param phone 手机号码
     * @return
     */
    List<Long> findUserIdList(String phone);
}
