package com.code.sbootwdc.repository;

import com.code.sbootwdc.model.Responsable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ResponsableRepository extends JpaRepository<Responsable,Integer> {
}
