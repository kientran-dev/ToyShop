package com.kiendz.toyshop_website.entity;

import com.kiendz.toyshop_website.common.PaymentMethodName;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "payments")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentMethod extends AbstractEntity <String>{

    @Enumerated(EnumType.STRING)
    @Column(name = "method_name")
    PaymentMethodName paymentMethod;

    @OneToMany(mappedBy = "paymentMethod", fetch = FetchType.LAZY)
    List<Order> orders;
}
