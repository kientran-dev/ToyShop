package com.kiendz.toyshop_website.entity.address;

import com.kiendz.toyshop_website.entity.AbstractEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "wards")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ward extends AbstractEntity<String> {

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "district_id", nullable = false)
    private District district;

}
