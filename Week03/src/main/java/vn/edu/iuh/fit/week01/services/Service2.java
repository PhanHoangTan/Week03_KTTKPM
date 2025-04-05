package vn.edu.iuh.fit.week01.services;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.week01.configs.RabbitMQConfig;

@Service
public class Service2 {

    @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
    public void handleEvent(String message) {
        // Xử lý sự kiện ở đây
        System.out.println("Received message: " + message);
    }
}