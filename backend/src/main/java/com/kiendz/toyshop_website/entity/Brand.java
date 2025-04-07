package com.kiendz.toyshop_website.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "brands")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Brand extends AbstractEntity<String> {

    @Column(name = "brand_name", nullable = false)
    String brandName;

    @Column(name = "origin")
    String origin;

    @OneToMany(mappedBy = "toy", fetch = FetchType.LAZY)
    List<Toy> toys;
}
