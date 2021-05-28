package com.example.pcpartshop.dto.part;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemoryDto {

    private Long id;
    private String brand;
    private String model;
    private int size;
    private String type;
    private int frequency;
    private double price;
    private int quantity;

    @Override
    public String toString() {
        return "MemoryDto{" +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", type='" + type + '\'' +
                ", frequency=" + frequency +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
