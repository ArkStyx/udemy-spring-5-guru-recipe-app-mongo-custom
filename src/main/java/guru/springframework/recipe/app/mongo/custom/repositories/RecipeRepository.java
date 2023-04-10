package guru.springframework.recipe.app.mongo.custom.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.recipe.app.mongo.custom.domains.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, String> {
	
}
