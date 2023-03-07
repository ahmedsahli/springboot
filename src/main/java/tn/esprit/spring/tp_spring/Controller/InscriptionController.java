package tn.esprit.spring.tp_spring.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.tp_spring.Entities.Inscription;
import tn.esprit.spring.tp_spring.Services.IInscriptionService;

import java.util.List;

@RestController
@AllArgsConstructor
public class InscriptionController {
    IInscriptionService inscriptionService;


}
