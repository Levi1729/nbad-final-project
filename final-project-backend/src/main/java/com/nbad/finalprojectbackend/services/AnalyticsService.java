package com.nbad.finalprojectbackend.services;

import com.nbad.finalprojectbackend.model.ChartData;
import org.springframework.stereotype.Service;
import java.util.Arrays;

@Service
public class AnalyticsService {

    public ChartData getRevenueData() {
        ChartData chartData = new ChartData();
        chartData.setLabels(Arrays.asList("January", "February", "March", "April", "May", "June"));

        ChartData.Dataset revenueDataset = new ChartData.Dataset();
        revenueDataset.setLabel("Revenue");
        revenueDataset.setData(Arrays.asList(65, 59, 80, 81, 56, 55));

        ChartData.Dataset ordersDataset = new ChartData.Dataset();
        ordersDataset.setLabel("Orders");
        ordersDataset.setData(Arrays.asList(28, 48, 40, 19, 86, 27));

        chartData.setDatasets(Arrays.asList(revenueDataset, ordersDataset));
        return chartData;
    }

    public ChartData getTransactionTrends() {
        ChartData chartData = new ChartData();
        chartData.setLabels(Arrays.asList("January", "February", "March", "April", "May", "June"));

        ChartData.Dataset transactionsDataset = new ChartData.Dataset();
        transactionsDataset.setLabel("Transactions");
        transactionsDataset.setData(Arrays.asList(45, 52, 38, 65, 48, 56));

        chartData.setDatasets(Arrays.asList(transactionsDataset));
        return chartData;
    }
} 