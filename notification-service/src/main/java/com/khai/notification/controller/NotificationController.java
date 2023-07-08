package com.khai.notification.controller;

import com.khai.clients.inventory.NotificationDto;
import com.khai.notification.service.NotificationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/notification")
@Slf4j
public class NotificationController {

    private final NotificationService notificationService;

    @PostMapping("send")
    public String send(@RequestBody NotificationDto notificationDto){
        log.info("Notification controller: Start find all size");
        notificationService.send(notificationDto);
        log.info("Notification controller: End find all size");
        return "Send message successfully";
    }
}
