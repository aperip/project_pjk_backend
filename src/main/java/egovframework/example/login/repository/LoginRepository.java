package egovframework.example.login.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import egovframework.example.login.entity.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, String> {
	/** ID/PW 체크 */
    Optional<Login> findByMemberIdAndMemberPw(String memberId, String memberPw);
    /** ID 가져오기 */
    Optional<Login> findByMemberId(String memberId);
    /** refreshTocken */
    Optional<Login> findByMemberIdAndRefreshToken(String memberId, String refreshToken);
    
}
