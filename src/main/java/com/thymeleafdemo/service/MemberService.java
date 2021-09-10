package com.thymeleafdemo.service;

import com.thymeleafdemo.pojo.Member;

import java.util.List;

public interface MemberService {

    List<Member> getMemberRDList(Integer level);

    void addMember(String name, String password);

    List<Member> findMembers(Member Member);

    void deleteMember(Integer id);

    Member saveMember(Member Member);
}
