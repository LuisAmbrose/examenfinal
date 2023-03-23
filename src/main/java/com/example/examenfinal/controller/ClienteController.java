package com.example.examenfinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.examenfinal.model.Cliente;
import com.example.examenfinal.service.ClienteService;

import java.util.List;

//////////////////////////////////////////////////
//////////////////////////////////////////////////


@RestController
@RequestMapping("/api/Cliente")
public class ClienteController {
//////////////////////////////////////////////////
//////////////////////////////////////////////////
	
	@Autowired
    ClienteService clienteService;

    @GetMapping("/listar")
    public ResponseEntity<List<Cliente>> listarProductos() {
        return new ResponseEntity<>(clienteService.findByAll(), 
                HttpStatus.OK);
    }
    @PostMapping("/crear")
    public ResponseEntity<Cliente> crearProducto(
            @RequestBody Cliente p) {
        return new ResponseEntity<>(clienteService.save(p), 
                HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Cliente> actualizarProducto(@PathVariable Long id, @RequestBody Cliente p) {
        Cliente ClienteENcontrada = clienteService.findById(id);
        if (ClienteENcontrada == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                ClienteENcontrada.setNombre(p.getNombre());
                ClienteENcontrada.setApellido(p.getApellido());
                ClienteENcontrada.setCedula(p.getCedula());
                ClienteENcontrada.setCorreo(p.getCorreo());
                return new ResponseEntity<>(clienteService.save(p), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Cliente> eliminarProducto(@PathVariable Long id) {
        clienteService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
//////////////////////////////////////////////////
//////////////////////////////////////////////////
}
//////////////////////////////////////////////////
//////////////////////////////////////////////////
