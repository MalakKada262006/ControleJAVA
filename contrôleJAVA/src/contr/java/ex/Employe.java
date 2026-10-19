package contr.java.ex;

public abstract class Employe {
	protected String matricule;
	protected String nom;
	protected double tarifJournalier;

	private Employe superieur;

	public Employe(String matricule, String nom, double tarifJournalier) {
		this.matricule = matricule;
		this.nom = nom;
		this.tarifJournalier = tarifJournalier;
		this.superieur = null;
	}

	public abstract double calculerCout(int nbJours);

	public void setSuperieur(Employe superieur) {
		if (superieur == this) {
			System.out.println("Erreur : Un employé ne peut pas être son propre supérieur.");
		} else {
			this.superieur = superieur;
		}
	}

	public Employe getSuperieur() {
		return this.superieur;
	}

	public String getMatricule() {
		return this.matricule;
	}

	public String getNom() {
		return this.nom;
	}

	public double getTarifJournalier() {
		return this.tarifJournalier;
	}

	public void afficherDetails() {
		System.out.print("Employé [Matricule: " + matricule + ", Nom: " + nom + ", Tarif: " + tarifJournalier);
		if (superieur != null) {
			System.out.print(", Supérieur: " + superieur.getNom());
		} else {
			System.out.print(", Supérieur: Aucun");
		}
		System.out.println("]");
	}
}
