package ir.java.up.controller;

import ir.java.up.model.Person1;
import ir.java.up.service.Person1ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class Person1Controller {
@Autowired
private Person1ServiceImpl person1Service;
    @PostMapping
    public ResponseEntity<Person1> save(@RequestBody Person1 person1){

     return ResponseEntity.ok(person1Service.save(person1));
    }


    @PutMapping
    public ResponseEntity<Person1> update(@RequestBody Person1 person1){
        return ResponseEntity.ok(person1Service.update(person1));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person1> findById(@PathVariable Long id){
        Person1 ById=person1Service.findById(id);
        return ResponseEntity.ok(ById);
    }

    @GetMapping
    public ResponseEntity<List<Person1>> findAll(){
        return ResponseEntity.ok(person1Service.findAll());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        person1Service.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{name}/{lastname}")
    public ResponseEntity<Person1> findByNameAndLastName(@PathVariable String name,@PathVariable String lastname){
      return   ResponseEntity.ok( person1Service.findByNameAndLastName(name,lastname));
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Person1> findByQuery(@PathVariable String name){
        return   ResponseEntity.ok( person1Service.findByquery(name));
    }
}
