package jjad.springframework.recipe.services;

import jjad.springframework.recipe.commands.IngredientCommand;
import org.springframework.transaction.annotation.Transactional;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long id);

}
