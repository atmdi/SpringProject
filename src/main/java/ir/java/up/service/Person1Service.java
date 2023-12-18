package ir.java.up.service;

import ir.java.up.model.Person1;

import java.util.List;

public interface Person1Service {
    Person1 save(Person1 person1);

    Person1 update(Person1 person1);

    Person1 findById(Long id);

    List<Person1> findAll();

    void delete(Long id);

    Person1 findByNameAndLastName(String name,String lastname);

    Person1 findByquery(String name);

}
