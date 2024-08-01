package com.api.clientes.service;

import com.api.clientes.modelo.Cliente;

import java.util.List;

public interface ClienteService {
    List<Cliente> getAll();
    List<Cliente> getBySexo(char sexo);
    Cliente getById(Long id);
    Cliente addCliente(Cliente cliente);
    Cliente updateCliente(Cliente cliente);
    void deleteCliente(Long id);
}
