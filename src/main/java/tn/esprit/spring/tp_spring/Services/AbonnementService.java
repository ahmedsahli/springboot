package tn.esprit.spring.tp_spring.Services;

import tn.esprit.spring.tp_spring.Entities.Abonnement;
import tn.esprit.spring.tp_spring.Repositories.AbonnementRepository;

public class AbonnementService implements IAbonnementService{
    AbonnementRepository abonnementRepository;
    @Override
    public Abonnement addAbonnement(Abonnement a) {
        return abonnementRepository.save(a);
    }
}
