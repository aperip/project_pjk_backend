package egovframework.thread.user.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import egovframework.thread.user.entity.User;
import egovframework.thread.user.service.UserService;
import egovframework.thread.common.entity.common.CommonVo;
import egovframework.thread.user.entity.Following;
import egovframework.thread.user.entity.FollowingCompositeKey;

@CrossOrigin(origins = "*")
@RestController
public class UserController {

	@Autowired
    private UserService userService;
	 
 	@RequestMapping("/user/follow/userFollowInfoList.do")
 	@CrossOrigin
    public ResponseEntity<User> login(@RequestParam String memberId, @RequestParam String memberPw) {
	 	System.out.println("userFollowInfoList");
	 	memberId = "1111";
	 	memberPw = "1111";
	 	User user = userService.login(memberId, memberPw);
        if (user != null) {
            // 로그인 성공 시 사용자 정보를 반환
            //return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            // 로그인 실패 시 401 Unauthorized 상태 반환
            //return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
        user.setMemberId("1");
        
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
 	
 	 @GetMapping("/user/follow/userFollowInfoList.do")
 	 @CrossOrigin
     public ResponseEntity<List<User>> userFollowInfoList(@RequestParam String memberName) {
 	 	System.out.println("userFollowInfoList==="+memberName);
         try {
            
             List<User> users = new ArrayList<>();
             /*User obj = new User();
             obj.setMemberId("1");
             obj.setMemberName("사용자1");
             obj.setMemberNname("https://via.placeholder.com/35");
             
             users.add(obj);
             User obj2 = new User();
             obj2.setMemberId("2");
             obj2.setMemberName("사용자2");
             obj2.setMemberNname("https://via.placeholder.com/35");
             
             users.add(obj2);
             */
             
             users = userService.userMemberInfoList(memberName);
             if (users != null) {
                 // 로그인 성공 시 사용자 정보를 반환
                 System.out.println("users_size="+ users.size());
             }
             Thread.sleep(1000); //1초 대기
             return ResponseEntity.ok(users);
         } catch (Exception e) {
        	 System.out.println("Error in userFollowInfoList"+ e);
             return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
         }
     }
 	

 	 @PostMapping("/user/follow/saveFollowing.do")
 	 @CrossOrigin
     public ResponseEntity<CommonVo> saveFollowing(@RequestBody Following following) {
		 System.out.println("saveFollowing0== "+following.toString());
 		// yourEntity에서 복합키를 추출
 		FollowingCompositeKey compositeKey = following.getFollowingSeq();
		 System.out.println("saveFollowing1== "+compositeKey.getFollowingSeq());
		 System.out.println("saveFollowing2== "+compositeKey.getMemberSeq());
         
         try {
             System.out.println("Received Following: " + following.toString());
             String succ = userService.saveFollowing(following);
             
             CommonVo commonVo = new CommonVo();
             commonVo.setSuccDiv(succ);
             return ResponseEntity.ok( commonVo );
         } catch (Exception e) {
        	 System.out.println("Error in userFollowInfoList"+ e);
             return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
         }
         
     }
 	 
 	 
}
