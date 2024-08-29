package com.kgisl.sb101.repository;
 
 
import org.springframework.data.repository.ListCrudRepository;
 
import com.kgisl.sb101.entity.Person;
 
 
   public interface PersonRepository extends ListCrudRepository<Person, Long>{
   
   
 
}
 