package Cucumber.Cucumber;

public class Personnage {
	  // variables d'instance - remplacez l'exemple qui suit par le vï¿½tre
    private String nom;
    private int pointDeVie;
    private Arme arme;
    
    
    

    /**
     * Constructeur d'objets de classe Personnage
     */
    public Personnage(String nom)
    {
        // initialisation des variables d'instance
        this.pointDeVie = 100;
        this.nom = nom;
        this.arme = new Arme("poing", 1);
        
        
    }
    
     public Personnage(String nom, String typeArme, int degats )
    {
        // initialisation des variables d'instance
        this.pointDeVie = 100;
        this.nom = nom;
        this.arme = new Arme(typeArme, degats);
        
        
    }
     
     public void soigner(int pdv)
     {
         this.pointDeVie += pdv;
     }
     
     public void subir(int pdv)
     {
         this.pointDeVie -= pdv;
     }
     
     public void combattre(Personnage personnage)
     {
         personnage.subir(this.arme.getDegats());
     }
    
     public Arme getArme()
     {
         return this.arme;
     }
     
     public void setArme(String arme, int degats)
     {
         this.arme.setDegats(degats);
         this.arme.setType(arme);
     }
     
     public void setArme(Arme arme)
     {
         this.arme = arme;
     }
     
     public void changerArme(String nouvelleArme, int degats)
     {
    	 this.setArme(nouvelleArme, degats);
     }
    
    public String getNom()
    {
        return this.nom;
    }
    
    public int getPointDeVie()
    {
        return this.pointDeVie;
    }
    
    public String toString()
    {
        return "je suis " + this.nom + ", j'ai "+ this.pointDeVie;
    }
    
    
}
