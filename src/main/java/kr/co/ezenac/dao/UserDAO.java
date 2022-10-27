package kr.co.ezenac.dao;

import kr.co.ezenac.dto.UserDTO;

public interface UserDAO {
	public String loginCheck(UserDTO dto);
}
