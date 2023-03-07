package tn.esprit.spring.tp_spring.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Abonnement {
    public Abonnement(Date dateDebut, Date datefin, float prixAbon, tn.esprit.spring.tp_spring.Entities.TypeAbonnement typeAbonnement) {
        this.dateDebut = dateDebut;
        this.datefin = datefin;
        this.prixAbon = prixAbon;
        TypeAbonnement = typeAbonnement;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numAbon")
    private long numAbon;
    private Date dateDebut;
    private Date datefin;
    private float prixAbon;

    @Enumerated(EnumType.STRING)
    private TypeAbonnement TypeAbonnement;



}
