package com.yipee.yipeebackend.repository;

import com.yipee.yipeebackend.domain.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {

}
