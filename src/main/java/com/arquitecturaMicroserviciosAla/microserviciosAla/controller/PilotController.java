package com.arquitecturaMicroserviciosAla.microserviciosAla.controller;


import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.arquitecturaMicroserviciosAla.microserviciosAla.service.PilotService;
import com.arquitecturaMicroserviciosAla.microserviciosAla.model.Pilot;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pilots")
class PilotController {
    @Autowired
    private PilotService service;

    @GetMapping
    public List<Pilot> getAllPilots() { return service.getAllPilots(); }

    @GetMapping("/{id}")
    public Optional<Pilot> getPilot(@PathVariable String id) { return service.getPilotById(id); }

    @PostMapping
    public Pilot addPilot(@RequestBody Pilot pilot) { return service.addPilot(pilot); }

    @DeleteMapping("/{id}")
    public void deletePilot(@PathVariable String id) { service.deletePilot(id); }
}