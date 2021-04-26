package com.desafio.edx.desafioedx.repository;

import com.desafio.edx.desafioedx.entities.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface VendedorRepository extends JpaRepository<Vendedor, UUID> {
}
