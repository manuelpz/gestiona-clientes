package com.gestiona.clientes.dto;

import jakarta.validation.constraints.NotBlank;
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
public class ClienteDTO {
	
	@NotBlank
	private String nombre;
	
	private String apellido1;
	
	private String apellido2;
	
	private String email;

}
