package tn.esprit.spring.tp_spring.Services;

import tn.esprit.spring.tp_spring.Entities.Inscription;
import tn.esprit.spring.tp_spring.Entities.Skieur;

import java.util.List;

public interface ISkieurService {

    Skieur addSkieur(Skieur skieur);


    Skieur ajouterInscriptions(List<Inscription> inscriptions, Skieur skieur);
}
