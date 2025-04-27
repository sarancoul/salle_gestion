package com.intecsup.gestion_salles.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Salle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private int capacite;

    private String type; // cours magistral, TD, informatique,

    @ManyToOne
    @JoinColumn(name = "bloc_id")
    private Bloc bloc;
}