package jjad.springframework.recipe.controllers;

import jjad.springframework.recipe.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {

    private RecipeService recipeService;

    public IndexController(RecipeService recipesService){
        this.recipeService = recipesService;
    }

    @RequestMapping({"", "/", "/index"})
    public String index(Model model){
        log.debug("Executing index");
        model.addAttribute("recipes", recipeService.getRecipes());
        log.debug("Added recipes to model object");
        return "index";
    }
}
