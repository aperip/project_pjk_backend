package egovframework.thread.user.service;

import java.util.List;

import egovframework.thread.user.entity.Following;
import egovframework.thread.user.entity.User;

public interface UserService {

	User login(String memberId, String memberPw);

	List<User> userMemberInfoList(String memberName);
	
	String saveFollowing(Following following);

}