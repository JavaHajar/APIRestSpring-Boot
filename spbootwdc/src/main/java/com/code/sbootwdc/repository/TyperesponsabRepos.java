package com.code.sbootwdc.repository;

import com.code.sbootwdc.model.Typeresponsable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TyperesponsabRepos extends JpaRepository <Typeresponsable,Integer> {
}
