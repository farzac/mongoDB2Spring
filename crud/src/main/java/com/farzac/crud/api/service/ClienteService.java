package com.farzac.crud.api.service;

import java.util.List;

import com.farzac.crud.api.documents.Cliente;

public interface ClienteService {
	
	List<Cliente> listarTodos();
	
	Cliente listarPorID(String id);
	
	Cliente cadastrar(Cliente cliente);
	
	Cliente atualizar(Cliente cliente);
	
	void remover(String id);

}
