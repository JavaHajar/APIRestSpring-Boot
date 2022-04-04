package com.code.sbootwdc.service.typeOfActivite;

import com.code.sbootwdc.model.Typeofactivite;
import com.code.sbootwdc.repository.TypeofactiviteRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypeOfActiviteServiceImp implements TypeOfActiviteService {

    @Autowired
    TypeofactiviteRepos typeofactiviteRepos;

    @Override
    public List<Typeofactivite> findAll() {
        return typeofactiviteRepos.findAll();
    }

    @Override
    public Optional<Typeofactivite> findById(Integer id) {
        return typeofactiviteRepos.findById(id);
    }

    @Override
    public void delete(Typeofactivite typeofactivite) {
        typeofactiviteRepos.delete(typeofactivite);
    }

    @Override
    public Typeofactivite save(Typeofactivite typeofactivite) {
        return typeofactiviteRepos.save(typeofactivite);
    }

    @Override
    public Typeofactivite update(Typeofactivite typeofactivite) {
        return typeofactiviteRepos.save(typeofactivite);
    }
}
