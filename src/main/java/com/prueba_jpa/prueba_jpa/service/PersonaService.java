package com.prueba_jpa.prueba_jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba_jpa.prueba_jpa.models.Persona;
import com.prueba_jpa.prueba_jpa.repository.IPersonaRepository;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    IPersonaRepository persoRepo;

    @Override
    public List<Persona> getPersonas() {
        List<Persona> listaPersonas = persoRepo.findAll();
        return listaPersonas;
    }

    @Override
    public void savePersona(Persona perso) {
        persoRepo.save(perso);
    }

    @Override
    public void daletePersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona perso = persoRepo.findById(id).orElse(null);
        return perso;
    }

    @Override
    public void editPersona(Long idOriginal, String nuevoNombre, String nuevoApellido, int nuevaEdad) {
        // busco el objeto con la id original
        Persona perso = this.findPersona(idOriginal);
        // seteamos los valores nuevos a ese objeto
        perso.setNombre(nuevoNombre);
        perso.setApellido(nuevoApellido);
        perso.setEdad(nuevaEdad);
        // guardar los cambios en la bd
        this.savePersona(perso);
    }

    public void editPersona(Persona persona) {
        this.persoRepo.save(persona);
    }
}
