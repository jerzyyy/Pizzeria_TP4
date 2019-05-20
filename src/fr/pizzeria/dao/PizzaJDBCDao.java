package fr.pizzeria.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import fr.pizzeria.model.Pizza;

public class PizzaJDBCDao implements IPizzaDao {

		
		public  PizzaJDBCDao(){
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
			}catch(Exception e) {
				e.printStackTrace();	
			}
		}
		
	ArrayList<Pizza> listPizza = new ArrayList<Pizza>();
	@Override
	public List<Pizza> findAllPizzas() {
		String url = "jdbc:mysql://localhost:3306/pizza";
		String user = "root";
		String password = "";
		try {
			
			Connection conn = DriverManager.getConnection(url,user,password);
	
			Statement statement = conn.createStatement();
			ResultSet resultats = statement.executeQuery("SELECT * FROM pizzadb");
			while(resultats.next()) {
			String code = resultats.getString("pizzadb_id");
			String libelle = resultats.getString("pizzadb_libelle");
			double prix = resultats.getDouble("pizzadb_price");
			this.listPizza.add(new Pizza(code,libelle,prix));
			}
			resultats.close();
			int i;
			for( i=0; i<listPizza.size();i++) {
				System.out.println(listPizza.get(i).code + " " +listPizza.get(i).libelle  + " " + listPizza.get(i).prix);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
3		return listPizza ;
	}

	@Override
	public void saveNewPizza(Pizza pizza) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/pizza";
		String user = "root";
		String password = "";
		try {
			
			Connection conn = DriverManager.getConnection(url,user,password);
	
			Statement statement = conn.createStatement();
			PreparedStatement insertPizzaSt = conn.prepareStatement("INSERT INTO pizza.pizzadb VALUES (?
					WHERE ID=? AND PIZZA_NAME=?");
					updatePizzaSt.setInt(1,1);
					updatePizzaSt.setString(2, "Regina");
					updatePizzaSt.executeUpdate();
			int nbPizzasSuppr = statement.executeUpdate("INSERT INTO pizza.pizzadb ( pizzadb_libelle, pizzadb_price) values ('cannibale', 13.5)" );
			System.out.println(nbPizzasSuppr + " pizza ajouté");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePizza(String codePizza) {
		// TODO Auto-generated method stub
		
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
	

}
