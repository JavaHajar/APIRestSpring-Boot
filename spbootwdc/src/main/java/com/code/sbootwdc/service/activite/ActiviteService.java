package com.code.sbootwdc.service.activite;

import com.code.sbootwdc.model.Activite;
import com.code.sbootwdc.model.Exercice;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public interface ActiviteService {
    public List<Activite> findAll();
    public Optional<Activite> findById(Integer id);
    public void delete(Integer id);
    public Activite save(Activite Activite);
    public Activite update(Activite Activite);
}
