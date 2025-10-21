package com.prueba_jpa.prueba_jpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.prueba_jpa.prueba_jpa.models.Persona;
import com.prueba_jpa.prueba_jpa.service.PersonaService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class PersonaController {

    @Autowired
    private PersonaService persoServ;

    @GetMapping("/personas/traer")
    public List<Persona> getPersonas() {
        return persoServ.getPersonas();
    }
    
    @PostMapping("/personas/crear")
    public String savePersona(@RequestBody Persona perso) {
        persoServ.savePersona(perso);
        return "Se guardo correctamente";
    }

    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersonas(@PathVariable Long id){
        persoServ.daletePersona(id);
        return "Se elimino correctamente";
    }
    
    /*@PutMapping("/personas/editar/{id_modificar}")
    public Persona editPersona(@PathVariable ("id_modificar") Long idOriginal ,
                            @RequestParam(required = false,name = "nombre") String nuevoNombre,
                            @RequestParam(required = false,name = "apellido") String nuevoApellido,
                            @RequestParam(required = false,name = "edad") int nuevaEdad ){
        persoServ.editPersona(idOriginal, nuevoNombre, nuevoApellido, nuevaEdad);
        Persona persona = persoServ.findPersona(idOriginal);                                                       
        return persona;
    }*/

    @PutMapping("/personas/editar")
    public Persona editPersona(@RequestBody Persona persona){
        persoServ.editPersona(persona);
        return persoServ.findPersona(persona.getId());
    }




}
