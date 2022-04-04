package com.code.sbootwdc.service.typeresponsable;

import com.code.sbootwdc.model.Typeresponsable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TyperesponsableService {
    public List<Typeresponsable> findAll();
    public Optional<Typeresponsable> findById(Integer id);
    public void delete(Typeresponsable typeresponsable);
    public Typeresponsable save(Typeresponsable typeresponsable);
    public Typeresponsable update(Typeresponsable typeresponsable);
}
