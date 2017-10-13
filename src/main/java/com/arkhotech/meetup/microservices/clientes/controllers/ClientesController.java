package com.arkhotech.meetup.microservices.clientes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.arkhotech.meetup.microservices.clientes.model.Cliente;
import com.arkhotech.meetup.microservices.clientes.repositories.ClientesJpaRepository;

@Controller
@RequestMapping(path="/clientes")
public class ClientesController {

	@Autowired
	ClientesJpaRepository clientesJpaRepository;
	
	@GetMapping(path="/")
	public @ResponseBody Iterable<Cliente> listAllCustomers() {
		return clientesJpaRepository.findAll();
	}
	
	@GetMapping(path="/id/{idCliente}")
	public @ResponseBody Cliente getCustomerById(@PathVariable Integer idCliente) {
		return clientesJpaRepository.findOne(idCliente);
	}

	@GetMapping(path="/rut/{rutCliente}")
	public @ResponseBody Cliente getCustomerByRut(@PathVariable Integer rutCliente) {
		return clientesJpaRepository.findByRut(rutCliente);
	}

	
}
