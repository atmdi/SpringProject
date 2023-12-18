package ir.java.up.repository;

import ir.java.up.model.Person1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Person1Repository extends JpaRepository <Person1,Long> {
    Optional<Person1> findByNameAndLastname(String name, String lastname);

    @Query(value = "select  p from Person1 p where p.name=:name  ")
    Optional<Person1> findByquery(String name);
}
