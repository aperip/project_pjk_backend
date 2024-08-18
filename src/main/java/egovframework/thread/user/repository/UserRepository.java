package egovframework.thread.user.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import egovframework.thread.user.entity.User;
import egovframework.thread.user.entity.Following;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
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
    Optional<User> findByMemberIdAndMemberPw(String memberId, String memberPw);

    Optional<List<User>> findByMemberNameOrderByMemberNameAsc(String memberName);
}