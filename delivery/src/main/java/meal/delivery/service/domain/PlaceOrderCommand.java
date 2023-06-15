package meal.delivery.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class PlaceOrderCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String customerId;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String paymentMethod;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String deliveryAddress;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String meal;
}
