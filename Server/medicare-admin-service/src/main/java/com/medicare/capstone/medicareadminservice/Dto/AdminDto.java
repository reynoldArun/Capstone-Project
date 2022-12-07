package com.medicare.capstone.medicareadminservice.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminDto {
    private long id;
    private String name;
    private String email;
    private String password;
}
