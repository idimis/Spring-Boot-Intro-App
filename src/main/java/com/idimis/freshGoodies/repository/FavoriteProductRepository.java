package com.idimis.freshGoodies.repository;

import com.idimis.freshGoodies.entities.FavoriteProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteProductRepository extends JpaRepository<FavoriteProduct, Integer> {
}
