package com.atinbo.member.repo;


import com.atinbo.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * 会员用户 Repo
 *
 * @author breggor
 */
@Repository
public interface MemberRepo extends JpaRepository<Member, Long>, JpaSpecificationExecutor<Member> {
}
