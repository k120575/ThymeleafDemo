package com.thymeleafdemo.repository;

import com.thymeleafdemo.pojo.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {
}
