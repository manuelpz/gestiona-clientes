package com.gestiona.clientes.exceptions;

import jakarta.persistence.EntityNotFoundException;

public class ClientNotFoundException extends EntityNotFoundException {

	private static final long serialVersionUID = 1L;
	
	public ClientNotFoundException(Integer id) {
        super("No se ha encontrado ningun cliente con el ID " + id);
    }

}
