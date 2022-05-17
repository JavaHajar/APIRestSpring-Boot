package com.code.sbootwdc.controller;

import com.code.sbootwdc.model.LoginRequest;
import com.code.sbootwdc.model.Role;
import com.code.sbootwdc.model.User;
import com.code.sbootwdc.security.jwt.JwtUtils;
import com.code.sbootwdc.service.user.UserService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;


@RequiredArgsConstructor
@Slf4j
@RestController
public class AuthController {

    private final UserService userService;
    private final AuthenticationManager authenticationManager;
    private final JwtUtils jwtUtils;

//    @GetMapping("/users")
//    public ResponseEntity<List<User>> getAllUsers(){
//        log.info("get useers");
//        System.out.println("test get users");
//        return ResponseEntity.ok().body(userService.getUsers());
//    }

//    @PostMapping("/user/save")
//    public ResponseEntity<User> saveUser(@RequestBody User user){
////        user.setRoles(new Role(1, "ADMIN"));
////        user.setDomaine("IT");
////        user.setEtat(true);
//        // log.info("save user "+user.getGenreUser());
//        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/user/save").toString());
//        return ResponseEntity.created(uri).body(userService.saveUser(user));
//    }



    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
        log.info("inside auth method "+ loginRequest.getPassword());
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword()));

        log.info("inside auth method line 76"+ loginRequest.getPassword());

        SecurityContextHolder.getContext().setAuthentication(authentication);
        log.info("inside auth method line 77"+ loginRequest.getPassword());
        String jwt = jwtUtils.generateJwtToken(authentication);
        log.info("inside auth method"+ loginRequest.getPassword());



        org.springframework.security.core.userdetails.User userDetails = (org.springframework.security.core.userdetails.User) authentication.getPrincipal();
        List<String> roles = userDetails.getAuthorities().stream()
                .map(item -> item.getAuthority())
                .collect(Collectors.toList());

        return ResponseEntity.ok(new com.code.sbootwdc.security.jwt.JwtResponse(jwt , userDetails.getUsername(), roles));
    }

    @Data
    class RoleToUserForm{
        private String username;
        private String roleName;
    }
    }


