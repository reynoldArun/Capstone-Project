package com.medicare.capstone.medicareadminservice.Service;

import com.medicare.capstone.medicareadminservice.Dto.AdminDto;
import com.medicare.capstone.medicareadminservice.Entity.Admin;

import java.util.List;

public interface AdminService {
    public List<Admin> GetAllAdmin();

    public String AddAdmin(AdminDto adminDto);
}
