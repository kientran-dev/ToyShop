package com.kiendz.toyshop_website.entity.address;

import com.kiendz.toyshop_website.entity.AbstractEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "districts")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class District extends AbstractEntity<String> {

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "province_id", nullable = false)
    private Province province;
}
