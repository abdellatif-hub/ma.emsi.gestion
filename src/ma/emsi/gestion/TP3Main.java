package ma.emsi.gestion;

import java.util.List;

public class TP3Main {

    public static void main(String[] args) {
        List<Etudiant> etudiants = List.of(
                new Etudiant(1, "Amina", 15.0),
                new Etudiant(2, "Youssef", 9.0),
                new Etudiant(3, "Sara", 12.5),
                new Etudiant(4, "Omar", 14.0),
                new Etudiant(5, "Lina", 18.0),
                new Etudiant(6, "Karim", 7.5)
        );
        RegleAdmission regle = etudiant -> etudiant.getNote() >= 10;

        System.out.println("=== ÉTAPE 1 ===");
        AnalyseEtudiants.afficherAdmis(etudiants, regle);

        System.out.println("=== ÉTAPE 2 ===");
        AnalyseEtudiants.afficherTransformations(etudiants, regle);

        System.out.println("=== ÉTAPE 3 ===");
        List<Etudiant> top3 = AnalyseEtudiants.afficherClassements(etudiants);

        System.out.println("=== ÉTAPE 4 ===");
        AnalyseEtudiants.afficherStatistiques(etudiants);

        System.out.println("=== ÉTAPE 5 ===");
        AnalyseEtudiants.afficherGroupesEtBilan(etudiants, regle, top3);

        System.out.println("=== DÉFI A ===");
        AnalyseEtudiants.afficherDefiSomme(etudiants);

        System.out.println("=== DÉFI B ===");
        AnalyseEtudiants.afficherDefiFusion(etudiants);
    }
}
