package com.desafio.edx.desafioedx.controllers;

import com.desafio.edx.desafioedx.entities.Cliente;
import com.desafio.edx.desafioedx.entities.Vendedor;
import com.desafio.edx.desafioedx.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> lista() {
        List<Cliente> cliente = clienteRepository.findAll();
        return cliente;
    }
}
