package com.example.restapi.service;

import com.example.restapi.model.Cliente;
import com.example.restapi.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public List<Cliente> listar() {
        return repository.findAll();
    }

    public Cliente create(Cliente create) {
        return repository.save(create);
    }
}
