package com.medicare.capstone.medicareadminservice.Controller;

import com.medicare.capstone.medicareadminservice.Dto.AdminDto;
import com.medicare.capstone.medicareadminservice.Entity.Admin;
import com.medicare.capstone.medicareadminservice.Service.AdminService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin("http://localhost:4200/")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/add")
    public ResponseEntity<String> AddAdmin(@Valid @RequestBody AdminDto adminDto) {
        return ResponseEntity.status(200).body(adminService.AddAdmin(adminDto));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Admin>> GetAllAdmins() {
        return ResponseEntity.status(200).body(adminService.GetAllAdmin());
    }
}
