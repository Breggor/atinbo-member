package com.atinbo.member.repo;


import com.atinbo.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 会员用户Repo
 */
public interface MemberRepo extends JpaRepository<Member, Long>, JpaSpecificationExecutor<Member> {
}