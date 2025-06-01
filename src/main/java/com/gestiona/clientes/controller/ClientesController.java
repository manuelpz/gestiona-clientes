package com.gestiona.clientes.controller;

import com.gestiona.clientes.dto.ClienteDTO;
import com.gestiona.clientes.dto.ClientePatchDTO;
import com.gestiona.clientes.service.impl.ClientesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

    @Autowired
    private ClientesServiceImpl clientesService;

    // Crear cliente (POST /clientes)
    @PostMapping
    public ResponseEntity<Void> registrarCliente(@RequestBody ClienteDTO clienteDTO) {
        clientesService.registrarCliente(clienteDTO);
        return ResponseEntity.ok().build();
    }

    // Actualizar cliente (PUT /clientes/{id})
    @PutMapping("/{id}")
    public ResponseEntity<Void> modificarCliente(@PathVariable Integer id, @RequestBody ClienteDTO clienteDTO) {
        clientesService.modificarCliente(id, clienteDTO);
        return ResponseEntity.ok().build();
    }
    
    // Actualizar solo ciertos datos cliente (PATCH /clientes/{id})
    @PatchMapping("/{id}")
    public ResponseEntity<Void> modificarCamposCliente(@PathVariable Integer id, @RequestBody ClientePatchDTO clientePatchDTO) {
        clientesService.modificarCamposCliente(id, clientePatchDTO);
        return ResponseEntity.ok().build();
    }

    // Eliminar cliente (DELETE /clientes/{id})
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> borrarCliente(@PathVariable Integer id) {
        clientesService.borrarCliente(id);
        return ResponseEntity.noContent().build();
    }
    
    // Obtener cliente por ID (GET /clientes/{id})
    @GetMapping("/{id}")
    public ResponseEntity<ClienteDTO> obtenerClientePorId(@PathVariable Integer id) {
        ClienteDTO cliente = clientesService.obtenerClientePorId(id);
        return ResponseEntity.ok(cliente);
    }

    // Listar todos los clientes (GET /clientes)
    @GetMapping
    public ResponseEntity<List<ClienteDTO>> obtenerClientes() {
        List<ClienteDTO> clientes = clientesService.obtenerClientes();
        return ResponseEntity.ok(clientes);
    }
}
