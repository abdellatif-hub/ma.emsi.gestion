package ma.emsi.gestion;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TP2Main {


    public static boolean noteAdmise(double note) {
        return note >= 10;
    }

    public static boolean verifier(Etudiant e, RegleAdmission regle) {
        return regle.valider(e);
    }

    public static void main(String[] args) {
        final Etudiant youssef = new Etudiant(2, "Youssef", 9);
        System.out.println("Note initiale : " + youssef.getNote());
        youssef.setNote(11);
        System.out.println("Note modifiee : " + youssef.getNote());
        System.out.println("noteadmise(9) : " + noteAdmise(9));
        youssef.setNote(9);
        Etudiant amina = new Etudiant(1, "Amina", 15);
        Etudiant sara = new Etudiant(3, "Sara", 12.5);

        RegleAdmission seuil10Anonyme = new RegleAdmission() {
            @Override
            public boolean valider(Etudiant e) {
                return e.getNote() >= 10;
            }
        };
        RegleAdmission seuil10Lambda = e -> e.getNote() >= 10;
        RegleAdmission seuil12 = e -> e.getNote() >= 12;

        System.out.println("Amina (15) : " + verifier(amina, seuil10Anonyme)
                + " au seuil 10 et " + verifier(amina, seuil12) + " au seuil 12");
        System.out.println("Youssef (9) : " + verifier(youssef, seuil10Lambda)
                + " au seuil 10 et " + verifier(youssef, seuil12) + " au seuil 12");

        Predicate<Etudiant> estAdmisSeuil10 = e -> e.getNote() >= 10;
        System.out.println("Amina : " + estAdmisSeuil10.test(amina));
        System.out.println("Youssef : " + estAdmisSeuil10.test(youssef));
        System.out.println("Sara : " + estAdmisSeuil10.test(sara));

        Function<Etudiant, String> statut = e ->
                e.getNote() >= 10 ? "Admis" : "Ajourne";
        System.out.println("Amina : " + statut.apply(amina));
        System.out.println("Youssef : " + statut.apply(youssef));
        System.out.println("Sara : " + statut.apply(sara));

        Consumer<Etudiant> afficherEtudiant = e ->
                System.out.println(e.getNom() + " : " + e.getNote());
        afficherEtudiant.accept(amina);
        afficherEtudiant.accept(youssef);
        afficherEtudiant.accept(sara);

        Supplier<Etudiant> fournisseurOmar = () -> new Etudiant(4, "Omar", 14);
        Etudiant omar = fournisseurOmar.get();
        System.out.println(omar.getNom() + " : " + omar.getNote());
    }
}
