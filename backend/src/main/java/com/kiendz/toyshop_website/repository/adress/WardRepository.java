package com.kiendz.toyshop_website.repository.adress;

import com.kiendz.toyshop_website.entity.adress.Ward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WardRepository extends JpaRepository<Ward, Long> {
    List<Ward> findByDistrictId(Long districtId);
}
