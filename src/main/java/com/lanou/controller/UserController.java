package com.lanou.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lanou.entity.User;
import com.lanou.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="findAll")
	public String findAll(Model model) {
		
		List<User> users = userService.findAll();
		model.addAttribute("users", users);
		return "userlist";
	}

	@RequestMapping(value = "login")
	public String login(){
		System.out.println("登录");
		return "";
	}

	@RequestMapping(value = "register")
	public String register(){
		System.out.println("注册");
		return "";
	}
}
