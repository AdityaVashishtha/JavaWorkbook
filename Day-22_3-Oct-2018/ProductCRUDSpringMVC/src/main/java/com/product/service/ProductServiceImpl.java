package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.product.dao.ProductDAO;
import com.product.dao.ProductDAOImpl;
import com.product.entity.Product;

public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDAO productDAO;
	
	@Override
	public Product addProduct(Product product) {
		return productDAO.addProduct(product);		
	}

	@Override
	public Product getProductByCode(String code) {
		return productDAO.getProductByCode(code);		
	}

	@Override
	public Product removeProduct(String code) { 
		return productDAO.removeProduct(code);
	}

	@Override
	public Product updateProduct(Product product) {
		return productDAO.updateProduct(product);
	}

	@Override
	public List<Product> getAllProducts() {		
		return productDAO.getAllProducts();
	}

}
