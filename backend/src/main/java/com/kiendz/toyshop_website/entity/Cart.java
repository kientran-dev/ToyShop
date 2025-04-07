package com.kiendz.toyshop_website.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "carts")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cart extends AbstractEntity<String> {

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
    Customer customer;

    @OneToMany(mappedBy = "cart", fetch = FetchType.LAZY)
    List<CartItem> cartItems;
}

