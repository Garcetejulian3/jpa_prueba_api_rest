package com.prueba_jpa.prueba_jpa.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.prueba_jpa.prueba_jpa.models.Mascota;
import com.prueba_jpa.prueba_jpa.service.MascotaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class MascotaController {

    @Autowired
    MascotaService mascoService;
    @PostMapping("/mascota/crear")
    public String saveMascota(@RequestBody Mascota mascota) {
        mascoService.saveMascota(mascota);
        
        return "Se guardo correctamente";
    }
    
}
