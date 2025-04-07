package com.kiendz.toyshop_website.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "sales")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Sale extends AbstractEntity<String> {

    @Column(name = "sale_name", nullable = false)
    String saleName;

    @Column(name = "sale_percent", nullable = false)
    double salePercent;

    @Column(name = "start_date", nullable = false)
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    String startDate;

    @Column(name = "end_date", nullable = false)
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    String endDate;
}
