package com.medicare.productservice.Controller;


import com.medicare.productservice.Dto.ProductDto;
import com.medicare.productservice.Entity.Product;
import com.medicare.productservice.Service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public ResponseEntity<String> CreateProduct(@Valid @RequestBody ProductDto productDto) {
        return ResponseEntity.status(200).body(productService.CreateProduct(productDto));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Product>> GetAllProduct() {
        return ResponseEntity.status(200).body(productService.GetAllProduct());
    }

    @GetMapping("single/{id}")
    public ResponseEntity<Product> GetProductById(@PathVariable long id) {
        return ResponseEntity.status(200).body(productService.GetProductById(id));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> DeleteProduct(@PathVariable long id) {
        return ResponseEntity.status(200).body(productService.DeleteProduct(id));
    }

    @PostMapping("/update")
    public ResponseEntity<String> UpdateProduct(@Valid @RequestBody ProductDto productDto) {
        return ResponseEntity.status(200).body(productService.CreateProduct(productDto));
    }




}
