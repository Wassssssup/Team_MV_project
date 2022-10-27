package kr.co.ezenac.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ezenac.dto.UserDTO;

@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public String loginCheck(UserDTO dto) {
		
		return sqlSession.selectOne("user.login_check", dto);
	}
}
