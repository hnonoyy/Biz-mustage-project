package com.hnono.mustage.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hnono.mustage.models.UserVO;
import com.hnono.mustage.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	protected final UserService userservice;
	public UserController(UserService userservice) {
		super();
		this.userservice = userservice;
	}
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		return null;
	}
	@RequestMapping(value = "/join", method=RequestMethod.POST)
	public String join(UserVO userVO, Model model) {
		
		int ret = userservice.join(userVO);
		
		if(ret < 1) {
			model.addAttribute("JOIN_MSG","FAIL");
			return "user/join";
		}
		return "redirect:/";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(@RequestParam(required = false, defaultValue = "") String error, Model model) {
		if (error.equalsIgnoreCase("NEED")) {
			model.addAttribute("MSG", "로그인이 필요합니다");
		}
		return null;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(UserVO userVO, HttpSession httpSession) {
		httpSession.setAttribute("USER", userVO);
		return "redirect:/";
	}
}
