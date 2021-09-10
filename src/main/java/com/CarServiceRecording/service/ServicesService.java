package com.CarServiceRecording.service;


import com.CarServiceRecording.domain.Car;
import com.CarServiceRecording.domain.Services;
import com.CarServiceRecording.exceptions.BusinessException;
import com.CarServiceRecording.repository.ServicesRepository;
import org.springframework.stereotype.Service;

@Service

public class ServicesService extends AbstractBusiness<Services>{
    public ServicesService(ServicesRepository repository){
        super.repository=repository;
    }

}
