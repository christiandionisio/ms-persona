package com.example.mspersona.service;

import com.example.mspersona.models.Persona;
import com.example.mspersona.repo.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository repository;

    @Override
    public List<Persona> findAll() {
        return repository.findAll();
    }

    @Override
    public Persona findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Persona create(Persona persona) {
        return repository.save(persona);
    }

    @Override
    public Persona update(Persona persona) {
        return repository.save(persona);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
