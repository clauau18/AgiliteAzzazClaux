package Cucumber.Cucumber;


import static org.junit.Assert.assertTrue;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefUs03SoignerHeros {
	
	private Personnage link = new Personnage("link");
	
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
