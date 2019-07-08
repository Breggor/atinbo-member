package com.atinbo.member;

import com.atinbo.member.entity.Tag;
import com.atinbo.member.repo.TagRepo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class TagRepoTestCase extends AbstractTestCase {

    @Autowired
    TagRepo tagRepo;

    @Test
    public void testNew() {
        Tag tag = new Tag();
        tag.setId(1L);
        tag.setName("上海");
        tag.setCreateAt(new Date());

        Tag entity = tagRepo.save(tag);
        Assert.assertNotNull("创建失败", entity.getId());
    }
}
