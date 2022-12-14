package com.medicare.capstone.medicarecartservice.Repository;

import com.medicare.capstone.medicarecartservice.Entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CartRepository extends JpaRepository <Cart, Long> {

    List<Cart> findAllByUserId(long id);
}
