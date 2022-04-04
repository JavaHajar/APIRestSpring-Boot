package com.code.sbootwdc.repository;

import com.code.sbootwdc.model.Admin;
import com.code.sbootwdc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends  JpaRepository<Admin, Integer>  {
}
