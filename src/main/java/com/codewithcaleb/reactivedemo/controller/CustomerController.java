package com.codewithcaleb.reactivedemo.controller;

import com.codewithcaleb.reactivedemo.dto.Customer;
import com.codewithcaleb.reactivedemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService service;


    //traditional Rest
    @GetMapping("/")
    public List<Customer> getAllCustomers(){
        return service.loadAllCustomers();
    }
}
