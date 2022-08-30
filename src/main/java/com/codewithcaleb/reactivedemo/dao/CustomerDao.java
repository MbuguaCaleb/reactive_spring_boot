package com.codewithcaleb.reactivedemo.dao;

import com.codewithcaleb.reactivedemo.dto.Customer;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class CustomerDao {


    //returning an Object
    //functional programming/streams
    public List<Customer> getCustomers(){
        return  IntStream.rangeClosed(1,50)
                .peek(i-> System.out.println("Processing Count :" + i))
                .mapToObj(i -> new Customer(i,"customer"+i))
                .collect(Collectors.toList());

    }

}
