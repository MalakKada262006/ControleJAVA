package contr.java.ex;

public class Comercial extends Employe {
    private double tauxPrime;

    public Comercial(String matricule, String nom, double tarifJournalier, double tauxPrime) {
        super(matricule, nom, tarifJournalier);
        this.tauxPrime = tauxPrime;
    }

    @Override
    public double calculerCout(int nbJours) {
        double montantBase = tarifJournalier * nbJours;
        return montantBase + (montantBase * tauxPrime);
    }
}
