package com.gestiona.clientes.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.gestiona.clientes.domain.Cliente;
import com.gestiona.clientes.dto.ClienteDTO;
import com.gestiona.clientes.dto.ClientePatchDTO;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ClientesMapper {

	Cliente clienteDTOToCliente(ClienteDTO clienteDTO);
	
	Cliente clientePatchDTOToCliente(ClientePatchDTO clienteDTO);
	
	ClienteDTO clienteToClienteDTO(Cliente cliente);
	
	List<ClienteDTO> clientesToClientesDTO(List<Cliente> clientes);
}
