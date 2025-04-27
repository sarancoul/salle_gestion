package com.intecsup.gestion_salles.controller;

import com.intecsup.gestion_salles.Entity.Salle;
import com.intecsup.gestion_salles.services.SalleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salle")
public class SalleController {

    private final SalleService salleService;

    public SalleController(SalleService salleService) {
        this.salleService = salleService;
    }

    @GetMapping
    public List<Salle> getAllSalles() {
        return salleService.getAllSalles();
    }

    @GetMapping("/serch/{nom}")
    public Salle getSalleByNom(@PathVariable String nom) {
        return salleService.getSalleByNom(nom);
    }

    @PostMapping("/creat")
    public Salle createSalle(@RequestBody Salle salle) {
        return salleService.createSalle(salle);
    }

    @DeleteMapping("/delete/{nom}")
    public String deleteSalle(@PathVariable String nom, @RequestParam(required = false) boolean confirm) {
        if (!confirm) {
            return "⚠️ Êtes-vous sûr de vouloir supprimer la salle \"" + nom + "\" ? Ajoutez ?confirm=true à l’URL.";
        }
        salleService.deleteSalleByNom(nom);
        return "✅ Salle supprimée : " + nom;
    }

 /*   @GetMapping("/bloc/{blocId}")
    public List<Salle> getSallesByBloc(@PathVariable String nom) {
        return salleService.getSallesByBloc(nom);
    }*/

    @GetMapping("/capacite/{minCapacite}")
    public List<Salle> getSallesByCapacite(@PathVariable int minCapacite) {
        return salleService.getSallesByCapacite(minCapacite);
    }

    @GetMapping("/type/{type}")
    public List<Salle> getSallesByType(@PathVariable String type) {
        return salleService.getSallesByType(type);
    }
}
