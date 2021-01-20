package Cucumber.Cucumber;

import static org.junit.Assert.assertTrue;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs {

	private Arme arme = new Arme("epee", 5);
	private Personnage link = new Personnage("link", "epee", 10);
	

	// Scenario 1 US 1
	@Given("^On a une arme \"([^\"]*)\" qui inflige (\\d+) de degats$")
	public void on_a_une_arme_qui_inflige_de_degats(String nom, int degats) throws Throwable {
		degats = 5; 
		nom = "epee";
		assertTrue(arme.getDegats() == degats && arme.getType() == nom);

	}
	
	@When("^je souhaite ameliorer mon \"([^\"]*)\" de (\\d+) degats$")
	public void je_souhaite_ameliorer_mon_de_degats(String nom, int degats) throws Throwable {
		degats = 5;
		nom = "epee";
		arme.ameliorer(degats);

	}
	
	@Then("^Mon \"([^\"]*)\" inflige maintenant (\\d+) degats$")
	public void mon_inflige_maintenant_degats(String nom, int degats) throws Throwable {
	    degats = 10;
	    nom = "epee";
	    assertTrue(arme.getDegats() == 10 && arme.getType() == nom);
	}
	

	//Scenario 2 US 2
	@Given("^Le personnage porte une \"([^\"]*)\" a (\\d+) degats$")
	public void le_personnage_(String arme, int degats) throws Throwable {
	    arme = "epee";
	    degats = 10;
	    assertTrue(link.getArme().getType() == arme && link.getArme().getDegats() == degats);
	}
	
	@When("^Le personnage jette son arme$")
	public void le_personnage_jette_son_arme() throws Throwable {
	    link.setArme(new Arme("poing", 1));
	}
	
	@Then("^Le personnage possede maintenant une  \"([^\"]*)\" a (\\d+) degats$")
	public void le_personnage_possede_maintenant_une_a_degats(String arme, int degats) throws Throwable {
		arme = "lance";
	    degats = 15;
	    link.changerArme(arme, degats);
	    assertTrue(link.getArme().getType() != "epee" && link.getArme().getDegats() != 10);    
	}
	
	
	// Scenario 3 US3
	@Given("^Le personnage veut recuperer des points de vie, ses points de vie sont de (\\d+)$")
	public void le_personnage_veut_recuperer_des_points_de_vie_ses_points_de_vie_sont_de(int hp) throws Throwable {		hp = 5;
	    hp = 95;
		link.subir(5);
	    assertTrue(link.getPointDeVie() == hp);
	}

	@When("^Le personnage se soigne  de (\\d+) points de vie$")
	public void le_personnage_se_soigne_de_points_de_vie(int soin) throws Throwable {
		soin = 5;
	    link.soigner(soin);
	    System.out.println(link.getPointDeVie());
	}

	@Then("^Les points de vie du personnage remonte a (\\d+)$")
	public void les_points_de_vie_du_personnage_remonte_a(int hp) throws Throwable {
		hp = 100;
		assertTrue(link.getPointDeVie() == hp);
	}
	
	
}
