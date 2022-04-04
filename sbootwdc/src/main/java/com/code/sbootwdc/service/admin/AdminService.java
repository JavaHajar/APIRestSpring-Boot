package com.code.sbootwdc.service.admin;

import com.code.sbootwdc.model.Admin;
import org.springframework.stereotype.Service;


@Service
public interface AdminService {
    public Admin save(Admin admin);
}
