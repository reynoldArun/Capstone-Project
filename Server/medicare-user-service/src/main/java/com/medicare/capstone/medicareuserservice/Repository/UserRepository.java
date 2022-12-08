package com.medicare.capstone.medicareuserservice.Repository;

import com.medicare.capstone.medicareuserservice.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends JpaRepository <User, Long> {
}
