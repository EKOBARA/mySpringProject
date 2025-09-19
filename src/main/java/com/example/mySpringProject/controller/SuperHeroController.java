package com.example.mySpringProject.controller;

import java.util.*;
import java.lang.Iterable;

import com.example.mySpringProject.entities.SuperHero;
import com.example.mySpringProject.repositories.SuperHeroRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/superHeroes")
public class SuperHeroController {
    private final SuperHeroRepository superHeroRepository;
//    private final SuperReportRepository superReportRepository;

    public SuperHeroController(SuperHeroRepository superHeroRepository
//                               ,SuperReportRepository superReportRepository
    ) {
        this.superHeroRepository = superHeroRepository;
//        this.superReportRepository = superReportRepository;
    }

    @GetMapping()
    public Iterable<SuperHero> getSuperHeros() {
        Iterable<SuperHero> superHeroes = superHeroRepository.findAll();
        return superHeroes;
    }

//    public String createNewSuperHero(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String superPower) {
//        SuperHero newSuperHero = new SuperHero(firstName, lastName, superPower);
//        superHeroRepository.save(newSuperHero);
//        return "New Super Hero successfully added!";
//    }
//
//    @PostMapping(path="/help")
//    public String postHelp(@RequestParam String postalCode, @RequestParam String streetAddress) {
//        SuperReport newSuperReport = new SuperReport(postalCode, streetAddress, "");
//        superReportRepository.save(newSuperReport);
//        return "Thanks! Super Heroes have been dispatched to your location!";
//    }
//
//    @GetMapping(path="/heroReport")
//    public Iterable<SuperReport> getHeroReport() {
//        Iterable<SuperReport> superReport = superReportRepository.findAll();
//        return superReport;
//    }
//
//    @PostMapping(path="/{postalCode}")
//    public Iterable<SuperReport> getHeroReportByPostal(@PathVariable String postalCode) {
//        Iterable<SuperReport> superReport = superReportRepository.findByPostalCode(postalCode);
//        return superReport;
//    }
}

//class SuperReport {
//    public String zip;
//
//}
//
//class SuperReportRepository {
//    public SuperReport superReport;
//}