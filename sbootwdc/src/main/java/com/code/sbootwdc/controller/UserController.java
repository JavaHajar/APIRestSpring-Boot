package com.code.sbootwdc.controller;
import com.code.sbootwdc.model.*;
import com.code.sbootwdc.service.admin.AdminService;
import com.code.sbootwdc.service.responsable.ResponsableService;
import com.code.sbootwdc.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    AdminService adminService;

    @Autowired
    ResponsableService responsableService;

    //     endpoints for admin  =============

    @PostMapping("/createtadmin")
    public Admin saveadmin(Admin admin) {
        return adminService.save(admin);
    }

    //     endpoints for responsable  =============

    @GetMapping("/responsables")
    public List<Responsable> getresponsables() {
        return (List<Responsable>) responsableService.findAll();
    }

    @GetMapping ("/responsable/{id}")
    public Optional<Responsable> getOnerespons(@PathVariable("id") Integer id){
        return responsableService.findById(id);
    }

    @PostMapping("/createresponsable")
    public Responsable saveresponsable(Responsable responsable){
        return responsableService.save(responsable);
    }

    @PutMapping("/updateresponsable")
    public String updatresponsable(Responsable responsable){
        responsableService.update(responsable);
        return "responsable updated succefully";
    }

    @DeleteMapping("/deletresponsable")
    public String deletresponsable(Responsable responsable){
        responsableService.delete(responsable);
        return "responsable deleted succefully";
    }

    //     endpoints for participant  =============
    @GetMapping("/participants")
    public List<Responsable> getresponsables() {
        return (List<Responsable>) responsableService.findAll();
    }

    @GetMapping ("/participant/{id}")
    public Optional<Responsable> getOnerespons(@PathVariable("id") Integer id){
        return responsableService.findById(id);
    }

    @PostMapping("/creatparticipant")
    public Responsable saveresponsable(Responsable responsable){
        return responsableService.save(responsable);
    }

    @PutMapping("/updatparticipant")
    public String updatresponsable(Responsable responsable){
        responsableService.update(responsable);
        return "responsable updated succefully";
    }

    @DeleteMapping("/deletparticipants")
    public String deletresponsable(Responsable responsable){
        responsableService.delete(responsable);
        return "responsable deleted succefully";
    }

}