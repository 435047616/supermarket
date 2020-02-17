package com.smbms.service.product;

import com.smbms.pojo.Product;

import java.util.List;

public interface ProductService {
    /**
     * 查询所有商品
     * @return
     */
    List<Product> getAllProducts();
}
