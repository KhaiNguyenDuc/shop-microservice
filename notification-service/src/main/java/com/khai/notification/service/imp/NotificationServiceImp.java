package com.khai.notification.service.imp;

import com.khai.clients.inventory.NotificationDto;
import com.khai.notification.model.Notification;
import com.khai.notification.repository.NotificationRepository;
import com.khai.notification.service.NotificationService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NotificationServiceImp implements NotificationService {

    private final NotificationRepository notificationRepository;
    private ModelMapper mapper;

    @Override
    public void send(NotificationDto notificationDto) {
        notificationRepository.save(mapper.map(notificationDto, Notification.class));
    }
}
