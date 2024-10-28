package com.idimis.freshGoodies.repository;

import com.idimis.freshGoodies.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
