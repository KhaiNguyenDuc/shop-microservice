package com.khai.notification.controller;

import com.khai.clients.inventory.NotificationDto;
import com.khai.notification.service.NotificationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/notification")
public class NotificationController {

    private final NotificationService notificationService;

    @PostMapping("send")
    public String send(@RequestBody NotificationDto notificationDto){
        notificationService.send(notificationDto);
        return "Send message successfully";
    }
}
