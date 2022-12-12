package com.medicare.capstone.medicareuserservice.ServiceImpl;

import com.medicare.capstone.medicareuserservice.Dto.UserDto;
import com.medicare.capstone.medicareuserservice.Entity.User;
import com.medicare.capstone.medicareuserservice.Repository.UserRepository;
import com.medicare.capstone.medicareuserservice.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public String CreateUser(UserDto userDto) {
        User newUser = new User();
        newUser.setName(userDto.getName());
        newUser.setEmail(userDto.getEmail());
        newUser.setPhoneNumber(userDto.getPhoneNumber());
        newUser.setPassword(userDto.getPassword());
        userRepository.save(newUser);
        return "User Created Successfully!!";

    }

    @Override
    public User GetUserByID(long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> GetAllUser() {
        return userRepository.findAll();
    }

    @Override
    public String DeleteUser(long id) {
        userRepository.deleteById(id);
        return "User Deleted!!";
    }

    @Override
    public String UpdateUser(long id, UserDto userDto) {
        User newUser = userRepository.findById(id).get();
        newUser.setName(userDto.getName());
        newUser.setEmail(userDto.getEmail());
        newUser.setPassword(userDto.getPassword());
        newUser.setPhoneNumber(userDto.getPhoneNumber());
        userRepository.save(newUser);
        return "User updated!!";
    }

}

