package com.example.mspersona.service;

import com.example.mspersona.models.Cliente;

import java.util.List;

public interface ClienteService {

    List<Cliente> findAll();
    Cliente findById(Long id);
    Cliente create(Cliente persona);
    Cliente update(Cliente persona);
    void delete(Long id);

}
