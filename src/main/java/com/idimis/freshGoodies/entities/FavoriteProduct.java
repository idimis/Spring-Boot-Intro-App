package com.idimis.freshGoodies.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "favorite_products")
public class FavoriteProduct {
    @Id
    private int productId;
    private String id;

    // Getters and setters
    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
}
