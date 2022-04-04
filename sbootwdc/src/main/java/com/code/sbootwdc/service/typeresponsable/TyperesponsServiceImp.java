package com.code.sbootwdc.service.typeresponsable;

import com.code.sbootwdc.model.Typeresponsable;
import com.code.sbootwdc.repository.TyperesponsabRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TyperesponsServiceImp implements TyperesponsableService{
    @Autowired
    TyperesponsabRepos typeresponsabRepos;

    @Override
    public List<Typeresponsable> findAll() {
        return  typeresponsabRepos.findAll();
    }

    @Override
    public Optional<Typeresponsable> findById(Integer id) {
        return typeresponsabRepos.findById(id);
    }

    @Override
    public void delete(Typeresponsable typeresponsable) {
        typeresponsabRepos.delete(typeresponsable);
    }

    @Override
    public Typeresponsable save(Typeresponsable typeresponsable) {
        return typeresponsabRepos.save(typeresponsable);
    }

    @Override
    public Typeresponsable update(Typeresponsable typeresponsable) {
        return typeresponsabRepos.save(typeresponsable);
    }
}
