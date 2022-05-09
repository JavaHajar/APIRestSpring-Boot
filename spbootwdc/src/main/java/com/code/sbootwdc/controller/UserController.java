package com.code.sbootwdc.controller;
import com.code.sbootwdc.model.*;
import com.code.sbootwdc.service.admin.AdminService;
import com.code.sbootwdc.service.participant.ParticipantService;
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

    @Autowired
    ParticipantService participantService;


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
    public List<Participant> getparticipants() {
        return (List<Participant>) participantService.findAll();
    }

    @GetMapping ("/participant/{id}")
    public Optional<Participant> getOneparticipant(@PathVariable("id") Integer id){
        return participantService.findById(id);
    }

    @PostMapping("/creatparticipant")
    public Participant saveparticipant(Participant participant){
        return participantService.save(participant);
    }

    @PutMapping("/updatparticipant")
    public String updatparticipant(Participant participant){
        participantService.update(participant);
        return "participant updated succefully";
    }

    @DeleteMapping("/deletparticipants")
    public String deletparticipant(Participant participant){
        participantService.delete(participant);
        return "participant deleted succefully";
    }

}