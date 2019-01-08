package com.arnaud.first.demo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Data
 *  This is a convenient shortcut annotation that bundles the features of
 * @ToString,
 * @EqualsAndHashCode,
 * @Getter,
 * @Setter and
 * @RequiredArgsConstructor
 */
@Entity
@Data
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue
    private Long id;

    private @NonNull String name;
}

