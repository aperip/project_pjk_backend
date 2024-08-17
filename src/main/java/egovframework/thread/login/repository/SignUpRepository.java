package egovframework.thread.login.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import egovframework.thread.login.entity.UserVO;

@Repository
public interface SignUpRepository extends JpaRepository<UserVO, String> {

	
}