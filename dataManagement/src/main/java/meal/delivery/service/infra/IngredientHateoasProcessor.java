package meal.delivery.service.infra;

import meal.delivery.service.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class IngredientHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Ingredient>> {

    @Override
    public EntityModel<Ingredient> process(EntityModel<Ingredient> model) {
        return model;
    }
}
