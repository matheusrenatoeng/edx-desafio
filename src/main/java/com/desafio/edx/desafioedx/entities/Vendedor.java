package com.desafio.edx.desafioedx.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
public class Vendedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cdvend;

    @Column(nullable = false)
    private String dsnome;

    private Integer cdtab;

    private Date dtnasc;

    @OneToMany(mappedBy="vendedor")
    private List<Cliente> cliente;
}
