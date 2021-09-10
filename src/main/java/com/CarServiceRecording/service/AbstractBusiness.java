package com.CarServiceRecording.service;

import com.CarServiceRecording.domain.AbstractAuditingEntity;
import com.CarServiceRecording.domain.Car;
import com.CarServiceRecording.domain.Services;
import com.CarServiceRecording.exceptions.BusinessException;
import com.CarServiceRecording.repository.ApplicationRepository;
import com.CarServiceRecording.repository.CarRepository;
import com.CarServiceRecording.repository.ServicesRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class AbstractBusiness<T extends AbstractAuditingEntity> {

    protected ApplicationRepository<T, Long> repository;

    @Autowired
    CarRepository carRepository;

    @Autowired
    ServicesRepository servicesRepository;

    public final List<T> findUserDocuments() {return (List<T>) getRepository().findAll();}

    public T getDocument(Long id) {
        return getRepository().findById(id).orElse(null);
    }

    public List<T> getCars(Long id) {return (List<T>) carRepository.findByCustomer_Id(id);}

    public List<T> getServices(Long id) {return (List<T>) servicesRepository.findByCar_Id(id);}

    public void saveDocument(T document) throws BusinessException {getRepository().save(document);}

    public void deleteDocument(Long id) throws BusinessException {getRepository().deleteById(id);}

    public ApplicationRepository<T, Long> getRepository() {
        return repository;
    }

    public void saveServices(Services document, long id) throws BusinessException {
        Car car=carRepository.findById(id).orElse(null);
        if (car.equals(null)){
            new BusinessException("connt find this car");
        }else {
           document.setCar(car);
            servicesRepository.save(document);
        }
    }
}
