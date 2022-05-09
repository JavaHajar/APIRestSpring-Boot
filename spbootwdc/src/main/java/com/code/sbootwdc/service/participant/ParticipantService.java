package com.code.sbootwdc.service.participant;

import com.code.sbootwdc.model.Participant;
import com.code.sbootwdc.model.Responsable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public interface ParticipantService {
    public List<Participant> findAll();
    public Optional<Participant> findById(Integer id);
    public void delete(Participant participant);
    public Participant save(Participant Participant);
    public Participant update(Participant Participant);
}
