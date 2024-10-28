package com.idimis.freshGoodies.repository;


import com.idimis.freshGoodies.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, String> {
}
