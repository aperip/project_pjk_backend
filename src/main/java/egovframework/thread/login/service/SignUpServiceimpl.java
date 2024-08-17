package egovframework.thread.login.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import egovframework.thread.login.entity.LoginVO;
import egovframework.thread.login.entity.UserVO;
import egovframework.thread.login.repository.SignUpRepository;

@Service
@Transactional(rollbackFor = { Exception.class }, propagation = Propagation.REQUIRED)
public class SignUpServiceimpl implements SignUpService{
	
	@Autowired
	private SignUpRepository signUpRepository;


	@Override
    public String insertSignUpInfo(UserVO userVo) {
		String succDiv = "F";
		try {
	        signUpRepository.save(userVo);
			succDiv = "S";
		}catch(Exception e) {
			System.out.println("insertSignUpInfo_fail..");
			succDiv = "F";
		}
		
		return succDiv;
    }
	
}