package com.code.sbootwdc.service.user;


import com.code.sbootwdc.model.Admin;
import com.code.sbootwdc.model.Role;
import com.code.sbootwdc.model.User;
import com.code.sbootwdc.repository.RoleRepository;

import com.code.sbootwdc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImp implements UserService{
    @Autowired
    UserRepository userRepos;

    @Autowired
    RoleRepository roleRepository;


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
        return userRepos.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String email, String roleName) {
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
