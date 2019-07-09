package com.atinbo.member.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.atinbo.member.mapper.MemberMapper;
import com.atinbo.member.model.MemberBO;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MemberServiceImpl01 implements IMemberService {
    @Resource
    MemberMapper memberMapper;
    @Override
    public MemberBO view(Long memberID) {
        MemberBO view = memberMapper.view(memberID);
        return view;
    }

    @Override
    public List<MemberBO> query(MemberBO memberVO) {
        return query(memberVO);
    }


    @Override
    public void create(MemberBO memberVO) {
       memberMapper.create(memberVO);
    }

    @Override
    public void edit(MemberBO memberID) {
    memberMapper.edit(memberID);
    }

    @Override
    public void delete(Long memberID) {
    memberMapper.delete(memberID);
    }
}
