package com.example.mspersona.controller;

import com.example.mspersona.models.Cliente;
import com.example.mspersona.service.ClienteService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;


@WebMvcTest(ClienteController.class)
class ClienteControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private ClienteService service;

    @Test
    void findAllTest() throws Exception {

        Mockito.when(service.findAll()).thenReturn(getListClientes());

        mockMvc.perform(MockMvcRequestBuilders.get("/clientes").contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].nombre").value("Christian"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].nombre").value("Carlos"));

        Mockito.verify(service).findAll();

    }

    @Test
    void create() throws Exception {

        Mockito.when(service.create(Mockito.any()))
                .thenReturn(getCliente(1L, "Christian", "123456", true));

        mockMvc.perform(MockMvcRequestBuilders.post("/clientes").contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(getCliente(1L, "Christian", "123456", true))))
                .andExpect(MockMvcResultMatchers.status().isCreated());

        Mockito.verify(service).create(Mockito.any());

    }


   private List<Cliente> getListClientes() {
        List<Cliente> clienteList = new ArrayList<>();

       clienteList.add(getCliente(1L, "Christian", "123456", true));
       clienteList.add(getCliente(2L, "Carlos", "123456", true));

       return clienteList;
   }

   private Cliente getCliente(Long id, String nombre, String pasword, Boolean estado) {
        Cliente cliente = new Cliente();

        cliente.setId(id);
        cliente.setNombre(nombre);
        cliente.setPassword(pasword);
        cliente.setEstado(estado);

        return cliente;
   }


}