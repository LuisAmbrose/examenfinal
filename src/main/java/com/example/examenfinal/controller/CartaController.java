package com.example.examenfinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.examenfinal.model.Carta;
import com.example.examenfinal.service.CartaService;



@RestController
@RequestMapping("/api/Carta")
public class CartaController {
	
	@Autowired
    CartaService cartaService;

    @GetMapping("/listar")
    public ResponseEntity<List<Carta>> listarProductos() {
        return new ResponseEntity<>(cartaService.findByAll(), 
                HttpStatus.OK);
    }
    @PostMapping("/crear")
    public ResponseEntity<Carta> crearProducto(
            @RequestBody Carta p) {
        return new ResponseEntity<>(cartaService.save(p), 
                HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Carta> actualizarProducto(@PathVariable Long id, @RequestBody Carta p) {
        Carta CartaENcontrada = cartaService.findById(id);
        if (CartaENcontrada == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                CartaENcontrada.setNombre(p.getNombre());
                CartaENcontrada.setApellido(p.getApellido());
                CartaENcontrada.setCedula(p.getCedula());
                CartaENcontrada.setCorreo(p.getCorreo());
                return new ResponseEntity<>(cartaService.save(p), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Carta> eliminarProducto(@PathVariable Long id) {
        cartaService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
