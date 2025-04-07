package com.kiendz.toyshop_website.entity;

import com.kiendz.toyshop_website.common.DeliveryMethodName;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "deliveries")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryMethod extends AbstractEntity<String>{

    @Enumerated(EnumType.STRING)
    @Column(name = "method_name", nullable = false)
    DeliveryMethodName deliveryMethodName;

    @Column(name = "price")
    double price;

    @Column(name = "description")
    String description;

    @OneToMany(mappedBy = "deliveryMethod", fetch = FetchType.LAZY)
    List<Order> orders;
}
