package com.CarServiceRecording.repository;

import com.CarServiceRecording.domain.Services;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServicesRepository extends ApplicationRepository<Services, Long> {
    public List<Services> findByCar_Id(Long carId);
}
