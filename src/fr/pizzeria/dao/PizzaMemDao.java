package fr.pizzeria.dao;

import java.util.ArrayList;
import java.util.List;

import fr.pizzeria.model.Pizza;

public class PizzaMemDao implements IPizzaDao {

	ArrayList<Pizza> listPizza = new ArrayList<Pizza>();
	

	@Override
	public void saveNewPizza(Pizza pizza) {
		// TODO Auto-generated method stub
		
		
		
	}



	@Override
	public void deletePizza(String codePizza) {
		// TODO Auto-generated method stub
Pizza pizzaByCode ;
		
		for(int i=0; i<listPizza.size(); i++) {
			pizzaByCode = (Pizza) listPizza.get(i);
		
			if(listPizza.get(i).code.compareTo(codePizza)==0){
				listPizza.remove(listPizza.get(i));	
			}
		
		}
		
	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public boolean pizzaExists(String codePizza) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public List<Pizza> findAllPizzas() {
		// TODO Auto-generated method stub
		listPizza.add(new Pizza(0,"PEP","Pépéroni",12.50));
		listPizza.add(new Pizza(1,"MAR","Marguerita",14.50));
		listPizza.add(new Pizza(2,"REIN","Marguerita",14.50));
		listPizza.add(new Pizza(3,"FRO","La 4 fromages",12.00));
		listPizza.add(new Pizza(4,"CAN","La cannibale",12.50));
		listPizza.add(new Pizza(5,"SAV","La savoyarde",13.00));
		listPizza.add(new Pizza(6,"ORI","L’orientale",13.50));
		listPizza.add(new Pizza(7,"IND","L’indienne",14.00));
		return listPizza;
	}



	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		// TODO Auto-generated method stub
		
		Pizza pizzaByCode ;
		
		for(int i=0; i<listPizza.size(); i++) {
			pizzaByCode = (Pizza) listPizza.get(i);
		
			if(listPizza.get(i).code.compareTo(codePizza)==0){
				listPizza.remove(listPizza.get(i));	
			}
		
		}
		listPizza.add(pizza);

	}
}
