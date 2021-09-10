package com.CarServiceRecording.repository;

import com.CarServiceRecording.domain.Car;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends ApplicationRepository<Car, Long> {
    public List<Car> findByCustomer_Id(Long customerId);
}
