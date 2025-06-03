package com.servicio.usuario.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PropietarioDTO {
    private Integer id;
    private String nombre;
    private String apellido;
}