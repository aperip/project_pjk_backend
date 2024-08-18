package egovframework.thread.login.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import egovframework.thread.login.entity.UserVO;

import egovframework.example.login.entity.Login;

@Repository
public interface SignUpRepository extends JpaRepository<UserVO, String> {
	/* 예시
	List<User> findByUserName(String userName);
	List<User> findByUserNameAndStatus(String userName, String status);
	List<User> findByStatusOrderByUserNameAsc(String status);
	List<User> findByStatusOrderByUserNameAsc(String status);
	List<User> findByLastLoginIsNull();
	List<User> findByLastLoginNotNull();
	List<User> findByLastLoginIsNull();
	List<User> findByLastLoginNotNull();
	 */
    Optional<UserVO> findByMemberIdAndMemberPw(String memberId, String memberPw);

    Optional<List<UserVO>> findByMemberNameOrderByMemberNameAsc(String memberName);

	
}