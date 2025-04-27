package com.intecsup.gestion_salles.repository;

import com.intecsup.gestion_salles.Entity.Salle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SalleRepository extends JpaRepository<Salle, Long> {
   // List<Salle> findByBlocnom(String nom);
    List<Salle> findByCapacite(int capacite);
    List<Salle> findByType(String type);
    Salle findByNom(String nom);
    void deleteByNom(String nom);
}
