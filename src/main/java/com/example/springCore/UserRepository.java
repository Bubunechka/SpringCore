package com.example.springCore;

import org.springframework.data.repository.CrudRepository;

import com.example.springCore.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

//    Spring автоматически реализует этот интерфейс репозитория в одноименном компоненте
//    (с изменением регистра — он называется userRepository
}