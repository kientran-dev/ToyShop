package com.kiendz.toyshop_website.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categories")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Category extends AbstractEntity<String> {

    @Column(name = "category_name", nullable = false)
    String categoryName;

    @OneToMany(mappedBy = "category")
    List<Toy> toys;

    @ManyToOne
    @JoinColumn(name = "parent_id") // Cột khóa ngoại trỏ đến danh mục cha
    Category parent;  // Danh mục cha

    @OneToMany(mappedBy = "parent")  // Danh sách các danh mục con
    List<Category> children = new ArrayList<>(); // Khởi tạo để tránh NullPointerException
}
