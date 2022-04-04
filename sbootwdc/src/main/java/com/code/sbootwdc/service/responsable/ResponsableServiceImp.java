package com.code.sbootwdc.service.responsable;

import com.code.sbootwdc.model.Responsable;
import com.code.sbootwdc.repository.ResponsableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResponsableServiceImp implements ResponsableService{
    @Autowired
    ResponsableRepository responsableRepository;

    @Override
    public List<Responsable> findAll() {
        return responsableRepository.findAll();
    }

    @Override
    public Optional<Responsable> findById(Integer id) {
        return responsableRepository.findById(id);
    }

    @Override
    public void delete(Responsable responsable) {
        responsableRepository.delete(responsable);
    }

    @Override
    public Responsable save(Responsable responsable) {
        return responsableRepository.save(responsable);
    }

    @Override
    public Responsable update(Responsable responsable) {
        return responsableRepository.save(responsable);
    }
}
