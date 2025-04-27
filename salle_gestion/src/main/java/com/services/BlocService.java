package com.intecsup.gestion_salles.services;

import com.intecsup.gestion_salles.Entity.Bloc;
import com.intecsup.gestion_salles.repository.BlocRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlocService {
    private final BlocRepository blocRepository;

    public BlocService(BlocRepository blocRepository) {
        this.blocRepository = blocRepository;
    }


    public List<Bloc> getAllBlocs() {
        return blocRepository.findAll();
    }

    /*public List<bloc> getBlocsBySite(String nom) {
        return blocRepository.findBySitenom(nom);
    }*/

    public Bloc createBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

  /*  public void deleteBloc(Long id) {
        blocRepository.deleteById(id);
    }*/

    public void deleteBlocByNom(String nom) {
        blocRepository.deleteByNom(nom);
    }
}
