package tn.esprit.spring.tp_spring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.tp_spring.Entities.Cours;

public interface CoursRepository extends JpaRepository<Cours, Long> {
}
