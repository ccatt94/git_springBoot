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

	
	@GetMapping("/form")
	public String formView() {
		return "star/input"; 
	}
	
	
	@PostMapping("/result")
	public String star(StarVO starVO) {
		return "star/star"; 
	}
	
}
