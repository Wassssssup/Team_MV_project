package kr.co.ezenac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class UserController {

	@GetMapping("/login")
	public  String login() {
		return "login/login";
	}
	
	@GetMapping("/join")
	public String join() {
		return "login/join";
	}
	
	@GetMapping("/find")
	public String find() {
		return "login/find";
	}
}
