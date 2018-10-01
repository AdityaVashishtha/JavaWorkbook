package com.springtest.customer_spring_crud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
	
	@RequestMapping("fillForm")
	public String serveForm() {
		return "index.html";
	}
}
