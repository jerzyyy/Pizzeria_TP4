package fr.pizzeria.console;

import java.util.List;
import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.dao.PizzaMemDao;
import fr.pizzeria.model.Pizza;

public class ListerPizzasService extends MenuService {
	
	@Override
	public void executeUC(IPizzaDao p, Scanner s) {
		// TODO Auto-generated method stub
		List<Pizza> listePizza =p.findAllPizzas();
		
		
	}

}
