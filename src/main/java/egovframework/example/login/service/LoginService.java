package egovframework.example.login.service;


import egovframework.example.login.entity.Login;

public interface LoginService {
		
	
	Login login(String memberId, String memberPw);

}
