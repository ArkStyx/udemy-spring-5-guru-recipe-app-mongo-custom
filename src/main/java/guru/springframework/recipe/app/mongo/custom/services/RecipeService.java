package guru.springframework.recipe.app.mongo.custom.services;

import java.util.Set;

import guru.springframework.recipe.app.mongo.custom.commands.RecipeCommand;
import guru.springframework.recipe.app.mongo.custom.domains.Recipe;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(String id);

    RecipeCommand findCommandById(String id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(String idToDelete);
}
