package com.servicio.usuario.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer id;

    @Column(name = "nombre_usuario",length = 20)
    private String  nombre;

    @Column(name = "id_animal")
    private Integer id_animal;

    @Column(name = "tipo_usuario")
    private Integer id_tipoUsuario;
}
