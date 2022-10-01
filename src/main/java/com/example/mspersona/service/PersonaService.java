package com.example.mspersona.service;

import com.example.mspersona.models.Persona;

import java.util.List;

public interface PersonaService {

    List<Persona> findAll();
    Persona findById(Long id);
    Persona create(Persona persona);
    Persona update(Persona persona);
    void delete(Long id);

}
