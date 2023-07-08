package com.khai.order.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "order_date", nullable = false)
    private Date orderDate;


    @Column(name = "deliver_method")
    private String deliverMethod;

    @Column(name = "deliver_cost")
    private Double deliverCost;


    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL,orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<OrderItem> orderItems;

    @ManyToOne
    @JoinColumn(name = "order_track_id", referencedColumnName = "id", nullable = false)
    private OrderTrack orderTrack;

    public void addOrderItems(OrderItem orderItem) {

        if(this.orderItems == null) {
            orderItems = new HashSet<>();
        }
        orderItems.add(orderItem);
    }




}
