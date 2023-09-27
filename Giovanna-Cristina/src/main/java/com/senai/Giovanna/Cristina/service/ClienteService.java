package com.senai.Giovanna.Cristina.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.senai.Giovanna.Cristina.entities.Cliente;
import com.senai.Giovanna.Cristina.repository.Repository;


@Service
public class ClienteService {

	private final Repository clienteRepository;
		
	public ClienteService (Repository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	// inserir produto
	public Cliente saveCliente (Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	// listar produtos por id 
	public Cliente getClienteById (Long idcCliente) {
		return clienteRepository.findById(idcCliente).orElse(null);
	}
	// listar os produtos
	public List<Cliente> getAllCliente() {
		return clienteRepository.findAll();
	}
	// apagar produto 
	public void deletecliente (Long idcCliente) {
		clienteRepository.deleteById(idcCliente );
	}
	}

