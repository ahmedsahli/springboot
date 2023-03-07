package tn.esprit.spring.tp_spring.Controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.tp_spring.Entities.Moniteur;
import tn.esprit.spring.tp_spring.Services.IMoniteurService;
import tn.esprit.spring.tp_spring.Services.MoniteurService;

import java.awt.*;
import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/moniteur")
public class MoniteurController {

    MoniteurService moniteurService;

    // http://localhost:8089/stationSki/moniteur/remove-moniteur/1
    @DeleteMapping("/remove-moniteur/{moniteur-id}")
    public void removeMoniteur(@PathVariable("moniteur-id") Integer moniteurId) {

        moniteurService.deleteMoniteur(moniteurId);
    }

    // http://localhost:8089/stationSki/moniteur/update-moniteur
    @PutMapping("/update-moniteur")
    public Moniteur updateMoniteur(@RequestBody Moniteur m) {
        Moniteur moniteur= moniteurService.updateMoniteur(m);
        return moniteur;
    }

    // http://localhost:8089/stationSki/moniteur/retrieve-all-moniteurs
    @GetMapping(value = "/retrieve-all-moniteurs")
    public List<Moniteur> getMoniteurs() {
        return moniteurService.retrieveAllMoniteurs();
    }
    // http://localhost:8089/stationSki/moniteur/retrieve-moniteur/8
    @GetMapping("/retrieve-moniteur/{moniteur-id}")
    public Moniteur retrieveMoniteur(@PathVariable("moniteur-id") Integer moniteurId) {
        return moniteurService.retrieveMoniteur(moniteurId);
    }

    // http://localhost:8089/stationSki/moniteur/add-moniteur
    @PostMapping("/add-moniteur")
    public Moniteur addMoniteur(@RequestBody Moniteur m) {
        Moniteur moniteur = moniteurService.addMoniteur(m);
        return moniteur;
    }
}

