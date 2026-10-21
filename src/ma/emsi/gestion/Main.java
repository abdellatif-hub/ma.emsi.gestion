
package ma.emsi.gestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    public static Etudiant rechercherParNom(
            List<Etudiant> etudiants, String nomRecherche) {

        if (nomRecherche == null) {
            return null;
        }

        String nom = nomRecherche.trim();

        for (Etudiant e : etudiants) {
            if (e.getNom().equalsIgnoreCase(nom)) {
                return e;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        System.out.println("Gestion des étudiants — EMSI");
        System.out.println("================================");

        List<Etudiant> etudiants = new ArrayList<>();

        etudiants.add(new Etudiant(1, "Amina", 15));
        etudiants.add(new Etudiant(2, "Youssef", 9));
        etudiants.add(new Etudiant(3, "Sara", 12.5));

        Personne personne = etudiants.get(0);
        System.out.println("\n--- Héritage et polymorphisme ---");
        System.out.println("Nom : " + personne.getNom());
        System.out.println("Rôle : " + personne.role());

        Evaluatable evaluatable = etudiants.get(0);
        System.out.println("\n--- Interface ---");
        System.out.println("Amina est admise : "
                + evaluatable.estAdmis());

        System.out.println("\n--- Liste des étudiants ---");

        double somme = 0;

        for (Etudiant e : etudiants) {
            System.out.println(
                    e.getNom() + " : " + e.getNote() + "/20"
            );
            somme += e.getNote();
        }

        if (etudiants.isEmpty()) {
            System.out.println("Aucun étudiant dans la liste.");
        } else {
            double moyenne = somme / etudiants.size();
            System.out.printf("Moyenne : %.2f/20%n", moyenne);
        }

        System.out.println("\n--- Étudiants admis ---");

        for (Etudiant e : etudiants) {
            if (e.estAdmis()) {
                System.out.println(e.getNom());
            }
        }

        System.out.println("\n--- Recherche ---");

        Etudiant resultat = rechercherParNom(etudiants, " amina ");

        if (resultat != null) {
            System.out.println("Étudiant trouvé : "
                    + resultat.getNom());
        } else {
            System.out.println("Étudiant introuvable.");
        }

        System.out.println("\n--- Gestion des exceptions ---");

        try {
            Etudiant invalide = new Etudiant(4, "Test", -2);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        System.out.println("\n--- HashSet ---");

        Set<Etudiant> ensemble = new HashSet<>();

        ensemble.add(new Etudiant(1, "Amina", 15));
        ensemble.add(new Etudiant(1, "Amina bis", 18));

        System.out.println("Taille du HashSet : "
                + ensemble.size());

        System.out.println("\n--- Map ---");

        Map<Integer, Etudiant> dictionnaire = new HashMap<>();

        for (Etudiant e : etudiants) {
            dictionnaire.put(e.getId(), e);
        }

        Etudiant etudiant2 = dictionnaire.get(2);

        if (etudiant2 != null) {
            System.out.println("Étudiant ID 2 : "
                    + etudiant2.getNom());
        }

        System.out.println("\n--- Tri par ID ---");

        List<Etudiant> triParId = new ArrayList<>(etudiants);
        Collections.sort(triParId);

        for (Etudiant e : triParId) {
            System.out.println(e.getNom() + " - ID " + e.getId());
        }

        System.out.println("\n--- Tri par note croissante ---");

        List<Etudiant> triParNote = new ArrayList<>(etudiants);

        Collections.sort(triParNote,
                new Comparator<Etudiant>() {
                    @Override
                    public int compare(Etudiant e1, Etudiant e2) {
                        return Double.compare(
                                e1.getNote(), e2.getNote()
                        );
                    }
                }
        );

        for (Etudiant e : triParNote) {
            System.out.println(
                    e.getNom() + " - " + e.getNote() + "/20"
            );
        }

        System.out.println("\n--- Bonus : conversion ---");

        String texte = "abc";

        try {
            int id = Integer.parseInt(texte);
            System.out.println("Identifiant : " + id);
        } catch (NumberFormatException e) {
            System.out.println(
                    "Erreur : l'identifiant doit être un entier."
            );
        }

        System.out.println("\nFin du programme.");
    }
}
