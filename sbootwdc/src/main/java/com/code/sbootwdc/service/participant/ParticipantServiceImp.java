package com.code.sbootwdc.service.participant;

import com.code.sbootwdc.model.Participant;
import com.code.sbootwdc.repository.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ParticipantServiceImp implements ParticipantService{
    @Autowired
    ParticipantRepository participantRepository;


    @Override
    public List<Participant> findAll() {
        return participantRepository.findAll();
    }

    @Override
    public Optional<Participant> findById(Integer id) {
        return participantRepository.findById(id);
    }

    @Override
    public void delete(Participant participant) {
        participantRepository.delete(participant);
    }

    @Override
    public Participant save(Participant participant) {
        return participantRepository.save(participant);
    }

    @Override
    public Participant update(Participant participant) {
        return participantRepository.save(participant);
    }
}
