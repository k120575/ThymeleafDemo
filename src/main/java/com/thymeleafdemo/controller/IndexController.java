package com.thymeleafdemo.controller;

import com.thymeleafdemo.ThymeleafDemoApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;

@Controller
public class IndexController {
//    @GetMapping("/hello")
//    public String hello(
//            @RequestParam(name = "name", required = false, defaultValue = "World") String name,
//            Model model) {
//        model.addAttribute("name", name);
//        return "hello";
//    }
    Logger logger = Logger.getLogger("ThymeleafDemoApplication");

    @RequestMapping("/register")
    public void register(HttpServletRequest req, HttpServletResponse res){
        try {
            res.sendRedirect(req.getContextPath() + "/register.html");
        }catch(Exception e){
            logger.info(e.toString());
        }
    }
}
