package kr.co.ezenac.service;

import javax.servlet.http.HttpSession;

import kr.co.ezenac.dto.UserDTO;

public interface UserService {
	public String loginCheck(UserDTO dto, HttpSession session);
	
	public void logout(HttpSession session);

}
