package com.example.pcpartshop.dto.part;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PcCaseDto {

    private Long id;
    private String brand;
    private String model;
    private String formFactor;
    private double price;
    private int quantity;

    @Override
    public String toString() {
        return "PcCaseDto{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", formFactor='" + formFactor + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
