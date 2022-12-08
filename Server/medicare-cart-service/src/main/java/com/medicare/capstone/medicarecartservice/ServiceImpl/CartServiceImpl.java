package com.medicare.capstone.medicarecartservice.ServiceImpl;


import com.medicare.capstone.medicarecartservice.Entity.Cart;
import com.medicare.capstone.medicarecartservice.Repository.CartRepository;
import com.medicare.capstone.medicarecartservice.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;


    @Override
    public Cart AddToCart(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public List<Cart> getAllByUserCart(long id) {
        return cartRepository.findAllByUserId(id);
    }


    @Override
    public String DeleteCartItems(long id) {
        cartRepository.deleteById(id);
        return "Deleted!!";
    }

    @Override
    public String UpdateCartItems(Cart cart, long id) {
        cartRepository.findById(id).get();
        Cart update;
        update=cart;
        cartRepository.save(update);
        return "Updated!!";

    }
}
