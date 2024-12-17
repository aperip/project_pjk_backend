package egovframework.example.login.service;


import egovframework.example.login.entity.Login;

public interface LoginService {
		
	
	Login login(String userId, String userPw);

	void saveRefreshToken(String userId, String refreshToken);

	boolean isValidRefreshToken(String userId, String refreshToken);

}
