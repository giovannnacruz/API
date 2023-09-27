package com.senai.Giovanna.Cristina.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.Giovanna.Cristina.entities.Cliente;
import com.senai.Giovanna.Cristina.service.ClienteService;

@RestController
@RequestMapping("/clients")
public class ClienteController {
	private static final String ID = "/{id}";
	private final ClienteService clienteService;

	public ClienteController(ClienteService clienteService) {
		this.clienteService = clienteService;
	}

	@PostMapping
	public Cliente createProduct(@RequestBody Cliente cliente) {
		return (Cliente) clienteService.saveCliente(cliente);
	}

	@GetMapping("/{idcCliente}")
	public Cliente getAllCliente(@PathVariable Long idcCliente) {
		return clienteService.getClienteById(idcCliente);
	}

	@GetMapping
	public List<Cliente> getAllClientes() {
		return clienteService.getAllCliente();
	}

	@DeleteMapping("/{idcCliente}")
	public void deleteCliente(@PathVariable Long idcCliente) {
		clienteService.deletecliente(idcCliente);
	}

}
