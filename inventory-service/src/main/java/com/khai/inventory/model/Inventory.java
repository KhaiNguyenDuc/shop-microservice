package com.khai.inventory.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "inventories")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "quantity")
    private Integer quantity;


    @ManyToOne
    @JoinColumn(name="size_id",referencedColumnName = "id")
    private Size size;

    @Column(name = "mattress_id")
    private String mattress_id;

    public Inventory(Integer quantity) {
        super();
        this.quantity = quantity;
    }



}
