package tn.esprit.spring.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.domain.Employe;
import tn.esprit.spring.service.iEmployeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/EmployeController")
public class EmployeController  {
    iEmployeService employeeService;

    public Employe creer(Employe employe) {
        return employeeService.creer(employe);
    }

    public Employe obtenirParId(Long id) {
        return employeeService.obtenirParId(id);
    }

    @GetMapping("/getAll")
    public List<Employe> listerTous() {
        return employeeService.listerTous();
    }

    public Employe mettreAJour(Employe employe) {
        return employeeService.mettreAJour(employe);
    }

    public void supprimer(Long id) {
        employeeService.supprimer(id);
    }
}
