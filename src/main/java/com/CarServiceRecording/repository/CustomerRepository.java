package com.CarServiceRecording.repository;

import com.CarServiceRecording.domain.Customer;
import org.springframework.stereotype.Repository;

@Repository

public interface CustomerRepository extends ApplicationRepository<Customer, Long> {
}
