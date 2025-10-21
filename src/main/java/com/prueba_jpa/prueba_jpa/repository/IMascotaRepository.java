package com.prueba_jpa.prueba_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba_jpa.prueba_jpa.models.Mascota;
@Repository
public interface IMascotaRepository extends JpaRepository<Mascota,Long>{

}
