package com.kiendz.toyshop_website.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "toys")
@Data
@Builder//Dùng @Builder sẽ giúp việc tạo đối tượng Toy trở nên linh hoạt và dễ đọc hơn.
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Toy {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    String id;

    @Column(name = "name", nullable = false)
    String name;

    @Column(name = "brand")
    String brand;

    @Column(name = "price")
    double price;

    @Column(name = "stock")
    int stock;

    @Column(name = "category")
    String category;

    @Column(name = "age")
    int age;

    @Column(name = "description", columnDefinition = "MEDIUMTEXT")
    String description;

    @Column(name = "image")
    String image;
}
