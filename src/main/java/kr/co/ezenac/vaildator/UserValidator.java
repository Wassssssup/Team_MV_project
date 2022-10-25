package kr.co.ezenac.vaildator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

//유효성 검사 처리하는곳
public class UserValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		
		return true;
	}
	
	@Override
	public void validate(Object target,Errors errors) {
		//UserBean userBean=(UserBean)target;
		
		//if(userBean.getUser_pw().equals(userBean.getUser_pw2()) == false) {
			errors.rejectValue("user_pw", "NotEquals");
			errors.rejectValue("user_pw2", "NotEquals");
		}
	}