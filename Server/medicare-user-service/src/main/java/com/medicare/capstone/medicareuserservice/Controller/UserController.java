package com.medicare.capstone.medicareuserservice.Controller;

import com.medicare.capstone.medicareuserservice.Dto.UserDto;
import com.medicare.capstone.medicareuserservice.Entity.User;
import com.medicare.capstone.medicareuserservice.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public ResponseEntity<List<User>> GetAllUser() {
        return ResponseEntity.status(200).body(userService.GetAllUser());
    }

    @PostMapping("/add")
    public ResponseEntity<String> CreateUser(@RequestBody UserDto userDto) {
        return ResponseEntity.status(200).body(userService.CreateUser(userDto));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> DeleteUser(@PathVariable long id) {
        return ResponseEntity.status(200).body(userService.DeleteUser(id));
    }

    @PutMapping("/update")
    public ResponseEntity<String> UpdateUser(@RequestBody UserDto userDto) {
        return ResponseEntity.status(200).body(userService.UpdateUser(userDto));
    }

    @GetMapping("/single/{id}")
    public ResponseEntity<User> GetUserById(@PathVariable long id) {
        return ResponseEntity.status(200).body(userService.GetUserByID(id));
    }

}
