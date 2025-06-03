package com.servicio.usuario.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioCreateDTO {
    private String nombre;
    private String contraseña;
    private Long propietario;
}