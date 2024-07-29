package egovframework.example.login.service;

import java.util.List;
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
		    
		    List<Login> test= loginRepository.findAll();
		    
		    if (optionalUser.isPresent()) {
		        System.out.println("User found: " + optionalUser.get());
		    } else {
		        System.out.println("User not found with MemberId: " + memberId + " and MemberPw: " + memberPw);
		    }
		    
		    return optionalUser.orElse(null);
	    }
	

}
