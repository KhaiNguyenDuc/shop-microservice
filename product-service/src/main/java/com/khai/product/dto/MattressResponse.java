package com.khai.product.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class MattressResponse {

    private String id;
    private String name;
    private Double price;
    private String description;
    private Long soldQuantity;
}
