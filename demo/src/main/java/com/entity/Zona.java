package com.entity;
import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Zona {
    private String nombre;
    private long centro;
    private int radioKm;
}
