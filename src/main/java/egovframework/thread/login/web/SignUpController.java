package egovframework.thread.login.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import egovframework.thread.login.entity.LoginVO;
import egovframework.thread.login.entity.UserVO;
import egovframework.thread.login.service.SignUpService;
import egovframework.thread.common.entity.common.CommonVo;
import egovframework.thread.login.entity.SignUpRepository;

@RestController
public class SignUpController {

	@Autowired
	private SignUpService loginService;
	 
	@PostMapping("/login/signUp/insertSignUpInfo.do")
	@CrossOrigin
	public ResponseEntity<CommonVo> insertSignUpInfo(@RequestBody UserVO userVo) {
		System.out.println("insertSignUpInfo== "+userVo.toString());
		// yourEntity에서 복합키를 추출
		//SignUpRepository compositeKey = userVo.getFollowingSeq();
		 
		try {
		     System.out.println("insertSignUpInfo : " + userVo.toString());
		     String succ = loginService.insertSignUpInfo(userVo);
		     
		     CommonVo commonVo = new CommonVo();
		     commonVo.setSuccDiv(succ);
		     return ResponseEntity.ok( commonVo );
		} catch (Exception e) {
			System.out.println("Error in insertSignUpInfo = "+ e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
		     
	}
 	 
 	 
}
