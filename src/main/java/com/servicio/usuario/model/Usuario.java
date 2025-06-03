package com.servicio.usuario.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_seq")
    @SequenceGenerator(name = "usuario_seq", sequenceName = "SEQ_USUARIO", allocationSize = 1)
    @Column(name = "id_usuario")
    private Integer id;

    @Column(name = "nombre_usuario", length = 20)
    private String nombre;

    @Column(name = "contraseña")
    private String contraseña;

    @Column(name = "id_propietario",nullable = false,unique = true)
    private Long propietario;
}
