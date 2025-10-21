package com.prueba_jpa.prueba_jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba_jpa.prueba_jpa.models.Mascota;
import com.prueba_jpa.prueba_jpa.repository.IMascotaRepository;
@Service
public class MascotaService implements IMascotaService{

    @Autowired
    IMascotaRepository repoMasco;

    @Override
    public List<Mascota> getMascotas() {
        List <Mascota> listaMascotas = repoMasco.findAll();
        return listaMascotas;
    }

    @Override
    public void saveMascota(Mascota mascota) {
        repoMasco.save(mascota);
    }

    @Override
    public void daleteMascota(Long id) {
        repoMasco.deleteById(id);
    }

    @Override
    public Mascota findMascota(Long id) {
        Mascota mascota = repoMasco.findById(id).orElse(null);;
        return mascota;
    }

    @Override
    public void editMascota(Long idOriginal, String nuevoNombre, String nuevoEspecie, String nuevaRaza,
            String nuevoColor) {
        Mascota mascoEditar = this.findMascota(idOriginal);
        mascoEditar.setNombre(nuevoNombre);
        mascoEditar.setEspecie(nuevoEspecie);
        mascoEditar.setRaza(nuevaRaza);
        mascoEditar.setColor(nuevoColor);

        this.saveMascota(mascoEditar);
    }
}
