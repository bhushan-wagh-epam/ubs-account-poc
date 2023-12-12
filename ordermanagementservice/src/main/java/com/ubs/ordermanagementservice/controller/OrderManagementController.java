package com.ubs.ordermanagementservice.controller;

import com.ubs.ordermanagementservice.model.OrderRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class OrderManagementController {

    @PostMapping
    public String addOrder(@RequestBody OrderRequest orderRequest){
        //TODO Logic for saving the order
        log.info("Order details : {}", orderRequest);
        return "Order added successfully";
    }
}
