package com.atinbo.member.web.controller;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import com.atinbo.member.model.MemberQuery;
import com.atinbo.member.service.IMemberService;
import com.atinbo.member.web.model.MemberForm;
import com.atinbo.member.web.model.MemberVO;
import com.atinbo.member.web.model.Success;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/members")
public class MemberController {

    @SofaReference(interfaceType = IMemberService.class, uniqueId = "${service.unique.id}", binding = @SofaReferenceBinding(bindingType = "bolt"))
    private IMemberService memberService;


    /**
     * 会员信息
     */
    @GetMapping("/{id}")
    @ResponseBody
    MemberVO view(@PathVariable("id") Long id) {
        return null;
    }

    /**
     * 查询会员
     */
    @GetMapping
    @ResponseBody
    List<MemberVO> query(@RequestBody MemberQuery query) {
        return null;
    }

    /**
     * 新建会员
     */
    @PostMapping
    @ResponseBody
    MemberVO create(@RequestBody MemberForm form) {
        return null;
    }

    /**
     * 编辑会员
     */
    @PutMapping("/{id}")
    @ResponseBody
    MemberVO edit(@PathVariable("id") Long id, @RequestBody MemberForm form) {
        return null;
    }

    /**
     * 删除会员
     */
    @DeleteMapping("/{id}")
    @ResponseBody
    Success delete(@PathVariable("id") Long id) {
        return null;
    }
}