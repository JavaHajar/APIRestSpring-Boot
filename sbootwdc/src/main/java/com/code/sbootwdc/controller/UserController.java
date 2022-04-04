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

//    @Autowired
//    UserService userService;


//    @PostMapping("/createUser")
//    public String save(){
//        System.out.println("test save controller");
//        Role role = new Role("admin");
//        User user = new User(1,"hajar","boudali","67576576567","hjar@test.com","hajarhajar",true, "it",role);
//        userService.save(user);
//       return "saved successfully" ;
//    }

    //     endpoints for admin  =============

    @PostMapping("/createtadmin")

    public String saveadmin() {
        Role role = new Role();
        role.setId(1);
//        Admin admin = new Admin("admin", "admin", "09809809809", "admin@gmail.com", "admin1234", true, role, "it");
       Admin admin = new Admin();
        admin.setNom("test");
       admin.setPrenom("test");
       admin.setTele("76876868");
       admin.setEmail("test@gmail.com");
       admin.setPassword("test1234");
       admin.setEtat(true);
       admin.setRoles(role);
       admin.setDomaine("it");
       adminService.save(admin);
       return "success";
    }
}