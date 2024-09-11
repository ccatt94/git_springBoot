package edu.ict.ex.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.ict.ex.vo.CircleAreaVO;
import edu.ict.ex.vo.RecAreaVO;
import edu.ict.ex.vo.TriAreaVO;


@Controller 
@RequestMapping("/shape")
public class ShapeController {

	
	@GetMapping("/form")
	public String formView() {
		return "shape/area"; 
	}
	
	@GetMapping("/recArea")
	//@ModelAttribute를 사용하면 command 객체 이름 바꿈 & 
	// 						  model.addAttribute로 넘기는 것도 생략 가능
	public String recArea(@ModelAttribute("rectangle")RecAreaVO recAreaVO) {
		
		//model.addAttribute("rectangle", rectangle);
		
		return "shape/areaRec"; 
	}
	
	@PostMapping("/triArea")
	public String triArea(TriAreaVO triAreaVO) {
		return "shape/areaTri"; 
	}
	
	@PostMapping("/circleArea")
	public String circleArea(CircleAreaVO circleAreaVO) {
		return "shape/areaCircle"; 
	}
	
}
