package com.kiendz.toyshop_website.repository.adress;

import com.kiendz.toyshop_website.entity.adress.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProvinceRepository extends JpaRepository<Province, Long> {
    Optional<Province> findByName(String name);
}
