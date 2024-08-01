package com.api.clientes.controladores;

import com.api.clientes.excepciones.ServiceClientException;
import com.api.clientes.modelo.Cliente;
import com.api.clientes.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clientes")
public class ClienteController {
    @Autowired
    ClienteService clienteService;

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<List<Cliente>> getAll() {
        List<Cliente> listaClientes = clienteService.getAll();
        if(listaClientes.size() > 0)
            return new ResponseEntity<>(listaClientes, HttpStatus.OK);
        else
            throw new ServiceClientException("No hay registros en la base de datos.");
    }

    @GetMapping(path = "/{sexo}")
    public ResponseEntity<List<Cliente>> getBySexo(@PathVariable("sexo") char sexo) {
        List<Cliente> listaClientes = clienteService.getBySexo(sexo);
        if(listaClientes.size() > 0)
            return new ResponseEntity<>(listaClientes, HttpStatus.OK);
        else
            throw new ServiceClientException("No se encontraron registros con esos parametros.");
    }

    @GetMapping(path = "/cliente/{id}")
    public ResponseEntity<Cliente> getById(@PathVariable("id") Long id) {
        Cliente cliente = clienteService.getById(id);
        if(cliente != null)
            return new ResponseEntity<>(cliente, HttpStatus.OK);
        else
            throw new ServiceClientException("No se encontro ningún registro con ese id.");
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Cliente> addCliente(@RequestBody Cliente cliente) {
        Cliente objCliente = clienteService.addCliente(cliente);

        if(objCliente != null)
            return new ResponseEntity<>(objCliente, HttpStatus.OK);
        else
            throw new ServiceClientException("El registro ya existe en la BD.");
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> deleteCliente(@PathVariable("id") Long id) {
        clienteService.deleteCliente(id);
        return new ResponseEntity<>("Registro eliminado correctamente", HttpStatus.OK);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Cliente> updateCliente(@RequestBody Cliente cliente) {
        Cliente objCliente = clienteService.updateCliente(cliente);

        if(objCliente != null)
            return new ResponseEntity<>(objCliente, HttpStatus.OK);
        else
            throw new ServiceClientException("Los datos no pudieron ser actualizados.");
    }
}
