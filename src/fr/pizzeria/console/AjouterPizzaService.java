package fr.pizzeria.console;

import java.util.List;
import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.dao.PizzaMemDao;
import fr.pizzeria.model.Pizza;

public class AjouterPizzaService extends MenuService {
	
	ListerPizzasService p = new ListerPizzasService();
;
	
	

	@Override
	public void executeUC(IPizzaDao p, Scanner s) {
		// TODO Auto-generated method stub
		
		;
		
		
		System.out.println("Ajout d’une nouvelle pizza");
		
		System.out.println("Veuillez saisir le code: ");
		String code= s.next();
		 
		
		 System.out.println("Veuillez saisir le nom (sans espace): ");
		 String libelle = s.next();
		
		 System.out.println("Veuillez saisir le prix: ");
		 double prix = s.nextDouble();
		p.findAllPizzas().add(new Pizza(code,libelle,prix));
	}



	
	

}
