package tn.esprit.spring.tp_spring.Entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table( name = "Skieur")
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numSkieur")
    private Long numSkieur; // Clé primaire
    private String nomS;
    private String prenomS;
    private Date dateNaissance;
    private String ville;
    @ManyToMany
    private List<Piste> pistes;

    @OneToMany(mappedBy = "skieur", cascade = CascadeType.ALL)
    private List<Inscription> inscriptions;

    @OneToOne(cascade = CascadeType.ALL)
    private Abonnement abonnement;


}
