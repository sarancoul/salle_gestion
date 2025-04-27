package com.intecsup.gestion_salles.services;

import com.intecsup.gestion_salles.Entity.Salle;
import com.intecsup.gestion_salles.repository.SalleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalleService {

    private final SalleRepository salleRepository;

    public SalleService(SalleRepository salleRepository) {
        this.salleRepository = salleRepository;
    }

    public List<Salle> getAllSalles() {
        return salleRepository.findAll();
    }

    public Salle createSalle(Salle salle) {
        return salleRepository.save(salle);
    }

    public Salle getSalleByNom(String nom) {
        return salleRepository.findByNom(nom);
    }

    public void deleteSalleByNom(String nom) {
        salleRepository.deleteByNom(nom);
    }

    /*public List<Salle> getSallesByBloc(String nom) {
        return salleRepository.findByBlocnom(nom );
    }*/

    public List<Salle> getSallesByCapacite(int minCapacite) {
        return salleRepository.findByCapacite(minCapacite);
    }

    public List<Salle> getSallesByType(String type) {
        return salleRepository.findByType(type);
    }
}
