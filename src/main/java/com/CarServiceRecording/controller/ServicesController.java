package com.CarServiceRecording.controller;

import com.CarServiceRecording.domain.Customer;
import com.CarServiceRecording.domain.Services;
import com.CarServiceRecording.exceptions.BusinessException;
import com.CarServiceRecording.service.ServicesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ServicesController extends AbstractResource<Services> {
    public ServicesController(ServicesService business) {
        this.business = business;
    }
    @GetMapping("/services")
    @Override
    public List<Services> getUserDocuments() {
        return super.getUserDocuments();
    }

    @GetMapping("/services/{services_id}")
    @Override
    public Services getDocument(@PathVariable("services_id") Long documentId)  {

        return super.getDocument(documentId);
    }

    @PostMapping("/services")
    @Override
    public Services addDocument(@RequestBody Services document) throws BusinessException {
        return super.addDocument(document);
    }



    @DeleteMapping("/services/{services_id}")
    @Override
    public void deleteDocument(@PathVariable("services_id") Long documentId) throws BusinessException {
        super.deleteDocument(documentId);
    }
}
