package com.desafio.edx.desafioedx.controllers;

import com.desafio.edx.desafioedx.entities.Vendedor;
import com.desafio.edx.desafioedx.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/vendedores")
public class VendedorController {

    @Autowired
    private VendedorRepository vendedorRepository;

    @GetMapping
    public List<Vendedor> lista() {
        List<Vendedor> vendedor = vendedorRepository.findAll();
        return vendedor;
    }

}
