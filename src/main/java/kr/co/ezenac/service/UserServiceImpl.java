package kr.co.ezenac.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ezenac.dao.UserDAO;
import kr.co.ezenac.dto.UserDTO;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDAO userDAO;
	
	@Override
	public String loginCheck(UserDTO dto, HttpSession session) {
		String name=userDAO.loginCheck(dto);
		
		if(name != null) {
			session.setAttribute("userId", dto.getUserId());
			session.setAttribute("userName", name);
		}
		
		return name;
	}
	
	@Override
	public void logout(HttpSession session) {
		session.invalidate();
	}
}
