package com.khai.clients.inventory;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "NOTIFICATION-SERVICE", path = "/api/v1/notification")
public interface NotificationClient {

    @PostMapping("/send")
    public String send(@RequestBody NotificationDto notificationDto);
}
