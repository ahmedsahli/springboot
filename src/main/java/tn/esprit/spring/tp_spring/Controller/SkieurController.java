package tn.esprit.spring.tp_spring.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.spring.tp_spring.Entities.Inscription;
import tn.esprit.spring.tp_spring.Entities.Skieur;
import tn.esprit.spring.tp_spring.Services.SkieurService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/skieur")
public class SkieurController {

        SkieurService skieurService;

    // http://localhost:8089/stationSki/skieur/add-skieur
    @PostMapping("/add-skieur")
    public Skieur addSkieur(@RequestBody Skieur s) {
              Skieur skieur = skieurService.addSkieur(s);
            return skieur;
    }
    @PostMapping("/add-inscriptions")
    public Skieur ajouterInscriptions(@RequestBody List<Inscription> inscriptions,@RequestBody Skieur skieur) {
        return skieurService.ajouterInscriptions(inscriptions,skieur);
    }
}
