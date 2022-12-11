package com.medicare.productservice.ServiceImpl;

import com.medicare.productservice.Dto.ProductDto;
import com.medicare.productservice.Entity.Product;
import com.medicare.productservice.Repository.ProductRepository;
import com.medicare.productservice.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public String CreateProduct(ProductDto productDto) {
        Product newProduct = new Product();
        newProduct.setProductName(productDto.getProductName());
        newProduct.setAmount(productDto.getAmount());
        newProduct.setCategory(productDto.getCategory());
        newProduct.setImg(productDto.getImg());
        newProduct.setQuantity(productDto.getQuantity());
        productRepository.save(newProduct);
        return "Product Created!!";
    }

    @Override
    public Product GetProductById(long id) {
        return productRepository.findById(id).get();


    }

    @Override
    public List<Product> GetAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public String DeleteProduct(long id) {
        productRepository.deleteById(id);
        return "Deleted!!";
    }

    @Override
    public String UpdateProduct(ProductDto productDto) {
        Product updateProduct = new Product();
        updateProduct.setProductName(productDto.getProductName());
        updateProduct.setAmount(productDto.getAmount());
        updateProduct.setCategory(productDto.getCategory());
        updateProduct.setImg(productDto.getImg());
        updateProduct.setQuantity(productDto.getQuantity());
        productRepository.save(updateProduct);
        return "Product created!!";
    }

    @Override
    public Product findProductByProductNameContainingIgnoreCase(String productName) {
        return productRepository.findProductByProductNameContainingIgnoreCase(productName);
    }


}
