package Cucumber.Cucumber;

import static org.junit.Assert.assertTrue;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefUs02ChangerArme {
	private Personnage link = new Personnage("link", "epee", 10);
	
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
	

}
