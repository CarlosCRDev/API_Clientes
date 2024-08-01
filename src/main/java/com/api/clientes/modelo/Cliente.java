package com.api.clientes.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    private Long id;
    private String nombre;
    private String email;
    private char sexo;
}
