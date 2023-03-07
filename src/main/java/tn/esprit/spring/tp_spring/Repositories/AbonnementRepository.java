package tn.esprit.spring.tp_spring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.tp_spring.Entities.Abonnement;

public interface AbonnementRepository extends JpaRepository<Abonnement, Long> {
}
