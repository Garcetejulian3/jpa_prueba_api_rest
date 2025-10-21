package com.prueba_jpa.prueba_jpa.service;

import java.util.List;

import com.prueba_jpa.prueba_jpa.models.Persona;

public interface IPersonaService {

    // metodo para traer todas las personas 
    public List<Persona>getPersonas();
    // metodo para dar de alta
    public void savePersona(Persona persona);
    // metodo para eliminar 
    public void daletePersona(Long id);
    // metodo para buscar a uno solo por Id
    public Persona findPersona(Long id);
    // metodo para edicion mandando todo los parametros (mala practica)
    public void editPersona(Long idOriginal,String nuevoNombre,String nuevoApellido, int nuevaEdad);
    public void editPersona(Persona persona);
}
