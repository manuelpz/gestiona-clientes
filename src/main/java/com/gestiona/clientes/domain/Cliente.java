package com.gestiona.clientes.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
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
@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer id;

    @Size(max = 30, min = 0)
    @NotBlank(message = "El nombre del cliente es obligatorio")
    @Column(name = "nom_cliente")
    private String nombre;

    @Size(max = 30)
    @Column(name = "apellido1_cliente")
    private String apellido1;

    @Size(max = 30)
    @Column(name = "apellido2_cliente")
    private String apellido2;

    @Column(name = "email_cliente")
    private String email;
}
