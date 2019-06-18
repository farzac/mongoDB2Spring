package com.farzac.crud.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farzac.crud.api.documents.Cliente;
import com.farzac.crud.api.repository.ClienteRepository;
import com.farzac.crud.api.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public List<Cliente> listarTodos() {
		return this.clienteRepository.findAll();
	}

	@Override
	public Cliente listarPorID(String id) {
		return this.clienteRepository.findById(id).orElse(null)  ;
	}

	@Override
	public Cliente cadastrar(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	@Override
	public Cliente atualizar(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	@Override
	public void remover(String id) {
		this.clienteRepository.deleteById(id);
	}
	
	public ClienteRepository getClienteRepository() {
		return clienteRepository;
	}

	public void setClienteRepository(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	
}

