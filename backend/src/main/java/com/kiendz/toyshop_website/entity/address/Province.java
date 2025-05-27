package com.kiendz.toyshop_website.entity.address;

import com.kiendz.toyshop_website.entity.AbstractEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "provinces")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Province extends AbstractEntity<String> {

    @Column(name = "name", nullable = false)
    private String name;


    @OneToMany(mappedBy = "province", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<District> districts;

}
