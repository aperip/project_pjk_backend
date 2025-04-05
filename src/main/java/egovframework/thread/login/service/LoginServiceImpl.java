package egovframework.thread.login.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import egovframework.thread.login.entity.Login;
import egovframework.thread.login.repository.LoginRepository;

@Service
@Transactional(rollbackFor = { Exception.class }, propagation = Propagation.REQUIRED)
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepository loginRepository;

	@Override
	public Login login(String userId, String userPw) {
		Optional<Login> optionalUser = loginRepository.findByUserIdAndUserPw(userId, userPw);

//		    List<Login> test= loginRepository.findAll();

		if (optionalUser.isPresent()) {
			System.out.println("User found: " + optionalUser.get());
		} else {
			System.out.println("User not found with UserId: " + userId + " and UserPw: " + userPw);
		}

		return optionalUser.orElse(null);
	}

	@Override
	public void saveRefreshToken(String userId, String refreshToken) {
		Optional<Login> optionalUser = loginRepository.findByUserId(userId);
		if (optionalUser.isPresent()) {
			Login user = optionalUser.get();
			user.setRefreshToken(refreshToken); // Login 엔티티에 refreshToken 필드 추가
			loginRepository.save(user);
		} else {
			throw new RuntimeException("User not found with userId: " + userId);
		}

	}

	@Override
	public boolean isValidRefreshToken(String userId, String refreshToken) {
		Optional<Login> optionalUser = loginRepository.findByUserId(userId);
		if (optionalUser.isPresent()) {// 객체 소유 유무 검사
			return refreshToken.equals(optionalUser.get().getRefreshToken());
		}
		return false;
	}

}
