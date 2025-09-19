package com.example.mySpringProject.repositories;

import com.example.mySpringProject.entities.SuperHero;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SuperHeroRepository extends CrudRepository<SuperHero, Integer>  {
    public List<SuperHero> findByCountry(String country);
    public List<SuperHero> findByState(String state);
}