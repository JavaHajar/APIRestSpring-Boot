package com.code.sbootwdc.service.exercice;

import com.code.sbootwdc.model.Exercice;
import com.code.sbootwdc.model.Typeofactivite;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ExerciceService {
    public List<Exercice> findAll();
    public Optional<Exercice> findById(Integer id);
    public void delete(Exercice exercice);
    public Exercice save(Exercice exercice);
    public Exercice update(Exercice exercice);
}
