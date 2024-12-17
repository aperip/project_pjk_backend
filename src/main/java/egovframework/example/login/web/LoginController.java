package egovframework.example.login.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.login.entity.Login;
import egovframework.example.login.service.LoginService;
import egovframework.thread.common.util.JwtUtil;
import egovframework.thread.user.entity.User;
import egovframework.thread.user.service.UserService;

@Controller
public class LoginController {
	
	 @Autowired
	    private LoginService loginService;
	 @Autowired
	    private UserService userService;
	 
 	@RequestMapping("/login/loginAct.do")
	 public ResponseEntity<?> login(@RequestBody Login login){
 		String userId = login.getUserId();
        String userPw = login.getUserPw();
        
        Login user = loginService.login(userId, userPw);
        if(user != null) {
        	String aToken = JwtUtil.generateAcessToken(userId);
    	    String rToken = JwtUtil.generateRefreshToken(userId);
    	    loginService.saveRefreshToken(userId, rToken);
    	    
    	    Map<String, Object> tokens = Map.of(
                    "aToken", aToken,
                    "rToken", rToken,
                    "userInfo", Map.of(
                        "userId", user.getUserId(),
                        "userName", user.getUserName(),
                        "userNickName", user.getUserNickName()
                    )
                );
            

//	        	return ResponseEntity.ok().header("Authorization",  "Bearer " + token).body("로그인 성공");
            return ResponseEntity.ok(tokens);
        }else {
        	return ResponseEntity.status(401).body("로그인 실패: 잘못된 ID 또는 비밀번호");
        }	        
      
    }
 	
 	  @PostMapping("/login/refreshToken.do")
 	    public ResponseEntity<?> refreshToken(@RequestBody Map<String, String> request) {
 	        String rToken = request.get("rToken");

 	        try {
 	            String userId = JwtUtil.validateToken(rToken).getSubject();

 	            // RefreshToken이 서버에 저장된 것과 일치하는지 확인
 	            if (loginService.isValidRefreshToken(userId, rToken)) {
 	                String newAccessToken = JwtUtil.generateAcessToken(userId);

 	                Map<String, String> response = new HashMap<>();
 	                response.put("aToken", newAccessToken);
 	                return ResponseEntity.ok(response);
 	            } else {
 	                return ResponseEntity.status(401).body("유효하지 않은 RefreshToken");
 	            }
 	        } catch (Exception e) {
 	            return ResponseEntity.status(401).body("토큰 갱신 실패");
 	        }
 	    }
 	
 	@RequestMapping("/login/validToken.do")
 	public ResponseEntity<?> validateRefreshToken(@RequestBody Map<String, String> request) {
 		 String rToken = request.get("rToken");

 	    try {
 	        // 1. RefreshToken 유효성 검증
 	        String userId = JwtUtil.validateToken(rToken).getSubject();

 	        // 2. DB에서 RefreshToken 조회 및 검증
 	        if (loginService.isValidRefreshToken(userId, rToken)) {
 	            return ResponseEntity.ok(Map.of("isValid", true));
 	        } else {
 	            return ResponseEntity.status(401).body(Map.of("isValid", false));
 	        }
 	    } catch (Exception e) {
 	        return ResponseEntity.status(401).body(Map.of("isValid", false));
 	    }
 	}
}
