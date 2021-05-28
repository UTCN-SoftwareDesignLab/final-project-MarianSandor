package com.example.pcpartshop.model.part;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Memory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private String model;

    @Column
    private int size;

    @Column
    private String type;

    @Column
    private int frequency;

    @Column(nullable = false)
    private double price;

    @Column(columnDefinition = "int default 0")
    private int quantity;
}
