package com.CarServiceRecording.service;

import com.CarServiceRecording.domain.Car;
import com.CarServiceRecording.repository.CarRepository;
import org.springframework.stereotype.Service;

@Service
public class CarService extends AbstractBusiness<Car>{

    public CarService(CarRepository repository){
        super.repository = repository;
    }
}
