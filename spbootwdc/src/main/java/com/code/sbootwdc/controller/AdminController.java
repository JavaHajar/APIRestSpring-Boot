package com.code.sbootwdc.controller;


import com.code.sbootwdc.model.*;
import com.code.sbootwdc.repository.ActiviteRepository;
import com.code.sbootwdc.repository.ParticipantRepository;
import com.code.sbootwdc.service.activite.ActiviteService;
import com.code.sbootwdc.service.exercice.ExerciceService;
import com.code.sbootwdc.service.role.RoleService;
import com.code.sbootwdc.service.typeOfActivite.TypeOfActiviteService;
import com.code.sbootwdc.service.typeresponsable.TyperesponsableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {


//     endpoints for roles  =============

    @Autowired
    RoleService roleService;

    @Autowired
    TyperesponsableService typerespService;

    @Autowired
    TypeOfActiviteService typeOfActiviteService;

    @Autowired
    ExerciceService exerciceService;

    @Autowired
    ActiviteService activiteService;

    @Autowired
    ParticipantRepository participantRepository;

    @Autowired
    ActiviteRepository activiteRepository;

    @CrossOrigin("http://localhost:4200/")
    @GetMapping("/roles")
    public List<Role> getroles() {
        return (List<Role>) roleService.findAll();
    }
    @GetMapping ("/role/{id}")
    public Optional<Role> getOneRole(@PathVariable("id") Integer id){
        return roleService.findById(id);
    }

//    @PostMapping("/createRole")
//    public String saveRole(Role role){
//        roleService.save(role);
//        return "role created succefully";
//    }

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

    // endpoints for TypeOfActivité  =============

    @GetMapping("/typeOfActivites")
    public List<Typeofactivite> getAllTypeOfActivites(){
        return (List<Typeofactivite>) typeOfActiviteService.findAll();
    }

    @GetMapping("/TypeOfactivite/{id}")
    public Optional<Typeofactivite> getOneTypeOfActivite(@PathVariable("id") Integer id){
        return typeOfActiviteService.findById(id);
    }

    @PostMapping("/createTypeOfActivite")
    public Typeofactivite createTypeOfActivite(Typeofactivite typeofactivite){
        return typeOfActiviteService.save(typeofactivite);
    }

    @PutMapping("/updateTypeOfActivite")
    public String updateTypeOfActivite(Typeofactivite typeofactivite){
        typeOfActiviteService.update(typeofactivite);
        return "Typeofactivite updated succefully";
    }

    @DeleteMapping("/deleteTypeOfActivite")
    public String deleteTypeOfActivite(Typeofactivite typeofactivite){
        typeOfActiviteService.delete(typeofactivite);
        return "typeofactivite deleted succefully";
    }

    // endpoints for Exercice  =============

    @GetMapping("/exercices")
    public  List<Exercice> getAllExercices(){
        return (List<Exercice>) exerciceService.findAll();
    }

    @GetMapping("/exercice/{id}")
    public Optional<Exercice> getOneExercicr(@PathVariable("id") Integer id){
        return exerciceService.findById(id);
    }

    @PostMapping("/createExercice")
    public Exercice createExercice(@RequestBody Exercice exercice){
        return exerciceService.save(exercice);
    }

    @PutMapping(value = "/updateExercice")
    public void updateExercice(@RequestBody Exercice exercice){
        exerciceService.update(exercice);
    }
    @DeleteMapping("/deleteExercice/{id}")
    public void  deleteExercice(@PathVariable("id") Integer id){
        exerciceService.delete(id);
    }

    // endpoints for activite  =============

    @GetMapping("/activites")
    public  List<Activite> getAllactivites(){
        return (List<Activite>) activiteService.findAll();
    }

    @GetMapping("/activite/{id}")
    public Optional<Activite> getOneactivite(@PathVariable("id") Integer id){
        return activiteService.findById(id);
    }

    @PostMapping("/createactivite")
    public Activite createactivite(@RequestBody Activite activite){
        return activiteService.save(activite);
    }

    @PutMapping("/updateactivite")
    public void updateactivite(@RequestBody Activite activite){
        activiteService.update(activite);
    }

    @DeleteMapping("/deleteactivite/{id}")
    public void deleteactivite(@PathVariable("id") Integer id){
        activiteService.delete(id);
    }


    // add participant to activites

//   @GetMapping("/addParticipant")
//    public String addParticipant(){
//       Participant participant1= participantRepository.getById(6);
//       Participant participant2= participantRepository.getById(7);
//
//       Activite activite = activiteRepository.getById(1);
//       activite.getParticipants().addAll(Arrays.asList(participant1, participant2));
//       activiteService.save(activite);
//       return  "added successfully";
//   }



}
