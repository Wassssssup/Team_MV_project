package kr.co.ezenac.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.ezenac.dto.UserDTO;
import kr.co.ezenac.service.UserService;

@Controller
@RequestMapping("/user/*")
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping("login.do")
	public String login() {
		
		return "user/login";
	}
	
	@RequestMapping("login_check.do")
	public ModelAndView login_check(@ModelAttribute UserDTO dto, HttpSession session) {
		String name=userService.loginCheck(dto, session);
		ModelAndView mav=new ModelAndView();
		
		if(name != null) { //로그인 성공 시
			mav.setViewName("main");
		}else { //로그인 실패 시
			mav.setViewName("user/login");
			mav.addObject("message", "error");
		}
		
		return mav;
	}
	
	@RequestMapping("logout.do")
	public ModelAndView logout(HttpSession session, ModelAndView mav) {
		userService.logout(session);
		
		mav.setViewName("user/login");
		mav.addObject("message", "logout");
		
		return mav;
	}
}
