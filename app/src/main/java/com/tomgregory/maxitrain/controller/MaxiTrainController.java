package com.tomgregory.maxitrain.controller;

import com.tomgregory.maxitrain.model.TrainTime;
import com.tomgregory.maxitrain.model.TrainTimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MaxiTrainController {
    private final TrainTimeService trainTimeService;

    public MaxiTrainController(TrainTimeService trainTimeService) {
        this.trainTimeService = trainTimeService;
    }

    @GetMapping(path = "/")
    public List<TrainTime> getRides() {
        return trainTimeService.getTrainTimes();
    }
}
