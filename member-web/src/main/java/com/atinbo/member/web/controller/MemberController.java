package com.atinbo.member.web.controller;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import com.atinbo.member.service.IAddressService;
import com.atinbo.member.web.model.BalanceResponse;
import com.atinbo.member.web.model.ProductVO;
import com.atinbo.member.web.model.Success;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/")
public class MemberController {

    @SofaReference(interfaceType = IAddressService.class, uniqueId = "${service.unique.id}", binding = @SofaReferenceBinding(bindingType = "bolt"))
    private IAddressService addressService;

    /**
     * 查询商品信息
     */
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    @ResponseBody
    String query(@RequestBody String body) {
        return addressService.findAddressBy(1L).toString();
    }

    /**
     * 查询排序后的商品信息（演示动态模块）
     */
    @RequestMapping(value = "/querySorted", method = RequestMethod.POST)
    @ResponseBody
    List<ProductVO> querySorted(@RequestBody String body) {
        return null;
    }

    /**
     * 购买
     */
    @RequestMapping(value = "/purchase", method = RequestMethod.POST)
    @ResponseBody
    Success purchase(@RequestBody String body) {
        return null;
    }

    /**
     * BalanceMng的RPC代理为Web创建用户
     */
    @RequestMapping(value = "/createUser", method = RequestMethod.POST)
    @ResponseBody
    Success createUser(@RequestBody String body) {
        return null;
    }

    /**
     * BalanceMng的RPC代理为Web查询余额
     */
    @RequestMapping(value = "/queryBalance", method = RequestMethod.POST)
    @ResponseBody
    BalanceResponse queryBalance(@RequestBody String body) {
        return null;
    }
}