package Cucumber.Cucumber;

public class Arme {
	 // variables d'instance - remplacez l'exemple qui suit par le vï¿½tre
    private String type;
    private int degats;

    /**
     * Constructeur d'objets de classe Arme
     */
    public Arme(String type, int degats)
    {
        // initialisation des variables d'instance
        this.type = type;
        this.degats = degats;
    }
    
    public int getDegats()
    {
        return this.degats;
    }

	public void setDegats(int degats) {
		this.degats = degats;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void ameliorer(int k) {
		this.degats += k;
	}
    
    
}
