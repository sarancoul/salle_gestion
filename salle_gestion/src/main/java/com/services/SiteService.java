package com.intecsup.gestion_salles.services;

import com.intecsup.gestion_salles.Entity.Site;
import com.intecsup.gestion_salles.repository.SiteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SiteService {
    private final SiteRepository siteRepository;

    public SiteService(SiteRepository siteRepository) {
        this.siteRepository = siteRepository;
    }
    public List<Site> getAllSites(){
        return siteRepository.findAll();
    }

    public Site Createsite(Site site){
        return siteRepository.save(site);
    }
    public Site getSiteByNom(String nom) {
        return siteRepository.findByNom(nom).orElse(null);
    }

    public void deleteSite(Long id) {
        siteRepository.deleteById(id);
    }

    public void deleteSiteByNom(String nom) {
        siteRepository.deleteByNom(nom);
    }


}
