package guru.springframework.recipe.app.mongo.custom.services;

import java.util.Set;

import guru.springframework.recipe.app.mongo.custom.commands.UnitOfMeasureCommand;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
