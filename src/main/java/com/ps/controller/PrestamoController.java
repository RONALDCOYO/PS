package com.ps.controller;


import com.ps.model.Prestamo;
import com.ps.service.IPrestamoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController //Decirle que esta clase es administrada o controlada por SPRING
@RequestMapping("/prestamos") //Agregar una ruta para la clase

public class PrestamoController {

    //ResponseEntity nos sirven para dar respuesta a peticiones con estas... 200 404, 500

    private final IPrestamoService iPrestamoService;

    @GetMapping
    public ResponseEntity<Prestamo> getPrestamoById(@PathVariable Long id) {
        return ResponseEntity.ok(iPrestamoService.getPrestamoById(id));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseEntity<Prestamo> createPrestamo(@RequestBody Prestamo prestamo) {
        Prestamo createdPrestamo = iPrestamoService.createPrestamo(prestamo);
        return new ResponseEntity<>(createdPrestamo, HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<Void> deletePrestamo(@PathVariable Long id) {
        iPrestamoService.deletePrestamo(id);
        return ResponseEntity.noContent().build();
    }
}
