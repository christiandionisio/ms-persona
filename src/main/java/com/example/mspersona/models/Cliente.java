package com.example.mspersona.models;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Cliente extends Persona {

    private String password;
    private Boolean estado;
}
