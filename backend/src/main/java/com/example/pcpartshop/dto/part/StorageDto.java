package com.example.pcpartshop.dto.part;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StorageDto {

    private Long id;
    private String brand;
    private String model;
    private int capacity;
    private String type;
    private double price;
    private int quantity;

    @Override
    public String toString() {
        return "StorageDto{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", capacity=" + capacity +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
