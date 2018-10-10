package com.product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.product.entity.Product;
import com.product.service.ProductService;
import com.product.service.ProductServiceImpl;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="saveproduct",method=RequestMethod.GET)
	public ModelAndView fetchAddProductForm() {
		Product product = new Product();
		List<String> categories = new ArrayList<>();
		List<String> brands = new ArrayList<>();
		categories.add("ELECTRONICS");
		categories.add("AUTOMOBILE");		
		brands.add("LG");
		brands.add("SONY");
		brands.add("SAMSUNG");
		brands.add("HONDA");
		ModelAndView mv = new ModelAndView("addproduct.jsp");
		mv.addObject("categories", categories);
		mv.addObject("product", product);
		mv.addObject("brands", brands);
		return mv;		
	}
	
	@RequestMapping(value="saveproduct",method=RequestMethod.POST)
	public ModelAndView addProduct(@ModelAttribute("product") Product product) {
		productService.addProduct(product);
		ModelAndView mv = new ModelAndView("confirmsave.jsp");
		return mv;
	}
	
	@RequestMapping(value="deleteproduct",method=RequestMethod.GET)
	public ModelAndView deleteProduct(@RequestParam("code") String code) {
		ModelAndView mv = new ModelAndView("showproducts");
		Product product = productService.removeProduct(code);
		mv.addObject("product",product);
		return mv;
	}
	
	@RequestMapping(value="updateproduct",method=RequestMethod.GET)
	public ModelAndView updateProductForm(@RequestParam("code") String code) {
		ModelAndView mv = new ModelAndView("updateform.jsp");
		Product product = productService.getProductByCode(code);
		List<String> categories = new ArrayList<>();
		List<String> brands = new ArrayList<>();
		categories.add("ELECTRONICS");
		categories.add("AUTOMOBILE");		
		brands.add("LG");
		brands.add("SONY");
		brands.add("SAMSUNG");
		brands.add("HONDA");		
		mv.addObject("categories", categories);		
		mv.addObject("brands", brands);		
		mv.addObject("product", product);
		return mv;
	}
	
	@RequestMapping(value="updateproduct",method=RequestMethod.POST)
	public ModelAndView updateProduct(@ModelAttribute("product") Product product) {
		ModelAndView mv = new ModelAndView("updateconfirm.jsp");
		productService.updateProduct(product);
		return mv;
	}
	
	@RequestMapping(value="searchproduct",method=RequestMethod.GET)
	public ModelAndView getSearchProductForm() {
		ModelAndView mv = new ModelAndView("searchproductform.jsp");
		List<Product> products = productService.getAllProducts();
		List<String> pcodes = new ArrayList<>();
		for (Product p : products) {
			pcodes.add(p.getPcode());
		}
		mv.addObject("product", new Product());
		mv.addObject("pcodes",pcodes);
		return mv;
	}
	
	@RequestMapping(value="searchproduct",method=RequestMethod.POST)
	public ModelAndView searchProduct(@RequestParam("code") String code) {
		ModelAndView mv = new ModelAndView("showproduct.jsp");
		Product product = productService.getProductByCode(code);
		mv.addObject("product",product);
		return mv;
	}
	
	@RequestMapping(value="showproducts",method=RequestMethod.GET)
	public ModelAndView showProducts() {
		ModelAndView mv = new ModelAndView("showproducts.jsp");
		List<Product> products = productService.getAllProducts();
		mv.addObject("products",products);
		return mv;
	}
	
}
