package com.product.dao;

import java.util.List;

import com.product.entity.Product;

public interface ProductDAO {
	public Product addProduct(Product product);
	public Product getProductByCode(String code);
	public Product removeProduct(String code);
	public Product updateProduct(Product product);
	public List<Product> getAllProducts();	
}
