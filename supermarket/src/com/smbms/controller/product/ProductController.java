package com.smbms.controller.product;

import com.smbms.pojo.Product;
import com.smbms.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 *
 */
@Controller
@RequestMapping("product")
public class ProductController {
    @Autowired
    private ProductService productService;

    /**
     * 查询所有商品
     * @return
     */
    @RequestMapping("all")
    @ResponseBody
    public List<Product> getAllProducts(){
        List<Product> products=  productService.getAllProducts();
        return products;
    }
}
