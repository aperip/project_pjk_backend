package egovframework.thread.login.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import egovframework.thread.login.entity.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, String> {
	/** ID/PW 체크 */
    Optional<Login> findByUserIdAndUserPw(String userId, String userPw);
    /** ID 가져오기 */
    Optional<Login> findByUserId(String userId);
    /** refreshTocken */
    Optional<Login> findByUserIdAndRefreshToken(String userId, String refreshToken);
    
}
