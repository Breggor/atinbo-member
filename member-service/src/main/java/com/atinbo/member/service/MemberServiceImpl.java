package com.atinbo.member.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.atinbo.member.model.MemberBO;
import com.atinbo.member.model.MemberParam;

import java.util.List;


@Service
public class MemberServiceImpl implements IMemberService {

    @Override
    public MemberBO findOne(Long memberId) {
        return null;
    }

    @Override
    public List<MemberBO> findAll(MemberParam param) {
        return null;
    }

    @Override
    public MemberBO create(MemberParam param) {
        return null;
    }

    @Override
    public MemberBO edit(MemberParam param) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
