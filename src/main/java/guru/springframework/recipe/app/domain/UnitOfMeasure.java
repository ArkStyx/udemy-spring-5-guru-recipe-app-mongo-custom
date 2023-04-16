package guru.springframework.recipe.app.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document
public class UnitOfMeasure {

	@Id
	private Long id;
	
	private String description;
}
