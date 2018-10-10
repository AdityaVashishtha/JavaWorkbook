package com.product.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.product.entity.Product;

public class ProductDAOImpl implements ProductDAO {
	@Autowired
	SessionFactory factory;
	
	@Override
	public Product addProduct(Product product) {
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		session.save(product);
		t.commit();
		return product;
	}

	@Override
	public Product getProductByCode(String code) {
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		Product p = session.get(Product.class, code);
		t.commit();
		return p;
	}

	@Override
	public Product removeProduct(String code) {
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		Product p = session.get(Product.class, code);
		session.delete(p);
		t.commit();
		return p;
	}

	@Override
	public Product updateProduct(Product product) {
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		session.saveOrUpdate(product);
		t.commit();
		return product;
	}

	@Override
	public List<Product> getAllProducts() {
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		Query query = session.createQuery("from Product");
		List<Product> products = query.list();
		t.commit();
		return products;
	}
	
}
