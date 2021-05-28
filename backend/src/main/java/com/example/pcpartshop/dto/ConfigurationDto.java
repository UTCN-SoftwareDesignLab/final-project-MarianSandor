package com.example.pcpartshop.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ConfigurationDto {

    private Long id;
    private String description;
    private String cpu;
    private String gpu;
    private String motherboard;
    private String memory;
    private String storage;
    private String psu;
    private String pcCase;
    private String dateCreated;
}
