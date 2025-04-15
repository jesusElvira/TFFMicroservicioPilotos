package com.arquitecturaMicroserviciosAla.microserviciosAla.controller;


import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.arquitecturaMicroserviciosAla.microserviciosAla.service.PilotService;
import com.arquitecturaMicroserviciosAla.microserviciosAla.model.Pilot;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping("/pilots")
class PilotController {
    @Autowired
    private PilotService service;

    @CrossOrigin(origins = "*")
    @GetMapping
    public List<Pilot> getAllPilots() { return service.getAllPilots(); }

    @CrossOrigin(origins = "*")
    @GetMapping("/{id}")
    public Optional<Pilot> getPilot(@PathVariable String id) { return service.getPilotById(id); }

    @CrossOrigin(origins = "*")
    @PostMapping
    public Pilot addPilot(@RequestBody Pilot pilot) { return service.addPilot(pilot); }

        // Método para actualizar un piloto
        @CrossOrigin(origins = "*")
        @PutMapping("/{id}")
        public Pilot updatePilot(@PathVariable String id, @RequestBody Pilot pilot) {
            return service.updatePilot(id, pilot);
        }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/{id}")
    public void deletePilot(@PathVariable String id) { service.deletePilot(id); }
}