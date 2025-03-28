package com.kiendz.toyshop_website.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cart {

    @Id
    @Column(name = "id")
    String id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false)
    Customer customer;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "toy_id")
    List<Toy> products;

    @Column(name = "total_price")
    double totalPrice;
}

