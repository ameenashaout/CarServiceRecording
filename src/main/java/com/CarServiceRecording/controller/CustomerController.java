package com.CarServiceRecording.controller;

import com.CarServiceRecording.domain.Customer;
import com.CarServiceRecording.exceptions.BusinessException;
import com.CarServiceRecording.service.CustomerService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class CustomerController extends AbstractResource<Customer> {

    public CustomerController(CustomerService business) {
        this.business = business;
    }

    @Operation(summary = "List all customers")
    @GetMapping("/customer")
    @Override
    public List<Customer> getUserDocuments() {
        return super.getUserDocuments();
    }

    @GetMapping("/customer/{customer_id}")
    @Override
    public Customer getDocument(@PathVariable("customer_id") Long documentId)  {
        return super.getDocument(documentId);}

    @Operation(summary = "List all car(s) services for a specific customer")
    @GetMapping("/customer/{customer_id}/cars")
    public List<Customer> getCars(@PathVariable("customer_id") Long documentId)  {
        return super.getCars(documentId);}

    @PostMapping("/customer")
    @Override
    public Customer addDocument(@RequestBody Customer document) throws BusinessException {
        return super.addDocument(document);
    }

    @DeleteMapping("/customer/{customer_id}")
    @Override
    public void deleteDocument(@PathVariable("customer_id") Long documentId) throws BusinessException {
        super.deleteDocument(documentId);
    }
}
