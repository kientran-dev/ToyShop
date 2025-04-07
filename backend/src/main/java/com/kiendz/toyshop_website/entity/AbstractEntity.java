package com.kiendz.toyshop_website.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AbstractEntity<T extends Serializable> implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id") //Các entity extends AbstractEntity đều có collumn tên là id
    T id;

    //Audit
    @Column(name = "created_by")
    @CreatedBy
    String createdBy;

    @Column(name = "updated_by")
    @LastModifiedBy
    String updateBy;

    @Column(name = "create_at")
    @CreationTimestamp
    LocalDateTime createdAt;

    @Column(name = "update_at")
    @UpdateTimestamp
    LocalDateTime updatedAt;

}
// @MappedSuperclass trong Spring (đặc biệt là trong JPA/Hibernate)
// được sử dụng để định nghĩa một lớp cha chứa các trường (fields)
// và mapping (liên kết) chung cho các lớp entity khác
//Các Audit dùng để theo dõi thông tin về người tạo,
// người cập nhật, thời gian tạo và thời gian cập nhật của các entity.