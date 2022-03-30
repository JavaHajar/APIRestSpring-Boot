package com.code.sbootwdc.service.user;


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
    public User save(User user) {
        return userRepos.save(user);
    }

    @Override
    public User update(User user) {
        return null;
    }


    public Role save(Role role){
        return roleRepository.save(role);
    }
}
