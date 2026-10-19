package contr.java.ex;

public class Main {
    public static void main(String[] args) {
        Ingenieur ing1 = new Ingenieur("ING01", "Aymane", 500.0, 4);
        Ingenieur ing2 = new Ingenieur("ING02", "Sarah", 350.0, 2);
        Comercial com1 = new Comercial("COM01", "Omar", 300.0, 0.10);
        Comercial com2 = new Comercial("COM02", "Lina", 400.0, 0.15);

        Employe[] employes = new Employe[] { ing1, ing2, com1, com2 };

        Projet prj1 = new Projet("PRJ01", "Développement Web");
        Projet prj2 = new Projet("PRJ02", "Migration ERP");

        ing2.setSuperieur(ing1); 
        com1.setSuperieur(ing1); 
        com2.setSuperieur(com1); 

        System.out.println("=== LISTE DES EMPLOYÉS ===");
        for (Employe emp : employes) {
            emp.afficherDetails();
        }

        Mission[] missions = new Mission[] {
            new Mission(ing1, prj1, 3),
            new Mission(ing2, prj2, 2),
            new Mission(com1, prj1, 4),
            new Mission(com2, prj2, 2)
        };

        System.out.println("\n=== RÉCAPITULATIF DES MISSIONS ===");
        double montantTotal = 0.0;
        for (Mission m : missions) {
            m.afficherRecapitulatif();
            // 9. Calcul du montant total
            montantTotal += m.calculerMontant();
        }

        System.out.println("MONTANT TOTAL DE TOUTES LES MISSIONS : " + montantTotal + " DH");

        int nbSupervises = 0;
        for (Employe emp : employes) {
            if (emp.getSuperieur() == ing1) {
                nbSupervises++;
            }
        }
		System.out.println(
				"\nNombre d'employés directement supervisés par " + ing1.getMatricule() + " : " + nbSupervises);
	}
}
