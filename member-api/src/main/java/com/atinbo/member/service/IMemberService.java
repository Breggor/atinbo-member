package com.atinbo.member.service;

import com.atinbo.member.model.MemberBO;
import com.atinbo.member.model.MemberParam;
import java.util.List;

/**
 * 会员业务接口
 * @author 陈路嘉
 */
public interface IMemberService {
    /**
     * 查找一个会员信息
     * @param memberId
     * @return
     */
    MemberBO findOne(Long memberId);

    /**
     * 查找会员的信息
     * @param param
     * @return
     */
    List<MemberBO> findAll(MemberParam param);

    /**
     * 创建一个会员
     * @param param
     * @return
     */
    MemberBO create(MemberParam param);

    /**
     * 修改一个会员
     * @param param
     * @return
     */
    MemberBO edit(MemberParam param);

    /**
     * 删除会员信息
     * @param id
     * @return
     */
    boolean delete(Long id);
}
