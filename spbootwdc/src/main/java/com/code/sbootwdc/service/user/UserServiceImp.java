package com.code.sbootwdc.service.user;


import com.code.sbootwdc.model.Admin;
import com.code.sbootwdc.model.Role;
import com.code.sbootwdc.model.User;
import com.code.sbootwdc.repository.RoleRepository;

import com.code.sbootwdc.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Service
@Slf4j
public class UserServiceImp implements UserService, UserDetailsService {
    @Autowired
    UserRepository userRepos;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    PasswordEncoder passwordEncoder;


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepos.findByEmail(email);
        if(user == null){
            log.error("user not found in the database");
            throw new UsernameNotFoundException("user not found in the database");
        }else {
            log.info("user found: {}", email);
        }
        Collection <SimpleGrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(user.getRoles().getTypeofuser()));
        return  new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), authorities);
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Admin save(Admin admin) {
        return null;
    }

//    @Override
//    public Admin save(Admin admin) {
//        return userRepos.save(admin);
//    }

    @Override
    public User update(User user) {
        return null;
    }


    // added
    
    @Override
    public User saveUser(User user) {
        log.info("saving new user to database");
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepos.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("saving new role {} to database", role.getTypeofuser());
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String email, String roleName) {
        log.info("saving new role {}  and user {} to database", roleName, email);
      User user = userRepos.findByEmail(email);
      Role role = roleRepository.findByTypeofuser(roleName);
      user.setRoles(role);
    }

    @Override
    public User getUser(String email) {
        return userRepos.findByEmail(email);
    }

    @Override
    public List<User> getUsers() {
        return userRepos.findAll();
    }



}
