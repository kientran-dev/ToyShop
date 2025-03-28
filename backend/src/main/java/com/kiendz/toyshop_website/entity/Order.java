package com.kiendz.toyshop_website.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    String orderId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false)
    Customer customer;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "toy_id")
    List<Toy> products;

    @Column(name = "total_price")
    double totalPrice;

    @Column(name = "oder_date")
    LocalDateTime orderDate;

    @Column(name = "status")
    String status;

    @Column(name = "payment_method")
    String paymentMethod;

    @Column(name = "shipping_address")
    String shippingAddress;
}
