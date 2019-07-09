package com.atinbo.member.mapper;

import com.atinbo.member.model.MemberVO;
import com.atinbo.member.model.UserBO;
import com.atinbo.member.model.UserDetailBO;
import com.atinbo.member.model.UserParam;

import java.util.List;

public interface MemberMapper {

    /**
     *1、 根据ID查询会员信息
     */
    MemberVO view(long memverID);

    /**
     *2、 查询会员信息
     */
    List<MemberVO> query(MemberVO memberVO);

    /**
     *3、 新建会员
     */
    void create(MemberVO memberVO);

    /**
     *4、编辑会员
     */
    void edit(MemberVO memberVO);

    /**
     * 5、删除会员
     */
    void delete(Long memberID);

}
