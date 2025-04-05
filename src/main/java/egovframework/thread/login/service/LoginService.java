package egovframework.thread.login.service;


import egovframework.thread.login.entity.Login;

public interface LoginService {
		
	
	Login login(String userId, String userPw);

	void saveRefreshToken(String userId, String refreshToken);

	boolean isValidRefreshToken(String userId, String refreshToken);

}
