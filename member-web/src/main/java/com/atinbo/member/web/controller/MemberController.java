package com.atinbo.member.web.controller;

import com.atinbo.dislock.annotation.DisLock;
import com.atinbo.dislock.annotation.LockKey;
import com.atinbo.dislock.constant.DisLockType;
import com.atinbo.member.model.MemberBO;
import com.atinbo.member.service.IMemberService;
import com.atinbo.member.web.model.MemberForm;
import com.atinbo.member.web.model.MemberQuery;
import com.atinbo.member.web.model.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/members")
public class MemberController {

    @Reference
    private IMemberService memberService;


    /**
     * 会员信息
     */
    @GetMapping("/{id}")
    MemberVO view(@PathVariable("id") Long id) {
        MemberBO one = memberService.findOne(1L);
        System.out.println("one = " + one);
        return null;
    }

    /**
     * 查询会员
     */
    @GetMapping
    @DisLock(lockType = DisLockType.MULTI, leaseTime = 30L, waitTime = 30L)
    @LockKey({"MemberQuery.memberId", "MemberQuery.memberName"})
    List<MemberVO> query(@RequestBody MemberQuery query) {
        List<MemberVO> mbs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            mbs.add(new MemberVO().setAge(i));
        }
        return mbs;
    }

    /**
     * 新建会员
     */
    @PostMapping
    MemberVO create(@RequestBody @Valid MemberForm form) {
        log.info("form={}", form);
        return new MemberVO();
    }

    /**
     * 编辑会员
     */
    @PutMapping("/{id}")
    MemberVO edit(@PathVariable("id") Long id, @RequestBody MemberForm form) {
        return null;
    }

    /**
     * 删除会员
     */
    @DeleteMapping("/{id}")
    void delete(@PathVariable("id") Long id) {

    }
}