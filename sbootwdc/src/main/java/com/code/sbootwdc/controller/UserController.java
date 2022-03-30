package com.code.sbootwdc.controller;
import com.code.sbootwdc.model.Role;
import com.code.sbootwdc.model.User;
import com.code.sbootwdc.service.user.UserService;
import com.code.sbootwdc.service.user.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;


//    @PostMapping("/createUser")
//    public String save(){
//        System.out.println("test save controller");
//        Role role = new Role("admin");
//        User user = new User(1,"hajar","boudali","67576576567","hjar@test.com","hajarhajar",true, "it",role);
//        userService.save(user);
//       return "saved successfully" ;
//    }
}
