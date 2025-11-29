package com.chambainfo.backend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PublicarEmpleoRequestDTO {

    @NotBlank(message = "El nombre del empleo es obligatorio")
    private String nombreEmpleo;

    @NotBlank(message = "La descripción del empleo es obligatoria")
    private String descripcionEmpleo;

    @NotBlank(message = "El número de celular de contacto es obligatorio")
    private String celularContacto;

    private Boolean mostrarNumero = true;

    @NotBlank(message = "La categoría es obligatoria")
    private String categoria;

    // Salario obligatorio
    @NotNull(message = "El monto del salario es obligatorio")
    @Positive(message = "El monto del salario debe ser mayor a 0")
    private Double salarioMonto;

    @NotBlank(message = "La moneda del salario es obligatoria")
    private String salarioMoneda; // "SOLES" o "DOLARES"

    @NotBlank(message = "La frecuencia del salario es obligatoria")
    private String salarioFrecuencia; // "DIARIO", "SEMANAL", "QUINCENAL", "MENSUAL"

    // Campos opcionales
    private String ubicacion;
    private String ruc;
    private String adjuntos;
}