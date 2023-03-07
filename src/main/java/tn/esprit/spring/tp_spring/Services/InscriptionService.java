package tn.esprit.spring.tp_spring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.tp_spring.Entities.Inscription;
import tn.esprit.spring.tp_spring.Entities.Skieur;
import tn.esprit.spring.tp_spring.Repositories.InscriptionRepository;
import tn.esprit.spring.tp_spring.Repositories.SkieurRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class InscriptionService implements  IInscriptionService{
        InscriptionRepository inscriptionRepository;
        SkieurRepository skieurRepository;

}
