package com.yipee.yipeebackend.config;

import com.yipee.yipeebackend.domain.Animal;
import com.yipee.yipeebackend.repository.AnimalRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class YipeeConfiguration {
    @Bean
    CommandLineRunner commandLineRunner(AnimalRepository animalRepository) {
        return args -> {
            Animal animal1 = new Animal("Janusz", "Pies", 75, true, true, true);
            animalRepository.save(animal1);

            Animal animal2 = new Animal("Gerwazy", "Kot", 10, false, false, true);
            animalRepository.save(animal2);
        };
    }
}
