package com.example.springboot.controller.customer;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.constant.ApplicationConstants;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CustomerController {
    private final String word;

    @GetMapping(path = ApplicationConstants.CUSTOMER_DETAIL, produces = { MediaType.APPLICATION_JSON_VALUE })
    public void getCustomerDetail(@RequestBody ) {
        
    }

}
