package contr.java.ex;

public class Ingenieur extends Employe {
	private int niveauExpertise;

	public Ingenieur(String matricule, String nom, double tarifJournalier, int niveauExpertise) {
		super(matricule, nom, tarifJournalier);
		this.niveauExpertise = niveauExpertise;
	}

	@Override
	public double calculerCout(int nbJours) {
		double montantBase = tarifJournalier * nbJours;

		if (this.niveauExpertise >= 3) {
			return montantBase + (100.0 * nbJours);
		} else {
			return montantBase;
		}
	}
}