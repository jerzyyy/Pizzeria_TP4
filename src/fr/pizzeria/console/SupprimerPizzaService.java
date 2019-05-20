package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.dao.PizzaMemDao;

public class SupprimerPizzaService extends MenuService{


	Scanner questionUser = new Scanner(System.in);
	@Override
	public void executeUC(IPizzaDao p, Scanner s) {
		
		// TODO Auto-generated method stub
		System.out.println("suppression d’une pizza");
		System.out.println("Veuillez choisir le code de la pizza à supprimer:");
		String removeCodePizza= questionUser.next();
		p.deletePizza(removeCodePizza);
	}
	

}
