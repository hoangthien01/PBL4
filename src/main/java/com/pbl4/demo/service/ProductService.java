package com.pbl4.demo.service;

import com.pbl4.demo.entity.Product;
import com.pbl4.demo.form.ProductForm;
import com.pbl4.demo.model.ProductInfo;
import com.pbl4.demo.pagination.PaginationResult;

public interface ProductService {

    public Product findProduct(String code);
    public ProductInfo findProductInfo(String code);
    public void save(ProductForm productForm);
    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult, int maxNavigationPage,
                                                       String likeName);
    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult, int maxNavigationPage);
}
