package com.intecsup.gestion_salles.controller;

import com.intecsup.gestion_salles.Entity.Site;
import com.intecsup.gestion_salles.services.SiteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/site")
public class SiteController {
    private final SiteService siteService;

    public SiteController(SiteService siteService) {
        this.siteService = siteService;
    }

    @GetMapping("/list")
    public List<Site> getAllSites() {
        return siteService.getAllSites();
    }

    @PostMapping("/creer")
    public Site createSite(@RequestBody Site site) {
        return siteService.Createsite(site);
    }


    @GetMapping("/serchbynom/{nom}")
    public Site getSiteByNom(@PathVariable String nom) {
        return siteService.getSiteByNom(nom);
    }


    @DeleteMapping("/delete/{nom}")
    public String deleteSiteByNom(@PathVariable String nom, @RequestParam(required = false) boolean confirm) {
        if (!confirm) {
            return "⚠️ Êtes-vous sûr de vouloir supprimer le site \"" + nom + "\" ? Ajoutez ?confirm=true à l’URL pour confirmer.";
        }

        siteService.deleteSiteByNom(nom);
        return "✅ Le site \"" + nom + "\" a été supprimé avec succès.";
    }


}
