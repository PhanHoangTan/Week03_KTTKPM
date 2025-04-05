package vn.edu.iuh.fit.week01.services;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.week01.configs.RabbitMQConfig;

@Service
public class Service1 {

    private final RabbitTemplate rabbitTemplate;

    @Autowired
    public Service1(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void pushEvent(String message) {
        rabbitTemplate.convertAndSend(RabbitMQConfig.QUEUE_NAME, message);
    }
}