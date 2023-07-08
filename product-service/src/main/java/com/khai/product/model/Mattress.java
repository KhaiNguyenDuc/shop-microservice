package com.khai.product.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(value = "mattresses")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Mattress {

    @Id
    private String id;
    private String name;
    private Double price;
    private String description;
    private Long soldQuantity;
    private Long inventory_id;

}