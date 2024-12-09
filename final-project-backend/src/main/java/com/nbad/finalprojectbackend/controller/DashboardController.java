package com.nbad.finalprojectbackend.controller;

import com.nbad.finalprojectbackend.model.DashboardStats;
import com.nbad.finalprojectbackend.model.News;
import com.nbad.finalprojectbackend.services.DashboardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DashboardController {
    private final DashboardService dashboardService;

    public DashboardController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @GetMapping("/dashboard/stats")
    public ResponseEntity<DashboardStats> getDashboardStats() {
        return ResponseEntity.ok(dashboardService.getDashboardStats());
    }

    @GetMapping("/news")
    public ResponseEntity<List<News>> getNews() {
        return ResponseEntity.ok(dashboardService.getNews());
    }
} 