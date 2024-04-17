package com.laxminarayana.DogsManagmentSystem.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.laxminarayana.DogsManagmentSystem.Model.Dog;

@Repository
public interface DogRepository extends CrudRepository<Dog,Integer>{

}
