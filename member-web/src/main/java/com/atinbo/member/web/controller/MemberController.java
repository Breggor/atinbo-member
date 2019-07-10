package com.atinbo.member.web.controller;

import com.atinbo.member.model.MemberQuery;
import com.atinbo.member.web.model.MemberForm;
import com.atinbo.member.web.model.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/members")
public class MemberController {

//    @SofaReference(interfaceType = IMemberService.class, uniqueId = "${service.unique.id}", binding = @SofaReferenceBinding(bindingType = "bolt"))
//    private IMemberService memberService;


    /**
     * 会员信息
     */
    @GetMapping("/{id}")
    MemberVO view(@PathVariable("id") Long id) {
        return null;
    }

    /**
     * 查询会员
     */
    @GetMapping
    List<MemberVO> query(@RequestBody MemberQuery query) {
        return null;
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