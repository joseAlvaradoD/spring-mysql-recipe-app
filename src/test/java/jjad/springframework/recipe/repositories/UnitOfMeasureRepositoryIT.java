package jjad.springframework.recipe.repositories;

import jjad.springframework.recipe.model.UnitOfMeasure;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class UnitOfMeasureRepositoryIT {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @BeforeEach
    void setUp() {
    }

    @Test
    void findByDescription() {
        //when
        Optional<UnitOfMeasure> uom = unitOfMeasureRepository.findByDescription("Teaspoon");

        //then
        assertEquals("Teaspoon", uom.get().getDescription());
    }

    @Test
    void findByDescriptionCup() {
        //when
        Optional<UnitOfMeasure> uom = unitOfMeasureRepository.findByDescription("Cup");

        //then
        assertEquals("Cup", uom.get().getDescription());
    }
}