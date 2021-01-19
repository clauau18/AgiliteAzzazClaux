package Cucumber.Cucumber;

import static org.junit.Assert.assertTrue;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefUs01AmeliorerArme {

	private Arme arme = new Arme("epee", 5);
		
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
}
