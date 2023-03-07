package tn.esprit.spring.tp_spring.Entities;


import javax.persistence.*;
import java.util.List;

@Entity
@Table( name = "Inscription")
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numInscription")
    private Long numInscription; // Clé primaire
    private Long numSemaine;
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Skieur skieur;
    @ManyToOne
    private Cours cours;
}
