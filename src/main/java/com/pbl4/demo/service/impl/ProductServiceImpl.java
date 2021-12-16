package com.pbl4.demo.service.impl;

import com.pbl4.demo.dao.ProductDAO;
import com.pbl4.demo.entity.Product;
import com.pbl4.demo.form.ProductForm;
import com.pbl4.demo.model.ProductInfo;
import com.pbl4.demo.pagination.PaginationResult;
import com.pbl4.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDAO productDAO;

    @Override
    public Product findProduct(String code) {
        return productDAO.findProduct(code);
    }

    @Override
    public ProductInfo findProductInfo(String code) {
        return productDAO.findProductInfo(code);
    }

    @Override
    public void save(ProductForm productForm) {
        productDAO.save(productForm);
    }

    @Override
    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult, int maxNavigationPage, String likeName) {
        return productDAO.queryProducts(page, maxResult, maxNavigationPage, likeName);
    }

    @Override
    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult, int maxNavigationPage) {
        return productDAO.queryProducts(page, maxResult, maxNavigationPage);
    }
}
