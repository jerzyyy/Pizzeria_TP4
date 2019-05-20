package fr.pizzeria.console;

import java.util.List;
import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.dao.PizzaMemDao;
import fr.pizzeria.model.Pizza;

public class ModifierPizzaService extends MenuService {

	//List<Pizza> listePizza =findAllPizzas();
	Scanner questionUser = new Scanner(System.in);
	@Override
	public void executeUC(IPizzaDao p, Scanner s) {
		System.out.println("Veuillez choisir le code de la pizza à modifier.");
		String codePizza= questionUser.next();//Selection du code de la pizza
		System.out.println("Veuillez saisir le nouveau code");
		String updateCodePizza= questionUser.next();//Mise à jour du nom de la pizza
		System.out.println("Veuillez saisir le nouveau nom (sans espace)");
		String updateNamePizza= questionUser.next();//Mise à jour du nom de la pizza
		System.out.println("Veuillez saisir le nouveau prix");
		double updatePricePizza= questionUser.nextDouble();//Mise a jour du prix de la pizza
		
		Pizza newPizza = new Pizza(updateCodePizza , updateNamePizza , updatePricePizza) ;
		
		p.updatePizza(codePizza, newPizza);
		
		//reponse = dac.printer(questionUser);
		// TODO Auto-generated method stub
		
	}

}
