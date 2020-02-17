package com.smbms.service.product;

import com.smbms.dao.product.ProductMapper;
import com.smbms.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl  implements  ProductService{

    @Autowired
    private ProductMapper productMapper;
    @Override
    public List<Product> getAllProducts() {
        return productMapper.getAllProducts();
    }
}
