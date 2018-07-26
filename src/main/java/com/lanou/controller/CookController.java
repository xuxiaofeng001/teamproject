package com.lanou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Controller
public class CookController {

    @RequestMapping("/find")
    public String findCookie(HttpServletRequest request) {
        // 获取cook 第一步
        // 获取request

        Cookie[] cookies = request.getCookies();
        for (int i=0;i <cookies.length;i++){
            cookies[i].getName();
            cookies[i].getValue();
        }
        if (true){
            return "index";
        }else {
            return "login";
        }
    }
}
