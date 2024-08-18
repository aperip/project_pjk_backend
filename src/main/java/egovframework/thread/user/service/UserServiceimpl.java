package egovframework.thread.user.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import egovframework.thread.user.entity.User;
import egovframework.thread.user.repository.FollowingRepository;
import egovframework.thread.user.repository.UserRepository;
import egovframework.thread.user.entity.Following;

@Service
@Transactional(rollbackFor = { Exception.class }, propagation = Propagation.REQUIRED)
public class UserServiceimpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private FollowingRepository followingRepository;

	@Override
    public User login(String memberId, String memberPw) {
        Optional<User> optionalUser = userRepository.findByMemberIdAndMemberPw(memberId, memberPw);
        return optionalUser.orElse(null);
    }

	@Override
    public List<User> userMemberInfoList(String memberName) {
        Optional<List<User>> userMemberInfoList = userRepository.findByMemberNameOrderByMemberNameAsc(memberName);
        return userMemberInfoList.orElse(null);
    }

	@Override
    public String saveFollowing(Following following) {
		String succDiv = "F";
		try {
	        followingRepository.save(following);
			succDiv = "S";
		}catch(Exception e) {
			System.out.println("saveFollowing_fail..");
			succDiv = "F";
		}
		
		return succDiv;
    }
	
}