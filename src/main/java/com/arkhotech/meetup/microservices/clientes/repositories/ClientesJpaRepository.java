package com.arkhotech.meetup.microservices.clientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.arkhotech.meetup.microservices.clientes.model.Cliente;

public interface ClientesJpaRepository extends JpaRepository<Cliente, Integer> {
	@Query("select c from Cliente c where c.rut = ?1")
	Cliente findByRut(Integer rut);
}
