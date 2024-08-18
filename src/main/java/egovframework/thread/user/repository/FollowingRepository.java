package egovframework.thread.user.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import egovframework.thread.user.entity.Following;

@Repository
public interface FollowingRepository extends JpaRepository<Following, String> {

	
}