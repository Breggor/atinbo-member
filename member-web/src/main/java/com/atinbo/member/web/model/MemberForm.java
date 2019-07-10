package com.atinbo.member.web.model;


import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

/**
 * @author breggor
 */
@Data
public class MemberForm {

    @NotBlank(message = "名称不为空")
    private String name;

    @Min(value = 1, message = "小于最小年龄限制:1岁")
    @Max(value = 120, message = "大于最大年龄限制：120岁")
    private Integer age;
}
