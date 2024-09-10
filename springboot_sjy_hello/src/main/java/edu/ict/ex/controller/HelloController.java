package edu.ict.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//<bean id="helloController" clss="com.javalec.ex.HelloController"></bean>
//@Component + controller
//@Component = @Bean

@Controller 
public class HelloController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String hello() {
		return "home"; //home.jsp
	}
	
	@GetMapping("/board/view")
	public String boardView() {
		return "board/view"; 
	}
	
	@GetMapping("/board/content")
	public String boardContent(Model model) {
		
		model.addAttribute("id",30);
		model.addAttribute("name","홍길동");
		model.addAttribute("age",21);
		
		return "board/content"; 
	}

	@GetMapping("/board/reply")
	public ModelAndView boardReply() {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("id",30);
		mv.setViewName("board/reply");
		
		return mv; 
	}

	
}
