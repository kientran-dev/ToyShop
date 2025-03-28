package com.kiendz.toyshop_website.repository;

import com.kiendz.toyshop_website.entity.Toy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToyRepository extends JpaRepository<Toy, String> {
    //Tạo một interface ToyRepository kế thừa từ JpaRepository, với Toy là kiểu dữ liệu của đối tượng và Long là kiểu dữ liệu của id.
}