package com.example.mySpringProject.controller;

import com.example.mySpringProject.entities.Adventure;
import com.example.mySpringProject.repositories.AdventureRepository;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/traveladventures")
public class TravelAdventuresController {

    private final AdventureRepository adventureRepository;

    public TravelAdventuresController(AdventureRepository adventureRepo) {
        this.adventureRepository = adventureRepo;
    }

    // Add controller methods below:
    @GetMapping()
    public Iterable<Adventure> getAdventures() {
        return this.adventureRepository.findAll();
    }

    @GetMapping("/bycountry/{country}")
    public Iterable<Adventure> getAdventuresByCountry(@PathVariable String country) {
        return this.adventureRepository.findByCountry(country);
    }

    @GetMapping("/bystate")
    public Iterable<Adventure> getAdventuresByState(@RequestParam String state) {
        return this.adventureRepository.findByState(state);
    }

    @PostMapping()
    public Adventure addNewAdventure(@RequestBody Adventure adventure) {
        return this.adventureRepository.save(adventure);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Adventure> getAdventures(@PathVariable int id, @RequestBody Adventure adventure) {
        Optional<Adventure> existing = this.adventureRepository.findById(id);
        if (existing.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        Adventure toUpdate = existing.get();
        toUpdate.setBlogCompleted(adventure.getBlogCompleted());

        Adventure updated = adventureRepository.save(toUpdate);
        return ResponseEntity.ok(updated);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Adventure> deleteAdventure(@PathVariable int id) {
            Optional<Adventure> existing = this.adventureRepository.findById(id);
            if (existing.isEmpty()) {
                return ResponseEntity.notFound().build();
            }

            this.adventureRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
    }

