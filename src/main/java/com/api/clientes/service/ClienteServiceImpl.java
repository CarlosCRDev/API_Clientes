package com.api.clientes.service;

import com.api.clientes.excepciones.ServiceClientException;
import com.api.clientes.modelo.Cliente;
import com.api.clientes.repositorios.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    ClienteRepositorio clienteRepositorio;

    @Override
    public List<Cliente> getAll() {
        return clienteRepositorio.findAll();
    }

    @Override
    public List<Cliente> getBySexo(char sexo) {
        return clienteRepositorio.findBySexo(sexo);
    }

    @Override
    public Cliente getById(Long id) {
        return clienteRepositorio.findById(id).get();
    }

    @Override
    public Cliente addCliente(Cliente cliente) {
        if(!clienteRepositorio.existsById(cliente.getId()))
            return clienteRepositorio.save(cliente);
        else
            return null;
    }

    @Override
    public Cliente updateCliente(Cliente cliente) {
        if(clienteRepositorio.existsById(cliente.getId()))
            return clienteRepositorio.save(cliente);
        else
            return null;
    }

    @Override
    public void deleteCliente(Long id) {
        if(clienteRepositorio.existsById(id))
            clienteRepositorio.deleteById(id);
        else
            throw new ServiceClientException("No se encontro ningún registro con ese id");
    }
}
