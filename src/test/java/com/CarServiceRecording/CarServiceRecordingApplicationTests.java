package com.CarServiceRecording;

import com.CarServiceRecording.domain.Car;
import com.CarServiceRecording.domain.Customer;
import com.CarServiceRecording.domain.Services;
import com.CarServiceRecording.repository.CarRepository;
import com.CarServiceRecording.repository.CustomerRepository;
import com.CarServiceRecording.repository.ServicesRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.*;

import java.util.List;

import static com.CarServiceRecording.domain.enumeration.EngineType.MAGNETIC;


@SpringBootTest
class CarServiceRecordingApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	CarRepository carRepository;
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	ServicesRepository servicesRepository;

	@Test
	public void dataJpaTest(){
		Customer customer=new Customer();
		customer.setName("Lama");
		customer.setEmail("lama@gmail.com");
		customer.setPhoneNumber("078");

		Car car=new Car();
		car.setColor("white");
		car.setCompanyName("bmw");
		car.setEngineType(MAGNETIC);
		car.setCustomer(customer);

		Services services =new Services();
		services.setDisable(true);
		services.setName("wash");
        services.setCar(car);

       customerRepository.save(customer);
       carRepository.save(car);
       servicesRepository.save(services);


	}
    @Test
	public void testNull(){

		Customer customer=new Customer();
		customer.setName("mohammad");
		customer.setEmail("lama@gmail.com");
		customer.setPhoneNumber("079");
		customerRepository.save(customer);

	   assertNotNull(customer);

     }
}
