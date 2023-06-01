package com.khai.inventory.dto;

import lombok.Data;

@Data
public class MattressResponse {

    private String id;
    private String name;
    private Double price;
    private String description;
    private Long soldQuantity;
}
