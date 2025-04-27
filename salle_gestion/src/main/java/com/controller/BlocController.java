package com.intecsup.gestion_salles.controller;

import com.intecsup.gestion_salles.Entity.Bloc;
import com.intecsup.gestion_salles.services.BlocService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blocs")
public class BlocController {

    private final BlocService blocService;

    public BlocController(BlocService blocService) {
        this.blocService = blocService;
    }

    @GetMapping
    public List<Bloc> getAllBlocs() {
        return blocService.getAllBlocs();
    }

   /* @GetMapping("/site/{sitenom}")
    public List<bloc> getBlocsBySite(@PathVariable String sitenom) {
        return blocService.getBlocsBySite(sitenom);
    }*/


    @PostMapping("/creatbloc")
    public Bloc createBloc(@RequestBody Bloc bloc) {
        return blocService.createBloc(bloc);
    }

   /* @DeleteMapping("/{id}")
    public void deleteBloc(@PathVariable Long id) {
        blocService.deleteBloc(id);
    }*/
   @DeleteMapping("/delete/{nom}")
   public String deleteBlocByNom(@PathVariable String nom, @RequestParam(required = false) boolean confirm) {
       if (!confirm) {
           return "⚠️ Êtes-vous sûr de vouloir supprimer le bloc \"" + nom + "\" ? Ajoutez ?confirm=true à l’URL pour confirmer.";
       }

       blocService.deleteBlocByNom(nom);
       return "✅ Le bloc \"" + nom + "\" a été supprimé avec succès.";
   }

}
