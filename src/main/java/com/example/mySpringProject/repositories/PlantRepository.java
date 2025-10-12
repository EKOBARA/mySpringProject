package com.example.mySpringProject.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.mySpringProject.entities.Plant;

public interface PlantRepository extends CrudRepository<Plant, Integer> {
}