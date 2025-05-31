package com.gestiona.clientes.mapper;

import org.mapstruct.Mapper;

import com.gestiona.clientes.domain.Cliente;
import com.gestiona.clientes.dto.ClienteDTO;

@Mapper(componentModel = "spring")
public interface ClientesMapper {

	Cliente clienteDTOToCliente(ClienteDTO clienteDTO);
}
