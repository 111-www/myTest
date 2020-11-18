package com.gec.service.impl;

import java.util.List;

import org.eclipse.core.internal.runtime.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gec.dao.ProductMapper;
import com.gec.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper productMapper;
	
	@Override
	public List<Product> getAll() {
		List<Product> list = productMapper.getAll();
		if(list.size()>0 && list!=null){
			return list;
		}
		return null;
	}

}
