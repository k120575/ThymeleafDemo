package com.thymeleafdemo.service.impl;

import com.thymeleafdemo.pojo.Member;
import com.thymeleafdemo.repository.MemberRepository;
import com.thymeleafdemo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    MemberRepository memberRepo;


    @Override
    public List<Member> getMemberRDList(Integer level) {
        return null;
    }

    @Override
    public void addMember(String name, String password) {
        Member member = new Member(name, password);
        memberRepo.saveAndFlush(member);
    }

    @Override
    public List<Member> findMembers(Member Member) {
        return null;
    }

    @Override
    public void deleteMember(Integer id) {

    }

    @Override
    public Member saveMember(Member Member) {
        return null;
    }
}
