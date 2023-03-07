package tn.esprit.spring.tp_spring.Services;

import tn.esprit.spring.tp_spring.Entities.Moniteur;

import java.util.*;

public interface IMoniteurService  {
    List<Moniteur> retrieveAllMoniteurs();

    Moniteur addMoniteur(Moniteur e);

    Moniteur updateMoniteur (Moniteur e);

    Moniteur retrieveMoniteur (long idMoniteur);

    void deleteMoniteur( long idMoniteur);
}
