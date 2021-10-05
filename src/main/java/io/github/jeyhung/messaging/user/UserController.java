package io.github.jeyhung.messaging.user;

import io.github.jeyhung.messaging.user.application.UserService;
import io.github.jeyhung.messaging.user.application.dto.UserCreateDto;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "users")
@RestController
@RequestMapping(value = "/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/create")
    public void create(@Validated @RequestBody UserCreateDto userCreateDto) {
        userService.create(userCreateDto);
    }
}
