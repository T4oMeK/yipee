package com.yipee.yipeebackend.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="Animal")
@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Animal {
    @Id
    @GeneratedValue
    private int id;

    private @NonNull String name;

    private @NonNull String type;

    private @NonNull Integer happiness;

    private @NonNull Boolean isFed;

    private @NonNull Boolean isBrushed;

    private @NonNull Boolean isClean;
}
