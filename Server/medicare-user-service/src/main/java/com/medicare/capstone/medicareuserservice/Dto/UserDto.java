package com.medicare.capstone.medicareuserservice.Dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private long id;
    @Column(unique = true)
    @NotNull(message = "Username cannot be empty !!")
    private String name;

    @Column(unique = true)
    @NotNull(message = "Email cannot be empty!!")
    @Email(message = "Invalid Email!!")
    private String email;

    @NotNull(message = "Password cannot be empty!!")
    @Size(min = 6, message = "Password is too weak!!")
    private String password;

    @NotNull(message = "PhoneNumber cannot be empty!!")
    @Pattern(regexp = "^\\d{10}$",message = "invalid mobile number entered ")
    private String phoneNumber;
}
