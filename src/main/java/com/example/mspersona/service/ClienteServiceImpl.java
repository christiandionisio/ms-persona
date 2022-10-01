package com.example.mspersona.service;

import com.example.mspersona.models.Cliente;
import com.example.mspersona.repo.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Override
    public List<Cliente> findAll() {
        return repository.findAll();
    }

    @Override
    public Cliente findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Cliente create(Cliente cliente) {
        return repository.save(cliente);
    }

    @Override
    public Cliente update(Cliente cliente) {
        return repository.save(cliente);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
