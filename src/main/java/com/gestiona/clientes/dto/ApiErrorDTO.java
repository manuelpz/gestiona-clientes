package com.gestiona.clientes.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data               
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiErrorDTO {

	private int status;
    private String message;
    private Date date;
    
}
