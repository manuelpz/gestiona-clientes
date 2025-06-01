package com.gestiona.clientes.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientePatchDTO {

	private Integer id;
	
	private String nombre;
	
	private String apellido1;
	
	private String apellido2;
	
	private String email;

}
