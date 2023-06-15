package meal.delivery.service.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import meal.delivery.service.config.kafka.KafkaProcessor;
import meal.delivery.service.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    OrderRepository orderRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeliveryUpdated'"
    )
    public void wheneverDeliveryUpdated_DeliveryStatusChange(
        @Payload DeliveryUpdated deliveryUpdated
    ) {
        DeliveryUpdated event = deliveryUpdated;
        System.out.println(
            "\n\n##### listener DeliveryStatusChange : " +
            deliveryUpdated +
            "\n\n"
        );

        // Sample Logic //
        Order.deliveryStatusChange(event);
    }
}
