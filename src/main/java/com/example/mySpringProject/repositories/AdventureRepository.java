package com.example.mySpringProject.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.example.mySpringProject.entities.Adventure;

public interface AdventureRepository extends CrudRepository<Adventure, Integer> {
    public List<Adventure> findByCountry(String country);
    public List<Adventure> findByState(String state);

}