package com.nbad.finalprojectbackend.model;

import lombok.Data;

@Data
public class DashboardStats {
    private int totalUsers;
    private int activeSessions;
    private double totalRevenue;
    private int newOrders;
} 