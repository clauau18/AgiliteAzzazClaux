package Cucumber.Cucumber;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonnageTest
{
    private Personnage Link;
    private Personnage Ganon;

    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).
 
  
    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
        Link = new Personnage("Link", "epee", 10);
        Ganon = new Personnage("Ganon");
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
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

