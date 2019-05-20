package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.dao.PizzaMemDao;

public abstract class MenuService {
	public abstract void executeUC(IPizzaDao p, Scanner s);

}
