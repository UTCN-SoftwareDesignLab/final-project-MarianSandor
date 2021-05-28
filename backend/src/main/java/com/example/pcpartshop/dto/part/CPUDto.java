package com.example.pcpartshop.dto.part;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CPUDto {

    private Long id;
    private String brand;
    private String model;
    private int cores;
    private double frequency;
    private String integratedGraphics;
    private double price;
    private int quantity;

    @Override
    public String toString() {
        return "CPUDto{" +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", cores=" + cores +
                ", frequency=" + frequency +
                ", integratedGraphics='" + integratedGraphics + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
