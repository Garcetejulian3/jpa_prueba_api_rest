package com.prueba_jpa.prueba_jpa.service;

import java.util.List;

import com.prueba_jpa.prueba_jpa.models.Mascota;

public interface IMascotaService {

    // metodo para traer todas las mascotas 
    public List<Mascota>getMascotas();
    // metodo para dar de alta
    public void saveMascota(Mascota mascota);
    // metodo para eliminar 
    public void daleteMascota(Long id);
    // metodo para buscar a uno solo por Id
    public Mascota findMascota(Long id);
    // metodo para edicion mandando todo los parametros (mala practica)
    public void editMascota(Long idOriginal,String nuevoNombre,String nuevoEspecie, String nuevaRaza,String nuevoColor);

}
