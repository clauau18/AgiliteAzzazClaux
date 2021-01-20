package Cucumber.Cucumber;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonnageTest
{
    private Personnage Link;
    private Personnage Ganon;


    @Before
    public void setUp() // throws java.lang.Exception
    {
        Link = new Personnage("Link", "epee", 10);
        Ganon = new Personnage("Ganon");
    }

    @Test
    public void soignerTest()
    {
        Personnage Link = new Personnage("Link");
        Link.soigner(10);
        assertEquals(110, Link.getPointDeVie());
    }

    @Test
    public void combattreTest()
    {
        Link.combattre(Ganon);
        assertEquals(90, Ganon.getPointDeVie());
    }
    
    
}

