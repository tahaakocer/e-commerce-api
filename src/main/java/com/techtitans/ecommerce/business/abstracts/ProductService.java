package com.techtitans.ecommerce.business.abstracts;

import java.util.List;

import com.techtitans.ecommerce.business.responses.ProductGetAllResponse;

public interface ProductService {
	
	List<ProductGetAllResponse> getAll();

}