package com.intecsup.gestion_salles.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
   private String nom;
   private int etage;

    @OneToMany(mappedBy = "bloc")
    private List<Salle> salle;

   @ManyToOne
    @JoinColumn(name = "site_id")
    private Site site;
}
