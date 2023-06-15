package meal.delivery.service.domain;

import java.util.*;
import lombok.*;
import meal.delivery.service.domain.*;
import meal.delivery.service.infra.AbstractEvent;

@Data
@ToString
public class DeliveryUpdated extends AbstractEvent {

    private String orderId;
    private String deliveryStatus;

    public DeliveryUpdated(Order aggregate) {
        super(aggregate);
    }

    public DeliveryUpdated() {
        super();
    }
}
