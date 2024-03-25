package jjad.springframework.recipe.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    Category category;

    @BeforeEach
    public void setUp(){
        category = new Category();
    }

    @Test
    void getId() {
        Long id = 4l;

        category.setId(id);

        assertEquals(id, category.getId());
    }

    @Test
    void getDescription() {
        String description = "categoryDescription";

        category.setDescription(description);

        assertEquals(description, category.getDescription());
    }
}