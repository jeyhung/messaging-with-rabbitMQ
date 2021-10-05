package io.github.jeyhung.messaging.user.application;

import io.github.jeyhung.messaging.user.application.dto.UserCreateDto;

public interface UserService {
    void create(UserCreateDto userCreateDto);
}
