package com.example.analytics_service.controller;
import com.example.analytics_service.service.AnalyticsService;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/analytics")
public class AnalyticsController {
    private final AnalyticsService analyticsService;
    public AnalyticsController(AnalyticsService analyticsService) {
        this.analyticsService = analyticsService;
    }
    @GetMapping
    public Object getAnalytics() {
        return analyticsService.getAnalytics();
    }
}
