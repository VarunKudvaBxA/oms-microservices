package com.example.analytics_service.service;
import com.example.analytics_service.client.OrderClient;
import org.springframework.stereotype.Service;
@Service
public class AnalyticsService {
    private final OrderClient orderClient;
    public AnalyticsService(OrderClient orderClient) {
        this.orderClient = orderClient;
    }
    public Object getAnalytics() {
        return orderClient.getOrders();
    }
}
