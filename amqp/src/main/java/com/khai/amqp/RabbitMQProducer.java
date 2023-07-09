package com.khai.amqp;

import com.rabbitmq.client.AMQP;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class RabbitMQProducer {

    private final AmqpTemplate amqpTemplate;

    public void publish(Object payload, String exchange, String routingKey){
        log.info("Starting publish to {} using routing key {}. Payload {}", exchange, routingKey, payload);
        amqpTemplate.convertAndSend(exchange,routingKey,payload);
        log.info("End publish to {} using routing key {}. Payload {}", exchange, routingKey, payload);
    }
}
