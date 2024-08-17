package egovframework.example.cmmn.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {

	@RequestMapping(value = "/axiosTest1.do")
	public String axiosTest1() {
		
		
		return "axiosTest1";
		
	}
}
