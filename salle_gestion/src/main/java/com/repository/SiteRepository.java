package com.intecsup.gestion_salles.repository;

import com.intecsup.gestion_salles.Entity.Site;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SiteRepository extends JpaRepository<Site, Long> {
    Optional<Site> findByNom(String nom);

    void deleteByNom(String nom);
}
