package ir.java.up.service;

import ir.java.up.model.Person1;
import ir.java.up.repository.Person1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Person1ServiceImpl implements Person1Service{
    @Autowired
    Person1Repository person1Repository;

    @Override
    public Person1 save(Person1 person1)
    {
       return person1Repository.save(person1);
    }

    @Override
    public Person1 update(Person1 person1){
      Person1 updatePerson=  person1Repository.findById(person1.getId()).orElseThrow(()->new RuntimeException("not found person"));
      updatePerson.setName(person1.getName());
      updatePerson.setLastname(person1.getLastname());
     return person1Repository.save(updatePerson);
    }

    @Override
    public Person1 findById(Long id){
        return person1Repository.findById(id).orElseThrow(()->new RuntimeException("not found person"));
    }

    @Override
    public List<Person1> findAll(){
        return  person1Repository.findAll();
    }

    @Override
    public  void delete(Long id){
        person1Repository.deleteById(id);
    }

    @Override
    public Person1 findByNameAndLastName(String name,String lastname){
      return   person1Repository.findByNameAndLastname(name,lastname).orElseThrow(()->new RuntimeException("not found"));
    }
    @Override
    public Person1 findByquery(String name){
        return   person1Repository.findByquery(name).orElseThrow(()->new RuntimeException("not found"));
    }



}
