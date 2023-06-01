package com.khai.inventory.dto;

import com.khai.inventory.model.Inventory;
import jakarta.persistence.*;
import lombok.Data;
import net.minidev.json.annotate.JsonIgnore;

import java.util.List;

@Data
public class SizeResponse {

    private Long id;
    private String name;
}
