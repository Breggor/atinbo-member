package com.atinbo.member.web.controller;

import com.atinbo.member.web.model.BalanceResponse;
import com.atinbo.member.web.model.ProductVO;
import com.atinbo.member.web.model.Success;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@RequestMapping("/")
public interface MemberController {

    /**
     * 查询商品信息
     */
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    @ResponseBody
    List<ProductVO> query(@RequestBody String body);

    /**
     * 查询排序后的商品信息（演示动态模块）
     */
    @RequestMapping(value = "/querySorted", method = RequestMethod.POST)
    @ResponseBody
    List<ProductVO> querySorted(@RequestBody String body);

    /**
     * 购买
     */
    @RequestMapping(value = "/purchase", method = RequestMethod.POST)
    @ResponseBody
    Success purchase(@RequestBody String body);

    /**
     * BalanceMng的RPC代理为Web创建用户
     */
    @RequestMapping(value = "/createUser", method = RequestMethod.POST)
    @ResponseBody
    Success createUser(@RequestBody String body);

    /**
     * BalanceMng的RPC代理为Web查询余额
     */
    @RequestMapping(value = "/queryBalance", method = RequestMethod.POST)
    @ResponseBody
    BalanceResponse queryBalance(@RequestBody String body);
}