package com.gestiona.clientes.service;

import java.util.List;

import com.gestiona.clientes.dto.ClienteDTO;
import com.gestiona.clientes.dto.ClientePatchDTO;

public interface ClientesService {

	void registrarCliente(ClienteDTO clienteDTO);
	void modificarCliente(Integer id, ClienteDTO clienteDTO);
	void modificarCamposCliente(Integer id, ClientePatchDTO clientePatchDTO);
	void borrarCliente(Integer id);
	ClienteDTO obtenerClientePorId(Integer id);
	List<ClienteDTO> obtenerClientes();
}
