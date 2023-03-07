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
public class SkieurService implements ISkieurService {

    SkieurRepository skieurRepository;
    InscriptionRepository inscriptionRepository;

    @Override
    public Skieur addSkieur(Skieur skieur) {
     return skieurRepository.save(skieur);
    }

    @Override
    public Skieur ajouterInscriptions(List<Inscription> inscriptions, Skieur skieur) {
        List<Inscription> listInscription=inscriptionRepository.saveAll(inscriptions);
        Skieur s=skieurRepository.save(skieur);
        s.getInscriptions().addAll(listInscription);

        return skieurRepository.save(s) ;
    }
}
