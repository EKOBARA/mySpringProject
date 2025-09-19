package com.example.mySpringProject.controller;

import com.example.mySpringProject.entities.Adventure;
import com.example.mySpringProject.repositories.AdventureRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/adventures")
public class TravelAdventuresController {

    private final AdventureRepository adventureRepository;

    public TravelAdventuresController(AdventureRepository adventureRepo) {
        this.adventureRepository = adventureRepo;
    }

    // Add controller methods below:
    @GetMapping()
    public Iterable<Adventure> getAdventures() {
        return adventureRepository.findAll();
    }

}