package io.github.jeyhung.messaging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessagingWithRabbitMqApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessagingWithRabbitMqApplication.class, args);
    }

}
