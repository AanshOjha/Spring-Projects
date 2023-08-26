package com.javajourney.learnspringframework.examples.realworld;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService {
    DataService dataService;

    public BusinessCalculationService(DataService dataService) {
        this.dataService = dataService;
    }
    
    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
