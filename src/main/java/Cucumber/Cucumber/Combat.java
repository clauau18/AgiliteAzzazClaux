package Cucumber.Cucumber;

public class Combat {
	private Personnage personnage1;
	private Personnage personnage2;

	public Combat(Personnage p1, Personnage p2) throws Exception {
		if (p1.getNom() == p2.getNom())
			throw new Exception("Un personnage ne peut pas se combattre lui-mï¿½me !");
		this.personnage1 = p1;
		this.personnage2 = p2;
	}

	public boolean estCombatFini() {
		boolean estCombatTermine;
		if (this.personnage1.getPointDeVie() <= 0 || this.personnage2.getPointDeVie() <= 0) {
			estCombatTermine = ecrireFinDeCombat();
			
		} else {
			estCombatTermine = false;
		}

		return estCombatTermine;
	}

	public boolean equals(Object object) {

		if (object instanceof Combat) {
			Combat b1 = (Combat) object;
			return this.personnage1.getNom() == b1.personnage1.getNom()
					&& this.personnage2.getNom() == b1.personnage2.getNom()
					|| this.personnage1.getNom() == b1.personnage2.getNom()
							&& this.personnage1.getNom() == b1.personnage2.getNom();
		}
		return false;

	}

	private Boolean ecrireFinDeCombat() {
		return true;
	}
}
