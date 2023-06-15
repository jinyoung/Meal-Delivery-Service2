package meal.delivery.service.domain;

import java.util.*;
import lombok.*;
import meal.delivery.service.domain.*;
import meal.delivery.service.infra.AbstractEvent;

@Data
@ToString
public class IngredientCreated extends AbstractEvent {

    private String ingredientId;

    public IngredientCreated(Ingredient aggregate) {
        super(aggregate);
    }

    public IngredientCreated() {
        super();
    }
}
