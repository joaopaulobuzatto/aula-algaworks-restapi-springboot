package com.example.restapi.service;

import com.example.restapi.model.Cliente;
import com.example.restapi.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public List<Cliente> findAll() {
        return repository.findAll();
    }

    public Optional<Cliente> findById(long id) {
        return repository.findById(id);
    }

    public Cliente save(Cliente create) {
        return repository.save(create);
    }

    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
