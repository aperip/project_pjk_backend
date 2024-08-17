package egovframework.example.login.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import egovframework.example.login.entity.Login;
import egovframework.example.login.repository.LoginRepository;

@Service
@Transactional(rollbackFor = { Exception.class }, propagation = Propagation.REQUIRED)
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private LoginRepository loginRepository;	

	 @Override
	    public Login login(String memberId, String memberPw) {
	        Optional<Login> optionalUser = loginRepository.findByMemberIdAndMemberPw(memberId, memberPw);
	        return optionalUser.orElse(null);
	    }
	

}
