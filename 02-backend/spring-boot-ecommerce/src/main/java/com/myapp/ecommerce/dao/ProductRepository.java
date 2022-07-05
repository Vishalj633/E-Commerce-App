package com.myapp.ecommerce.dao;

import com.myapp.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product , Long> {
}
