package com.kiendz.toyshop_website.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cart_items")
@Getter
@Setter
public class CartItem extends AbstractEntity<String> {

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cart_id", nullable = false)
    private Cart cart;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "toy_id", nullable = false)
    private Toy toy;

    @Column(name = "quantity", nullable = false)
    private int quantity; // Số lượng chọn mua của sản phẩm này trong giỏ hàng
}