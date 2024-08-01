package com.api.clientes.excepciones;

public class ServiceClientException extends RuntimeException{

    private static final long serialVersionUID = -8646498039909166217L;

    public ServiceClientException(String mensaje){
        super(mensaje);
    }
}
