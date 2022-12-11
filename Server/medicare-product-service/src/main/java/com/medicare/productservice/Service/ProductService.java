package com.medicare.productservice.Service;

import com.medicare.productservice.Dto.ProductDto;
import com.medicare.productservice.Entity.Product;

import java.util.List;

public interface ProductService {
    public String CreateProduct(ProductDto productDto);

    public Product GetProductById(long id);

    public List<Product> GetAllProduct();

    public String DeleteProduct(long id);

    public String UpdateProduct(ProductDto productDto);

    Product findProductByProductNameContainingIgnoreCase(String productName);
}
