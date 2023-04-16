package guru.springframework.recipe.app.domain;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Notes {

	@Id
	private Long id;
	
	private String recipeNotes;
}
