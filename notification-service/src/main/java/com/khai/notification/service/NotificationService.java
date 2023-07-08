package com.khai.notification.service;


import com.khai.clients.inventory.NotificationDto;

public interface NotificationService {
    void send(NotificationDto notificationDto);
}
