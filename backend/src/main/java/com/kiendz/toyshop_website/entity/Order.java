package com.kiendz.toyshop_website.entity;

import com.kiendz.toyshop_website.common.OrderStatus;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Order extends AbstractEntity<String> {

    @Column(name = "order_date", nullable = false)
    @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    LocalDateTime orderDate;

    @Column(name = "status", nullable = false)
    OrderStatus status;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "coupon_id", nullable = false)
    Coupon coupon;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
    Customer customer;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "payment_id", nullable = false)
    PaymentMethod paymentMethod;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "delivery_id", nullable = false)
    DeliveryMethod deliveryMethod;
}