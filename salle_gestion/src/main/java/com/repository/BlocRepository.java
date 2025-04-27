package com.intecsup.gestion_salles.repository;

import com.intecsup.gestion_salles.Entity.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BlocRepository extends JpaRepository<Bloc, Long> {
   // List<bloc> findBySitenom(String nom);

    Optional<Bloc> findByNom(String nom);
    void deleteByNom(String nom);
}
