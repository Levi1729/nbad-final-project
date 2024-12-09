package com.nbad.finalprojectbackend.services;

import com.nbad.finalprojectbackend.model.DashboardStats;
import com.nbad.finalprojectbackend.model.News;
import com.nbad.finalprojectbackend.repositories.NewsRepository;
import com.nbad.finalprojectbackend.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardService {
    private final NewsRepository newsRepository;
    private final UserRepository userRepository;

    public DashboardService(NewsRepository newsRepository, UserRepository userRepository) {
        this.newsRepository = newsRepository;
        this.userRepository = userRepository;
    }

    public DashboardStats getDashboardStats() {
        DashboardStats stats = new DashboardStats();
        stats.setTotalUsers((int) userRepository.count());
        stats.setActiveSessions(45); // Mock data
        stats.setTotalRevenue(15000.0); // Mock data
        stats.setNewOrders(25); // Mock data
        return stats;
    }

    public List<News> getNews() {
        return newsRepository.findAll();
    }
} 