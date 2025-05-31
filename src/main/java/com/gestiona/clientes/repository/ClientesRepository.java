package com.gestiona.clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestiona.clientes.domain.Cliente;

@Repository
public interface ClientesRepository extends JpaRepository<Cliente, Integer>{

}
