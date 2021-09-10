package com.CarServiceRecording.controller;

import com.CarServiceRecording.domain.Car;
import com.CarServiceRecording.domain.Services;
import com.CarServiceRecording.exceptions.BusinessException;
import com.CarServiceRecording.service.CarService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class CarController extends AbstractResource<Car> {
    public CarController(CarService business) {
        this.business = business;
    }
    @GetMapping("/car")
    @Override
    public List<Car> getUserDocuments() {
        return super.getUserDocuments();
    }

    @Operation(summary = "List all services for a specific car")
    @GetMapping("/car/{car_id}/services")
    public List<Car> getServices(@PathVariable("car_id") Long documentId)  {
        return super.getServices(documentId);
    }

    @GetMapping("/car/{car_id}")
    @Override
    public Car getDocument(@PathVariable("car_id") Long documentId)  {

        return super.getDocument(documentId);
    }

    @Operation(summary = "Record a service for a specific car")
    @PostMapping("/car/{car_id}/services")
    public Services addServices(@RequestBody Services document,@PathVariable("car_id") Long documentId) throws BusinessException {
        return super.addServices(document,documentId);
    }
    @PostMapping("/car")
    @Override
    public Car addDocument(@RequestBody Car document) throws BusinessException {
        return super.addDocument(document);
    }

    @DeleteMapping("/car/{car_id}")
    @Override
    public void deleteDocument(@PathVariable("car_id") Long documentId) throws BusinessException {
        super.deleteDocument(documentId);
    }
}
