package meal.delivery.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import meal.delivery.service.DeliveryApplication;
import meal.delivery.service.domain.OrderPlaced;

@Entity
@Table(name = "Order_table")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String orderId;

    private String customerId;

    private String paymentMethod;

    private String deliveryAddress;

    private String deliveryStatus;

    @PostPersist
    public void onPostPersist() {
        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static OrderRepository repository() {
        OrderRepository orderRepository = DeliveryApplication.applicationContext.getBean(
            OrderRepository.class
        );
        return orderRepository;
    }

    public void updateDelivery(UpdateDeliveryCommand updateDeliveryCommand) {
        //implement business logic here:

        DeliveryUpdated deliveryUpdated = new DeliveryUpdated(this);
        deliveryUpdated.publishAfterCommit();
    }

    public static void deliveryStatusChange(DeliveryUpdated deliveryUpdated) {
        //implement business logic here:

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryUpdated.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

    }
}
