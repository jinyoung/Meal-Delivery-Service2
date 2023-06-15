package meal.delivery.service.infra;

import meal.delivery.service.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class OrderHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Order>> {

    @Override
    public EntityModel<Order> process(EntityModel<Order> model) {
        model.add(
            Link
                .of(
                    model.getRequiredLink("self").getHref() +
                    "//order/{orderId}/delivery"
                )
                .withRel("/order/{orderId}/delivery")
        );

        return model;
    }
}
