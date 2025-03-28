package com.kiendz.toyshop_website.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "suppliers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    String id;

    @Column(name = "name")
    String name;

    @Column(name = "contact")
    String contact;

    @Column(name = "address")
    String address;

    @OneToMany
    @JoinColumn(name = "toy_id")
    List<Toy> toy;
}
