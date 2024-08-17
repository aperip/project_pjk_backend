package egovframework.example.login.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.login.entity.Login;
import egovframework.example.login.service.LoginService;

@Controller
public class LoginController {
	
	 @Autowired
	    private LoginService loginService;
	 
 	@RequestMapping("/login/loginAct.do")
 		 public ResponseEntity<Login> login(@RequestBody Login login){
	 		String memberId = login.getMemberId();
	        String memberPw = login.getMemberPw();
	        
	        Login user = loginService.login(memberId, memberPw);
	        
	        return ResponseEntity.ok(user);
	       
	    }
 	
 	@RequestMapping("/login/test.do")
	public void test() {
 		
 		
 		System.out.println("테스트 2");
 	}
	

}
