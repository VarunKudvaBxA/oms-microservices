package com.example.order_service.repository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import com.example.order_service.model.Order;
@Repository
public class OrderRepository {
    private final List<Order> orders = new ArrayList<>();
    public void save(Order order) {
        orders.add(order);
    }
    public List<Order> findAll() {
        return orders;
    }
}