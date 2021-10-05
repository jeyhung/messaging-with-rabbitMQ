package io.github.jeyhung.messaging.user.application;

import io.github.jeyhung.messaging.rabbitmq.RabbitService;
import io.github.jeyhung.messaging.user.application.dto.UserCreateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final RabbitService rabbitService;

    @Autowired
    public UserServiceImpl(RabbitService rabbitService) {
        this.rabbitService = rabbitService;
    }

    @Override
    public void create(UserCreateDto userCreateDto) {
        rabbitService.send(userCreateDto);
    }
}
