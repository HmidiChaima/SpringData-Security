package tn.enig.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tn.enig.dao.IDepartement;
import tn.enig.dao.IMateriel;
import tn.enig.model.Departement;
import tn.enig.model.Materiel;

@Controller
public class AppController {
@Autowired
IMateriel matRep;
@Autowired
IDepartement depRep;

@GetMapping("/departement")
public String getDeps(Model model) {
List<Departement> deps = depRep.findAll();
model.addAttribute("deps", deps);
return "departement";
}

@GetMapping("/matieres/{id}")
public String getMatByDep(Model model, @PathVariable("id") int num) {
List<Materiel> mat = matRep.getMatByIdDepartement(num);
Optional<Departement> d = depRep.findById(num);
System.out.println(d);
model.addAttribute("d", d.get());
model.addAttribute("mat", mat);
return "ListeMaterielsDepartement";
}

@RequestMapping(value = "/addMat", method = RequestMethod.GET)
public String addMateriel(Model model) {
List<Departement> ld = depRep.findAll();
model.addAttribute("ld", ld);
model.addAttribute("m", new Materiel());
return "AjouterMateriel";
}

@RequestMapping(value = "/addMat1", method = RequestMethod.POST)
public String addEnseign(@ModelAttribute("m") Materiel m) {
matRep.save(m);
return "redirect:/matieres/" + m.getDep().getId();
}
@RequestMapping(value = "/delMat/{id}/{iddep}", method = RequestMethod.GET)
public String DeleteMateriel(@PathVariable("id") Integer id, @PathVariable("iddep") Integer iddep) {
matRep.deleteById(id);
return "redirect:/matieres/" + iddep;
}

}	


