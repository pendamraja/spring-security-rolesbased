package com.springsecurity.rolesbased.repository;

import com.springsecurity.rolesbased.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
