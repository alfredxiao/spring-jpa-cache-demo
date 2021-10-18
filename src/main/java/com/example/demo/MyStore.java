package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
@Slf4j
public class MyStore {
    MyRepository myRepository;

//    @Cacheable("storeCache")
    Optional<MyEntity> findByMyId(String s) {
        Optional<MyEntity> result = myRepository.findByMyId(s);
        if (result.isEmpty()) {
            log.info("result from repository is EMPTY");
        }

        return result;
    }
}
