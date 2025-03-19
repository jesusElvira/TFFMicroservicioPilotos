package com.arquitecturaMicroserviciosAla.microserviciosAla.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arquitecturaMicroserviciosAla.microserviciosAla.model.Pilot;
import com.arquitecturaMicroserviciosAla.microserviciosAla.repository.PilotRepository;
import java.util.List;
import java.util.Optional;

@Service
public class PilotService {
    @Autowired
    private PilotRepository repository;

    public List<Pilot> getAllPilots() { return repository.findAll(); }
    public Optional<Pilot> getPilotById(String id) { return repository.findById(id); }
    public Pilot addPilot(Pilot pilot) { return repository.save(pilot); }


    public Pilot updatePilot(String id, Pilot pilot) {
        // Busca el piloto existente por ID
        Pilot existingPilot = repository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Piloto no encontrado"));

        // Actualiza los campos del piloto existente
        existingPilot.setName(pilot.getName());
        existingPilot.setRank(pilot.getRank());

        // Guarda el piloto actualizado en MongoDB
        return repository.save(existingPilot);
    }

    public void deletePilot(String id) { repository.deleteById(id); }
}
