package com.example.pcpartshop.mapper;

import com.example.pcpartshop.dto.ConfigurationDto;
import com.example.pcpartshop.model.Configuration;
import com.example.pcpartshop.model.part.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Mapper(componentModel = "spring")
public interface ConfigurationMapper {

    @Mapping(source = "cpu", target = "cpu", qualifiedByName = "getCPU")
    @Mapping(source = "gpu", target = "gpu", qualifiedByName = "getGPU")
    @Mapping(source = "memory", target = "memory", qualifiedByName = "getMemory")
    @Mapping(source = "motherboard", target = "motherboard", qualifiedByName = "getMotherboard")
    @Mapping(source = "storage", target = "storage", qualifiedByName = "getStorage")
    @Mapping(source = "psu", target = "psu", qualifiedByName = "getPsu")
    @Mapping(source = "pcCase", target = "pcCase", qualifiedByName = "getPcCase")
    @Mapping(source = "dateCreated", target = "dateCreated", qualifiedByName = "getDateCreated")
    ConfigurationDto toDto(Configuration configuration);

    @Named("getCPU")
    static String getCPU(CPU cpu) {
        return cpu.getBrand() + " " + cpu.getModel();
    }

    @Named("getGPU")
    static String getGPU(GPU gpu) {
        return gpu.getBrand() + " " + gpu.getModel();
    }

    @Named("getMemory")
    static String getMemory(Memory memory) {
        return memory.getBrand() + " " + memory.getModel();
    }

    @Named("getMotherboard")
    static String getMotherboard(Motherboard motherboard) {
        return motherboard.getBrand() + " " + motherboard.getModel();
    }

    @Named("getStorage")
    static String getStorage(Storage storage) {
        return storage.getBrand() + " " + storage.getModel();
    }

    @Named("getPsu")
    static String getPsu(PSU psu) {
        return psu.getBrand() + " " + psu.getModel();
    }

    @Named("getPcCase")
    static String getPcCase(PcCase pcCase) {
        return pcCase.getBrand() + " " + pcCase.getModel();
    }

    @Named("getDateCreated")
    static String getDateCreated(LocalDateTime dateCreated) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        return dateCreated.format(formatter);
    }
}
