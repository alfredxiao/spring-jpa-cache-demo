package com.example.demo;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MyRepository extends JpaRepository<MyEntity, String> {

    @Cacheable(value = "MY_ENTITY", unless = "#result == null")
    Optional<MyEntity> findByMyId(String s);
}
