package com.api.clientes.repositorios;

import com.api.clientes.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {
    List<Cliente> findBySexo(char sexo);
}
