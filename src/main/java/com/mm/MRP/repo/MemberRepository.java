package com.mm.MRP.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mm.MRP.model.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {

}
