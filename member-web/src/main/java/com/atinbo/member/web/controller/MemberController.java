package com.atinbo.member.web.controller;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import com.atinbo.member.service.IAddressService;
import com.atinbo.member.web.model.ProductVO;
import com.atinbo.member.web.model.Success;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/members")
public class MemberController {

    @SofaReference(interfaceType = IAddressService.class, uniqueId = "${service.unique.id}", binding = @SofaReferenceBinding(bindingType = "bolt"))
    private IAddressService addressService;


    /**
     * 查询会员
     */
    @GetMapping
    @ResponseBody
    String query(@RequestBody String body) {
        return addressService.findAddressBy(1L).toString();
    }

    /**
     * 新建会员
     */
    @PostMapping
    @ResponseBody
    List<ProductVO> create(@RequestBody String body) {
        return null;
    }

    /**
     * 编辑会员
     */
    @PutMapping
    @ResponseBody
    Success edit(@RequestBody String body) {
        return null;
    }

    /**
     * BalanceMng的RPC代理为Web创建用户
     */
    @DeleteMapping
    @ResponseBody
    Success delete(@RequestBody String body) {
        return null;
    }
}