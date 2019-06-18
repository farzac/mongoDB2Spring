package com.farzac.crud.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farzac.crud.api.documents.Cliente;
import com.farzac.crud.api.response.Response;
import com.farzac.crud.api.service.ClienteService;

@RestController
@RequestMapping(path = "/api/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping
	public ResponseEntity<Response<List<Cliente>>> listarTodos() {
		return ResponseEntity.ok(new Response<List<Cliente>>(this.clienteService.listarTodos()));
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<Cliente> listarPorID(@PathVariable(name = "id") String id) {
		return ResponseEntity.ok(this.clienteService.listarPorID(id));
	}

	@PostMapping
	public ResponseEntity<Response<Cliente>> cadastrar(@RequestBody Cliente cliente, BindingResult result) {
		if (result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Cliente>(erros));
		}
		return ResponseEntity.ok(new Response<Cliente>(this.clienteService.cadastrar(cliente)));
	}

	@PutMapping(path = "/{id}")
	public ResponseEntity<Response<Cliente>> atualizar(@PathVariable(name = "id") String id, @RequestBody Cliente cliente,
			BindingResult result) {
		if (result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(error -> erros.add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Cliente>(erros));
		}
		cliente.setId(id);
		return ResponseEntity.ok(new Response<Cliente>(this.clienteService.atualizar(cliente)));
	}

	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Integer> remover(@PathVariable(name = "id") String id) {
		this.clienteService.remover(id);
		return ResponseEntity.ok(1);
	}
	
	public ClienteService getClienteService() {
		return clienteService;
	}

	public void setClienteService(ClienteService clienteService) {
		this.clienteService = clienteService;
	}

}
