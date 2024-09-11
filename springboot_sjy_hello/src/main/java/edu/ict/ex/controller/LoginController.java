package edu.ict.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.ict.ex.vo.UserVO;


@Controller 
@RequestMapping("/login")
public class LoginController {

	
	@GetMapping("/form")
	public String formView() {
		return "login/form"; 
	}
	
	@GetMapping("/check")
	public String check(Model model, UserVO user) {
		
		if(user.getId().equals("abcd") && user.getPw().equals("1234")) {
			return "redirect:/"; // /로 호출
		}
		if(user.getId().equals("1234") && user.getPw().equals("1234")) {
			return "redirect:/star/input"; // redirect는 주소를 정해줌
		}
		
		model.addAttribute("user", user);
		
		//뷰 페이지 설정
		return "login/check";
	}
	
//	@GetMapping("/check")
//	public String check(HttpServletRequest req, Model model, UserVO user) {
		
//		String id = (String) req.getParameter("id");
//		String pw = (String) req.getParameter("pw");
		
//		System.out.println(id);
//		System.out.println(pw);
		
//		UserVO user = new UserVO(id, pw);
		
//		user.setId(id);
//		user.setPw(pw);
		
//		model.addAttribute("user", user);
		
//		model.addAttribute("id", id);
//		model.addAttribute("pw", pw);
		
//		return "login/check"; 
//	}
	
	
}
