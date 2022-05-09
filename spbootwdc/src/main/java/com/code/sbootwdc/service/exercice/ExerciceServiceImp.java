package com.code.sbootwdc.service.exercice;

import com.code.sbootwdc.model.Exercice;
import com.code.sbootwdc.repository.ExerciceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExerciceServiceImp implements ExerciceService{

    @Autowired
    ExerciceRepository exerciceRepository;

    @Override
    public List<Exercice> findAll() {
        return exerciceRepository.findAll();
    }

    @Override
    public Optional<Exercice> findById(Integer id) {
        return exerciceRepository.findById(id);
    }

    @Override
    public void delete(Integer id) {
         exerciceRepository.deleteById(id);
    }

    @Override
    public Exercice save(Exercice exercice) {
        return exerciceRepository.save(exercice);
    }

    @Override
    public Exercice update(Exercice exercice) {
        return exerciceRepository.save(exercice);
    }
}
