package com.desafio.edx.desafioedx.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
public class Cliente {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cdcl;

    private String dsnome;

    private Character idTip;

    @ManyToOne
    @JoinColumn(name="vendedor_id", nullable=false)
    private Vendedor vendedor;

    private BigDecimal dslim;
}