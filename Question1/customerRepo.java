package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface customerRepo extends CrudRepository<customer, Integer>

{

}
