package com.easy.archiecture.domain;

import org.springframework.data.mongodb.repository.MongoRepository;



public interface UserRepository extends MongoRepository<User, String> {

    User findByName(String name);

    User findByNameAndAge(String name, Integer age);


}
