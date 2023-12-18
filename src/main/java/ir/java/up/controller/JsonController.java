package ir.java.up.controller;

import ir.java.up.model.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("json")
public class JsonController {
    @GetMapping("/{id}/{name}/{lastname}")
    public ResponseEntity<Person> person(@PathVariable Long id, @PathVariable String name, @PathVariable String lastname){
        return ResponseEntity.ok (new Person(id,name,lastname));
    }

    @PostMapping
    public ResponseEntity<Person> save(@RequestBody @Validated Person person){
        return ResponseEntity.ok(person);
    }


}
