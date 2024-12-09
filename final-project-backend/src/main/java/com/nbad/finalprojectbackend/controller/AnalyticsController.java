package com.nbad.finalprojectbackend.controller;

import com.nbad.finalprojectbackend.model.ChartData;
import com.nbad.finalprojectbackend.services.AnalyticsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/analytics")
public class AnalyticsController {
    private final AnalyticsService analyticsService;

    public AnalyticsController(AnalyticsService analyticsService) {
        this.analyticsService = analyticsService;
    }

    @GetMapping("/revenue")
    public ResponseEntity<ChartData> getRevenueData() {
        return ResponseEntity.ok(analyticsService.getRevenueData());
    }

    @GetMapping("/transactions")
    public ResponseEntity<ChartData> getTransactionTrends() {
        return ResponseEntity.ok(analyticsService.getTransactionTrends());
    }
} 