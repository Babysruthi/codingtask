package com.pms.service;

import java.util.List;
import java.util.Map;

import com.pms.dto.Product;
import com.pms.exception.InvalidProductIDxception;

//LoginService   , validateUser    id ='capgemini" pwd="capgemini"

public interface ProductService {

	Map<Integer,Product>addProduct(Product p)throws InvalidProductIDxception;
	Map<Integer,Product>deleteProduct(int id,Map<Integer,Product>pmap);
//	List<Product> listAllProduct();
//	void updateProduct(Product p);
	boolean validateAllProducts(Map<Integer,Product> pmap);
	void printProduct(Map<Integer,Product>pmap);
}