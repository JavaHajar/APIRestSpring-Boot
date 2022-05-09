package com.code.sbootwdc.service.admin;

import com.code.sbootwdc.model.Admin;
import com.code.sbootwdc.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImp implements AdminService{
    @Autowired
    AdminRepository adminRepository;
    @Override
    public Admin save(Admin admin) {
        return adminRepository.save(admin);

    }
}
