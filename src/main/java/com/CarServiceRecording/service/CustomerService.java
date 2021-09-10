package com.CarServiceRecording.service;


import com.CarServiceRecording.domain.Customer;
import com.CarServiceRecording.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service

public class CustomerService extends AbstractBusiness<Customer>{
    public CustomerService(CustomerRepository repository){
        super.repository=repository;
    }
}
