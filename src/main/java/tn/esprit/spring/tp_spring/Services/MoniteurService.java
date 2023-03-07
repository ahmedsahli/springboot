package tn.esprit.spring.tp_spring.Services;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.tp_spring.Entities.Moniteur;
import tn.esprit.spring.tp_spring.Repositories.MoniteurRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class MoniteurService  implements IMoniteurService {

    MoniteurRepository MoniteurRepository;

    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return(List<Moniteur>) MoniteurRepository.findAll();
    }

    @Override
    public Moniteur addMoniteur(Moniteur e) {
        MoniteurRepository.save(e);
        return e;
    }

    @Override
    public Moniteur updateMoniteur(Moniteur e) {
        MoniteurRepository.save(e);
        return e;
    }

    @Override
    public Moniteur retrieveMoniteur(long idMoniteur) {
        return MoniteurRepository.findById(idMoniteur).get();
    }

    @Override
    public void deleteMoniteur(long idMoniteur) {
        MoniteurRepository.deleteById(idMoniteur);

    }
}
