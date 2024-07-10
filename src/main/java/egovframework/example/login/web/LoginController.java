package egovframework.example.login.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import egovframework.example.login.entity.Login;
import egovframework.example.login.service.LoginService;

@Controller
public class LoginController {
	
	 @Autowired
	    private LoginService loginService;
	 
 	@RequestMapping("/login/loginAct.do")
	    public ResponseEntity<Login> login(@RequestParam String memberId, @RequestParam String memberPw) {
		 	System.out.println("되냐?");
	        Login user = loginService.login(memberId, memberPw);
	        if (user != null) {
	            // 로그인 성공 시 사용자 정보를 반환
	            return new ResponseEntity<>(user, HttpStatus.OK);
	        } else {
	            // 로그인 실패 시 401 Unauthorized 상태 반환
	            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
	        }
	    }
 	
 	@RequestMapping("/login/test.do")
	public void test() {
 		System.out.println("테스트 2");
 	}
	

}
