package com.code.sbootwdc.service.typeOfActivite;

import com.code.sbootwdc.model.Typeofactivite;
import com.code.sbootwdc.model.Typeresponsable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface TypeOfActiviteService {
    public List<Typeofactivite> findAll();
    public Optional<Typeofactivite> findById(Integer id);
    public void delete(Typeofactivite typeofactivite);
    public Typeofactivite save(Typeofactivite typeofactivite);
    public Typeofactivite update(Typeofactivite typeofactivite);
}
