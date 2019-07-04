package com.atinbo.member.base;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.io.Serializable;
import java.util.Date;


@MappedSuperclass
@Data
@NoArgsConstructor
public abstract class BaseEntity implements Serializable {

    /**
     * 乐观锁版本号
     */
    @Version
    @Column(columnDefinition = "int comment '乐观锁版本号'")
    private Integer version;


    /**
     * 逻辑删除
     */
    @Column(columnDefinition = "bit(1) DEFAULT 0 comment '逻辑删除'")
    private Boolean deleted;

    /**
     * 创建时间
     */
    @CreatedDate
    @Column(nullable = false, updatable = false, columnDefinition = "datetime comment '创建时间'")
    private Date createAt;
}
