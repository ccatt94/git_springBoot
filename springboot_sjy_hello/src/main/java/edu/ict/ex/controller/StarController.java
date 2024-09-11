package edu.ict.ex.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.ict.ex.vo.CircleAreaVO;
import edu.ict.ex.vo.RecAreaVO;
import edu.ict.ex.vo.StarVO;
import edu.ict.ex.vo.TriAreaVO;


@Controller 
@RequestMapping("/star")
public class StarController {

	
	@GetMapping("/input")
	public String formView() {
		return "star/input"; 
	}
	
	
	@GetMapping("/result")
	public String result(StarVO starVO) {
		System.out.println("=======별찍기=======");
		return "star/star"; 
	}
	
}
