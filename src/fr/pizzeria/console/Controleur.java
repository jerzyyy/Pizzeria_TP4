package fr.pizzeria.console;

import java.util.List;
import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.dao.PizzaJDBCDao;
import fr.pizzeria.dao.PizzaMemDao;
import fr.pizzeria.model.Pizza;



public class Controleur {

	public int printer(Scanner questionUser) {
		int choix;
		System.out.println("***** Pizzeria Administration *****");
		System.out.println("1. Lister les pizzas");
		System.out.println("2. Ajouter une nouvelle pizza ");
		System.out.println("3. Mettre à jour une pizza");
		System.out.println("4. Supprimer une pizza");
		System.out.println("99. Sortir");
		choix = questionUser.nextInt();// renvoie la valeur du choix de l'utilisateur
		return choix;
		
	}
	
	
	public static void main(String[] args) {
		/*Pizza[] tableau1;
		tableau1 = new Pizza[8];
		
		tableau1[0]=new Pizza(0,"PEP","Pépéroni",12.50);
		tableau1[1]=new Pizza(1,"MAR","Margherita",14.50);
		tableau1[2]=new Pizza(2,"REIN","La Reine",11.50);
		tableau1[3]=new Pizza(3,"FRO","La 4 fromages",12.00);
		tableau1[4]= new Pizza(4,"CAN","La cannibale",12.50);
		tableau1[5]=new Pizza(5,"SAV","La savoyarde",13.00);
		tableau1[6]=new Pizza(6,"ORI","L’orientale",13.50);
		tableau1[7]=new Pizza(7,"IND","L’indienne",14.00);*/
		
		//PizzaMemDao p = new PizzaMemDao(tableau1);
		
		//PizzaMemDao p = new PizzaMemDao();
		//List<Pizza> listePizza =p.findAllPizzas();
		IPizzaDao dao = new PizzaJDBCDao();
		Scanner s = new Scanner(System.in);
		
		
		ListerPizzasService list = new ListerPizzasService();
		AjouterPizzaService add = new AjouterPizzaService();
		
		
		
		Controleur dac = new Controleur();//On fait une instance de la classe PizzeriaAdminConsoleApp
		Scanner questionUser = new Scanner(System.in);//On fait une instance de scanner importé plus haut
		int reponse = dac.printer(questionUser);
		
		while(reponse != 99) {
			
		
			if(reponse== 1) {
				
				list.executeUC(dao, questionUser);
				//int i;
				//for( i=0; i<listePizza.size();i++) {
				//	System.out.println(listePizza.get(i).libelle + " " + listePizza.get(i).code + " " + listePizza.get(i).prix);
				//}
				
				 reponse = dac.printer(questionUser);	
			}else if(reponse==2) {
				/*System.out.println("Ajout d’une nouvelle pizza");
				
				System.out.println("Veuillez saisir le code: ");
				String code= questionUser.next();
				 
				
				 System.out.println("Veuillez saisir le nom (sans espace): ");
				 String libelle = questionUser.next();
				
				 System.out.println("Veuillez saisir le prix: ");
				 double prix = questionUser.nextDouble();*/
				 
				 //listePizza.add(new Pizza(code,libelle,prix));
				 add.executeUC(dao, questionUser);
				 reponse = dac.printer(questionUser);
				 
			}
				 /*tableau2=new Pizza[tableau1.length+1];//On crée un nouveau tableau appelé tableau2 et pour obtenir sa taille on se base sur la taille de tableau et on l'incremente de 1
				 int i;
				 for(i=0;i<tableau1.length;i++) {//On boucle sur tableau1 de façon à ce que les valeurs à index equivalents de tableau1 deviennent celles de tableau2
					 tableau2[i]=tableau1[i];
				 }
				
				 tableau2[tableau2.length-1]=new Pizza(tableau2.length-1,code,libelle,prix);//On rajoute la nouvelle pizza 
				 
				 int j;
					for(j=0;j<tableau2.length;j++) {
						System.out.println(	tableau2[j].code +" "+ tableau2[j].libelle + " " + tableau2[j].prix );		
						}
				 tableau1= tableau2;//tableau1 devient tableau 2 
				 reponse = dac.printer(questionUser);
				
			}*/else if(reponse==3) {
				System.out.println("Mise à jour d’une pizza");
				/*int i;
				for(i=0;i<tableau1.length;i++) {
					System.out.println(	tableau1[i].code +" "+ tableau1[i].libelle + " " + tableau1[i].prix );		
				}//Boucle pour aller checker toutes les pizzas*/
				System.out.println("Veuillez choisir le code de la pizza à modifier.");
				String codePizza= questionUser.next();//Selection du code de la pizza
				System.out.println("Veuillez saisir le nouveau code");
				String updateCodePizza= questionUser.next();//Mise à jour du nom de la pizza
				System.out.println("Veuillez saisir le nouveau nom (sans espace)");
				String updateNamePizza= questionUser.next();//Mise à jour du nom de la pizza
				System.out.println("Veuillez saisir le nouveau prix");
				double updatePricePizza= questionUser.nextDouble();//Mise a jour du prix de la pizza
				//Boucle qui va checker les pizza puis qui va les modifier
				int i;
				/*for(i=0; i<listePizza.size(); i++) {
					if(listePizza.get(i).code.compareTo(codePizza)==0){
						listePizza.set(i, new Pizza(updateCodePizza,updateNamePizza,updatePricePizza));	
					}
				}*/
				reponse = dac.printer(questionUser);
				/*for(i=0;i<tableau1.length;i++) {
					if(tableau1[i].code.compareTo(codePizza)==0) { //tableau[i].equalsIgnoreCase(codePizza)
						
						tableau1[i].code= updateCodePizza;
						tableau1[i].libelle=updateNamePizza;
						tableau1[i].prix= updatePricePizza;
		
					}
					System.out.println(	tableau1[i].code +" "+ tableau1[i].libelle + " " + tableau1[i].prix );		
				}*/				
			}else if(reponse==4) {
				System.out.println("suppression d’une pizza");
				System.out.println("Veuillez choisir le code de la pizza à supprimer:");
				String removeCodePizza= questionUser.next();
				int i;
				/*for(i=0; i<listePizza.size(); i++) {
					if(listePizza.get(i).code.compareTo(removeCodePizza)==0){
						listePizza.remove(i);	
					}
				}*/
				 reponse = dac.printer(questionUser);
			} else {
				reponse = defaultfunctionnement(dac, questionUser);
			}
		}
		System.out.println("Aurevoir☹");
	}
	
	public static Integer defaultfunctionnement(Controleur dac, Scanner questionUser) {
		System.out.println("mauvaise saisie");
		return dac.printer(questionUser);
	}

}
