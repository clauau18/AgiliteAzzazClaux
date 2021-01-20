package Cucumber.Cucumber;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CombatTest {
	private Personnage Link;
	private Personnage Ganon;
	private Combat combat;
	private Combat combat2;

	@Before
	public void setUp() throws Exception {
		Link = new Personnage("link","epee",101);
		Ganon = new Personnage("Ganon");
		combat = new Combat(Link,Ganon);
		combat2 = new Combat(Ganon, Link);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void estCombatFiniTest() {
		Link.combattre(Ganon);
		assertTrue(combat.estCombatFini());
		
	}
	
	@Test
	public void testEquals() throws Exception {
		assertFalse(combat2.equals(null));
		assertTrue(combat2.equals(combat));
		assertFalse(combat2.equals(new Combat(new Personnage("Bowser"),new Personnage("Peach"))));	
	}

}