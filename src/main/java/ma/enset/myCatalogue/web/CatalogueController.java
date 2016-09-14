package ma.enset.myCatalogue.web;



import javax.validation.Valid;
import ma.enset.myCatalogue.dao.Produit;
import ma.enset.myCatalogue.metier.ICatalogueMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//controlleur.....zzzzdd222ccc
@Controller
public class CatalogueController {
	@Autowired
	private ICatalogueMetier metier;
	@RequestMapping("/index")
	public String index(Model model){
	model.addAttribute("produit",new Produit());
	model.addAttribute("produits", metier.getAllProduits());
	return "produits";
	}
	@RequestMapping("/saveProduit")
	public String save(@Valid Produit p,BindingResult bindingResult,Model
	model){
	if(bindingResult.hasErrors()){
	model.addAttribute("produits", metier.getAllProduits());
	return "produits";
	}
	metier.addProduit(p);
	model.addAttribute("produit",new Produit());
	model.addAttribute("produits", metier.getAllProduits());
	return "produits";
	}
	@RequestMapping("/deleteProduit")
	public String delete(@RequestParam String ref,Model model){
	metier.deleteProduit(ref);
	model.addAttribute("produit",new Produit());
	model.addAttribute("produits", metier.getAllProduits());
	return "produits";
	}
	@RequestMapping("/editProduit")
	public String edit(@RequestParam String ref,Model model){
	model.addAttribute("produit",metier.getProduit(ref));
	model.addAttribute("produits", metier.getAllProduits());
	return "produits";
	}
}
