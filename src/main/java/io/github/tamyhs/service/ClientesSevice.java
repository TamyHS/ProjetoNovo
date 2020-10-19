package io.github.tamyhs.service;

import io.github.tamyhs.model.Cliente;
import io.github.tamyhs.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesSevice {

    private ClientesRepository repository;

    @Autowired
    public  ClientesSevice(ClientesRepository repository){
        this.repository = repository;
    }

    public void salvarClientes(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }

    public void  validarCliente(Cliente cliente){
        //aplica validações
    }
}
