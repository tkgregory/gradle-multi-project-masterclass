package com.tomgregory.maxirail.controller;

import com.tomgregory.maxirail.model.TrainTime;
import com.tomgregory.maxirail.service.TrainTimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MaxiRailController {
    private final TrainTimeService trainTimeService;

    public MaxiRailController(TrainTimeService trainTimeService) {
        this.trainTimeService = trainTimeService;
    }

    @GetMapping(path = "/")
    public List<TrainTime> getTrainTimes() {
        return trainTimeService.getTrainTimes();
    }
}
