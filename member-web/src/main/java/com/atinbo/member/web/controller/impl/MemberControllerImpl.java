/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.atinbo.member.web.controller.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import com.atinbo.member.model.UserBO;
import com.atinbo.member.service.IMemberService;
import com.atinbo.member.web.controller.MemberController;
import com.atinbo.member.web.model.BalanceResponse;
import com.atinbo.member.web.model.ProductVO;
import com.atinbo.member.web.model.Success;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author yuanyuan
 * @Since 2019/6/10
 */
@Controller
public class MemberControllerImpl implements MemberController {

    @SofaReference(interfaceType = IMemberService.class, uniqueId = "${service.unique.id}", binding = @SofaReferenceBinding(bindingType = "bolt"))
    private IMemberService memberService;


    @Override
    public List<ProductVO> query(String body) {
        JSONObject obj = JSON.parseObject(body);
        String userName = obj.getString("userName");
        UserBO user = memberService.findByUserId(1L);
        return null;
    }

    @Override
    public List<ProductVO> querySorted(String body) {
        //TODO(guolei.sgl): SOFA 动态模块
        JSONObject obj = JSON.parseObject(body);
        String userName = obj.getString("userName");
        return null;
    }

    @Override
    public Success purchase(String body) {

        JSONObject obj = JSON.parseObject(body);
        String userName = obj.getString("userName");

        String productCode = obj.getString("productCode");
        int count = obj.getInteger("count");

        Success success = new Success();
        success.setSuccess("true");
        return success;
    }

    @Override
    public Success createUser(@RequestBody String body) {
        JSONObject obj = JSON.parseObject(body);
        String userName = obj.getString("userName");

        Success success = new Success();
        success.setSuccess("true");
        return success;
    }

    @Override
    public BalanceResponse queryBalance(@RequestBody String body) {
        JSONObject obj = JSON.parseObject(body);
        String userName = obj.getString("userName");

        BalanceResponse balance = new BalanceResponse();

        return balance;
    }
}