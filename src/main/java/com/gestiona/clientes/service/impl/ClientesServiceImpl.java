package com.gestiona.clientes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiona.clientes.domain.Cliente;
import com.gestiona.clientes.dto.ClienteDTO;
import com.gestiona.clientes.dto.ClientePatchDTO;
import com.gestiona.clientes.exceptions.ClientNotFoundException;
import com.gestiona.clientes.mapper.ClientesMapper;
import com.gestiona.clientes.repository.ClientesRepository;
import com.gestiona.clientes.service.ClientesService;

@Service
public class ClientesServiceImpl implements ClientesService {
	
	@Autowired
	private ClientesRepository clientesRepository;
	
	@Autowired
	private ClientesMapper clientesMapper;

	@Override
	public void registrarCliente(ClienteDTO clienteDTO) {
		Cliente cliente = clientesMapper.clienteDTOToCliente(clienteDTO);
		clientesRepository.save(cliente);
	}

	@Override
	public void modificarCliente(Integer id, ClienteDTO clienteDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarCliente(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ClienteDTO obtenerClientePorId(Integer id) {
		return clientesMapper.clienteToClienteDTO(clientesRepository.findById(id).orElseThrow(() -> new ClientNotFoundException(id)));
		
	}

	@Override
	public List<ClienteDTO> obtenerClientes() {
		return clientesMapper.clientesToClientesDTO(clientesRepository.findAll());
		
	}

	@Override
	public void modificarCamposCliente(Integer id, ClientePatchDTO clientePatchDTO) {
		// TODO Auto-generated method stub
		
	}

}
