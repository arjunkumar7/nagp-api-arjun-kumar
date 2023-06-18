package com.nagp.nagarro.api.repository;

import com.nagp.nagarro.api.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Products, Long> {

}
