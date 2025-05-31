package com.gestiona.clientes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiona.clientes.dto.ClienteDTO;
import com.gestiona.clientes.service.impl.ClientesServiceImpl;

@RestController
@RequestMapping("/clientes")
public class ClientesController {
	
	@Autowired
	private ClientesServiceImpl clientesService;
	
	@PostMapping("/alta")
	private void registrarUsuario(ClienteDTO clienteDTO) {
		clientesService.registrarCliente(clienteDTO);
	}

}
