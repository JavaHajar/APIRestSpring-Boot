package com.code.sbootwdc.controller;


import com.code.sbootwdc.model.Admin;
import com.code.sbootwdc.model.Role;
import com.code.sbootwdc.model.Typeresponsable;
import com.code.sbootwdc.service.role.RoleService;
import com.code.sbootwdc.service.typeresponsable.TyperesponsableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AdminController {

//     endpoints for roles  =============

    @Autowired
    RoleService roleService;

    @Autowired
    TyperesponsableService typerespService;


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

    //     endpoints for Typeofresponsable  =============

    @GetMapping("/typeresponsables")
    public List<Typeresponsable> gettyperes() {
        return (List<Typeresponsable>) typerespService.findAll();
    }

    @GetMapping ("/typeres/{id}")
    public Optional<Typeresponsable> getOnetyperes(@PathVariable("id") Integer id){
        return typerespService.findById(id);
    }

    @PostMapping("/createtyperes")
    public Typeresponsable savetyperes(Typeresponsable typeresponsable){
        return typerespService.save(typeresponsable);
    }

    @PutMapping("/updatetyperes")
    public String updatetyperes(Typeresponsable typeresponsable){
        typerespService.update(typeresponsable);
        return "typeresponsable updated succefully";
    }

    @DeleteMapping("/delettyperes")
    public String delettyperes(Typeresponsable typeresponsable){
        typerespService.delete(typeresponsable);
        return "typeresponsable deleted succefully";
    }

}
