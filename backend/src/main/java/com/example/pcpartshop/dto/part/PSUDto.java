package com.example.pcpartshop.dto.part;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PSUDto {

    private Long id;
    private String brand;
    private String model;
    private String formFactor;
    private String efficiency;
    private int wattage;
    private double price;
    private int quantity;

    @Override
    public String toString() {
        return "PSUDto{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", formFactor='" + formFactor + '\'' +
                ", efficiency='" + efficiency + '\'' +
                ", wattage=" + wattage +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
