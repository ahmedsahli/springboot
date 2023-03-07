package tn.esprit.spring.tp_spring.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Moniteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numMoniteur")
    private long numMoniteur;
    private String nomM;
    private String prenomM;
    private Date dateRecu;



    @OneToMany
    private List<Cours> cours;


}
