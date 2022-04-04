package com.code.sbootwdc.controller;
import com.code.sbootwdc.model.Admin;
import com.code.sbootwdc.model.Role;
import com.code.sbootwdc.model.User;
import com.code.sbootwdc.service.admin.AdminService;
import com.code.sbootwdc.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    AdminService adminService;

    //     endpoints for admin  =============

    @PostMapping("/createtadmin")
    public Admin saveadmin(Admin admin) {
        return adminService.save(admin);
    }

    //     endpoints for responsable  =============
}