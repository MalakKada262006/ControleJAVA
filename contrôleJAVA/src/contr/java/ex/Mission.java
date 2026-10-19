package contr.java.ex;

public class Mission {
	private int nbJours;
	private Employe employe;
	private Projet projet;

	public Mission(Employe employe, Projet projet, int nbJours) {
		this.employe = employe;
		this.projet = projet;
		this.nbJours = nbJours;
	}

	public double calculerMontant() {
		return this.employe.calculerCout(this.nbJours);
	}

	public void afficherRecapitulatif() {
		System.out.println("--- Récapitulatif de la Mission ---");

		if (this.employe != null) {
			this.employe.afficherDetails();
		}

		if (this.projet != null) {
			System.out.println("Projet : " + this.projet.toString());
		}

		System.out.println("Durée de la mission : " + this.nbJours + " jours");
		System.out.println("Montant calculé : " + this.calculerMontant());
	}
}
