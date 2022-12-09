package com.medicare.capstone.medicarecartservice.Controller;

import com.medicare.capstone.medicarecartservice.Entity.Cart;
import com.medicare.capstone.medicarecartservice.Entity.Product;
import com.medicare.capstone.medicarecartservice.Entity.User;
import com.medicare.capstone.medicarecartservice.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class CartController {

    @Autowired
    private CartService cartService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/add/{productId}/{userId}")
    public ResponseEntity<Cart> addCart(@PathVariable long productId, @PathVariable long userId) {
        Product newProduct = this.restTemplate.getForObject("http://localhost:9002/single/"+productId, Product.class);
        User newUser = this.restTemplate.getForObject("http://localhost:9001/single/"+userId, User.class);
        Cart newCart = new Cart(newUser, newProduct);
        newCart.setUnit(1);
        newCart.setTotalPrice(newCart.getUnit()*newProduct.getAmount());
        Cart addCart = cartService.AddToCart(newCart);
        return new ResponseEntity<Cart>(addCart, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> DeleteCartItems(@PathVariable long id) {
        return ResponseEntity.status(200).body(cartService.DeleteCartItems(id));
    }

    @GetMapping("/all/{id}")
    public ResponseEntity<List<Cart>> GetAllCartItems(@PathVariable long id) {
        return ResponseEntity.status(200).body(cartService.getAllByUserCart(id));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> UpdateCartItems(@RequestBody Cart cart, @PathVariable long id) {
        return ResponseEntity.status(200).body(cartService.UpdateCartItems(cart, id));
    }

}
