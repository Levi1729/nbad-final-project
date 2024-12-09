package com.nbad.finalprojectbackend.model;

import lombok.Data;
import java.util.List;

@Data
public class ChartData {
    private List<String> labels;
    private List<Dataset> datasets;

    @Data
    public static class Dataset {
        private List<Number> data;
        private String label;
    }
} 