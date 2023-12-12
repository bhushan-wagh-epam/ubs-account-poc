package com.ubs.ordermanagementservice.model;

import lombok.Data;

@Data
public class OrderRequest {
    private String scriptName;
    private int quantity;
    private double price;
    private OrderType orderType;
}
