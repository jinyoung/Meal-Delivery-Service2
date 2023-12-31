package meal.delivery.service.infra;

import meal.delivery.service.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomerHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Customer>> {

    @Override
    public EntityModel<Customer> process(EntityModel<Customer> model) {
        return model;
    }
}
