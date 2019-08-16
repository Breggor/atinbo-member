package com.atinbo.member.service;


import com.atinbo.member.model.MemberBO;
import com.atinbo.member.model.MemberParam;
import org.apache.dubbo.config.annotation.Service;

import java.util.List;


@Service(version = "${member.service.version}")
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
