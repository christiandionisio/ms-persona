package com.example.mspersona.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String genero;
    private String edad;
    private String identificacion;
    private String direccion;
    private String telefono;
}
