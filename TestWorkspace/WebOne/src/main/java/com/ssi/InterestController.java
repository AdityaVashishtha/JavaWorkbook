package com.ssi;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class InterestController {
	
	@Autowired
	InterestService service;
	
	@RequestMapping("showform")
	public String showDetailsSubmissionForm(){
		return "details.jsp";
	}
	
	@RequestMapping("process")
	public ModelAndView calculateInterest(@ModelAttribute("data") InterestModel model){
		service.calculate(model);
		ModelAndView mv=new ModelAndView("result.jsp");
		return mv;
	}
	
}
