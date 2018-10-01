package com.ssi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {
	//@RequestMapping(value="customerentry",method=RequestMethod.GET)
	@GetMapping("customerentry")
	public String showCEntryForm(){
		return "centry.jsp";
	}
	
	//@RequestMapping(value="customerentry",method=RequestMethod.POST)
	@PostMapping("customerentry")
	public String saveCustomerData(@ModelAttribute("customer") Customer customer){
		
		ModelAndView mv = new ModelAndView();
		
		return "confirm.jsp";
	}
}








