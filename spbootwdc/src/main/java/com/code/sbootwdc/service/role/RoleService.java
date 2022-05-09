package com.code.sbootwdc.service.role;

import com.code.sbootwdc.model.Role;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface RoleService {
    public List<Role> findAll();
    public Optional<Role> findById(Integer id);
    public void delete(Role role);
    public Role save(Role role);
    public Role update(Role role);
}
