package com.thymeleafdemo.controller;

import com.thymeleafdemo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterController {

    @Autowired
    MemberService memberService;

    @RequestMapping("/addMember")
    public void add(@RequestParam("name") String name,
                    @RequestParam("password") String password,
                    @RequestParam("password2") String password2,
                    HttpServletRequest req,
                    HttpServletResponse res){
        memberService.addMember(name, password, password2);

    }
}
