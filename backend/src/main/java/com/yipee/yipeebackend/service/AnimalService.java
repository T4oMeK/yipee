package com.yipee.yipeebackend.service;

import com.yipee.yipeebackend.domain.Animal;
import com.yipee.yipeebackend.dto.AnimalDto;
import com.yipee.yipeebackend.repository.AnimalRepository;
import com.yipee.yipeebackend.utility.ExceptionUtility;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimalService {
    private final AnimalRepository repository;

    public List<AnimalDto> getAllAnimals() {
        return repository.findAll().stream().map(AnimalService::convertToDto).toList();
    }

    public AnimalDto getAnimal(Integer id) {
        return convertToDto(getAnimalEntity(id));
    }

    public Animal getAnimalEntity(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> ExceptionUtility.entityNotFound("Animal", id));
    }

    public static AnimalDto convertToDto(Animal animal) {
        return AnimalDto.builder()
                .id(animal.getId())
                .name(animal.getName())
                .type(animal.getType())
                .isFed(animal.getIsFed())
                .isBrushed(animal.getIsBrushed())
                .isClean(animal.getIsClean())
                .build();
    }
}
