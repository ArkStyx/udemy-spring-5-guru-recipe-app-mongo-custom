package guru.springframework.recipe.app.domain;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document
public class Category {
	
	@Id
	private Long id;
	
	private String description;
	
	@DBRef
	private Set<Recipe> recipes;
}
