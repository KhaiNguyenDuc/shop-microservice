package com.khai.notification;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {
        "com.khai.notification",
        "com.khai.amqp"
})
public class NotificationApplication {
    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }

    @Bean
    ModelMapper mapper(){
        return new ModelMapper();
    }
//
//    @Bean
//    CommandLineRunner commandLineRunner(
//            NotificationConfig notificationConfig,
//            RabbitMQProducer rabbitMQProducer){
//        return args -> {
//            rabbitMQProducer.publish("Send message succesfully",
//                    notificationConfig.getInternalExchange(), notificationConfig.getInternalNotificationRoutingKey());
//        };
//    }

}