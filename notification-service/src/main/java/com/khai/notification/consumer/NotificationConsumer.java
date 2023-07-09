package com.khai.notification.consumer;

import com.khai.clients.inventory.NotificationDto;
import com.khai.notification.service.NotificationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;


@AllArgsConstructor
@Slf4j
@Component
public class NotificationConsumer {

    private final NotificationService notificationService;

    @RabbitListener(queues = "${rabbitmq.queues.notification}")
    public void send(NotificationDto notificationDto){
        log.info("Notification consumer: Start find all size");
        notificationService.send(notificationDto);
        log.info("Notification consumer: End find all size");
    }
}
