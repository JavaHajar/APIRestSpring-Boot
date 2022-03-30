package com.code.sbootwdc.controller;


import com.code.sbootwdc.model.Role;
import com.code.sbootwdc.service.role.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AdminController {

    @Autowired
    RoleService roleService;

    @GetMapping("/roles")
    public List<Role> getroles() {
        return (List<Role>) roleService.findAll();
    }
    @GetMapping ("/role/{id}")
    public Optional<Role> getOneRole(@PathVariable("id") Integer id){
        return roleService.findById(id);
    }

    @PostMapping("/createRole")
    public String saveRole(Role role){
        roleService.save(role);
        return "role created succefully";
    }

    @PutMapping("/updateRole")
    public String updateRole(Role role){
        roleService.update(role);
        return "role updated succefully";
    }

    @DeleteMapping("/deleteRole")
    public String deletrole(Role role){
        roleService.delete(role);
        return "role deleted succefully";
    }

}
