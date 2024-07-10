package egovframework.example.login.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import egovframework.example.login.entity.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, String> {
    Optional<Login> findByMemberIdAndMemberPw(String memberId, String memberPw);
}
