package tn.esprit.spring.tp_spring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import tn.esprit.spring.tp_spring.Entities.Moniteur;

public interface MoniteurRepository extends JpaRepository<Moniteur, Long> {

}
