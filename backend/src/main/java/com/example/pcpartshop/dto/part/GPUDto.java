package com.example.pcpartshop.dto.part;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GPUDto {

    private Long id;
    private String brand;
    private String model;
    private int vram;
    private int frequency;
    private double price;
    private int quantity;

    @Override
    public String toString() {
        return "GPUDto{" +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", vram=" + vram +
                ", frequency=" + frequency +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
