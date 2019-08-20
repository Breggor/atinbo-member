package com.atinbo.member.web.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class MemberVO {
    private String name = "Breggor";
    private Integer age = 100;
}
