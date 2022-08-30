package com.codewithcaleb.reactivedemo.service;


import com.codewithcaleb.reactivedemo.dao.CustomerDao;
import com.codewithcaleb.reactivedemo.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerDao dao;


    //tradional way of Writing a REST Endpoint
    public List<Customer> loadAllCustomers(){
        long start = System.currentTimeMillis();
        List<Customer> customers = dao.getCustomers();
        long end = System.currentTimeMillis();
        System.out.println("Total Execution Time" +(end-start));
        return customers;
    }
}
