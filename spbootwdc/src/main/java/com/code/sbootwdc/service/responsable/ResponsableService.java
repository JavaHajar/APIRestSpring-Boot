package com.code.sbootwdc.service.responsable;

import com.code.sbootwdc.model.Responsable;
import com.code.sbootwdc.model.Role;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ResponsableService {
    public List<Responsable> findAll();
    public Optional<Responsable> findById(Integer id);
    public void delete(Responsable responsable);
    public Responsable save(Responsable responsable);
    public Responsable update(Responsable responsable);
}
