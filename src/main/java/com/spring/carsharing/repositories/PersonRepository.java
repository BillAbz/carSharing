package com.spring.carsharing.repositories;

import com.spring.carsharing.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Integer> {

    @Override
    List<Person> findAll();
}
