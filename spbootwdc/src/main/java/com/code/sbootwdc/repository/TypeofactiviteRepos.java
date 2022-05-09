package com.code.sbootwdc.repository;

import com.code.sbootwdc.model.Typeofactivite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeofactiviteRepos extends JpaRepository <Typeofactivite, Integer> {
}
