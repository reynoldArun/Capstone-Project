package com.medicare.capstone.medicareuserservice.Service;

import com.medicare.capstone.medicareuserservice.Dto.UserDto;
import com.medicare.capstone.medicareuserservice.Entity.User;

import java.util.List;

public interface UserService {
    public String CreateUser(UserDto userDto);

    public User GetUserByID(long id);

    public List<User> GetAllUser();

    public String DeleteUser(long id);

    public String UpdateUser(long id, UserDto userDto);
}
