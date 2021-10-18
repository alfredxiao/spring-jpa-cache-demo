package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class CmdLine implements CommandLineRunner {

    MyStore myStore;

    @Override
    public void run(String... args) throws Exception {
        while (true) {
            Optional<MyEntity> myEntity1 = myStore.findByMyId("001");
            myEntity1.ifPresent(entity -> System.out.println("001/CITY= " + entity.getCity()));

            Optional<MyEntity> myEntity2 = myStore.findByMyId("002");
            myEntity2.ifPresentOrElse(entity -> System.out.println("002/CITY= " + entity.getCity()), () -> {
                System.out.println("002 do NOT exist");
            });

            Thread.sleep(3000);
        }
    }
}
