package com.code.sbootwdc.service.activite;


import com.code.sbootwdc.model.Activite;
import com.code.sbootwdc.model.Exercice;
import com.code.sbootwdc.repository.ActiviteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActiviteServiceImp implements ActiviteService{
    @Autowired
    ActiviteRepository activiteRepository;
    @Override
    public List<Activite> findAll() {
        return activiteRepository.findAll();
    }

    @Override
    public Optional<Activite> findById(Integer id) {
        return activiteRepository.findById(id);
    }

    @Override
    public void delete(Activite activite) {
        activiteRepository.delete(activite);
    }

    @Override
    public Activite save(Activite activite) {
        return activiteRepository.save(activite);
    }

    @Override
    public Activite update(Activite activite) {
        return activiteRepository.save(activite);
    }
}
