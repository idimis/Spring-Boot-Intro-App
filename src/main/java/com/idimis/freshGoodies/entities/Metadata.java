package com.idimis.freshGoodies.entities;

import jakarta.persistence.*;

@Entity
public class Metadata {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productId;
    private String unit;
    private int weight;
    private int calorie;
    private double proteins;
    private double fats;
    private int increment;
    private double carbs;

    // Getters and Setters
}
