package com.example.order_service.logger;
import org.springframework.stereotype.Component;
import java.io.FileWriter;
import java.io.IOException;
import com.example.order_service.model.Order;
@Component
public class OrderFileLogger {
    public void logOrder(Order order) {
        try (FileWriter writer = new FileWriter("orders.log", true)) {
            writer.write(order.toString() + System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

