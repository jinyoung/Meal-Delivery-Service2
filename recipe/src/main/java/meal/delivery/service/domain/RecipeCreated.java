package meal.delivery.service.domain;

import java.util.*;
import lombok.*;
import meal.delivery.service.domain.*;
import meal.delivery.service.infra.AbstractEvent;

@Data
@ToString
public class RecipeCreated extends AbstractEvent {

    private String recipeId;

    public RecipeCreated(Recipe aggregate) {
        super(aggregate);
    }

    public RecipeCreated() {
        super();
    }
}
