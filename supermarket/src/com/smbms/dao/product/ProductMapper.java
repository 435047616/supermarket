package com.smbms.dao.product;

import com.smbms.pojo.Product;

import java.util.List;

public interface ProductMapper {
    /**
     * 查询所有商品
     * @return
     */
    List<Product> getAllProducts();
}
