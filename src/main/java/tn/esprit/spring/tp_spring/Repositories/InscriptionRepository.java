package tn.esprit.spring.tp_spring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.tp_spring.Entities.Inscription;

public interface InscriptionRepository extends JpaRepository<Inscription, Long> {
}
