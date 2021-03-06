package com.code.sbootwdc.repository;
import com.code.sbootwdc.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByTypeofuser(String typeofuser);
}
