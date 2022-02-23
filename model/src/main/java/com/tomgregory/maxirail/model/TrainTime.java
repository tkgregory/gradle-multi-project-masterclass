package com.tomgregory.maxirail.model;

import java.time.LocalTime;

public record TrainTime(String departureStation, String destinationStation, LocalTime departureTime, LocalTime arrivalTime) {
}