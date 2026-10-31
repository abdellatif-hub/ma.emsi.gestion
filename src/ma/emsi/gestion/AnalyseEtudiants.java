package ma.emsi.gestion;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AnalyseEtudiants {

    public record ResultatAnalyse(int id, String nom, double note, boolean admis) {
    }

    public static void afficherAdmis(List<Etudiant> etudiants, RegleAdmission regle) {
        // Étape 1 — filter() est intermédiaire et lazy ; forEach() est terminale et déclenche le traitement.
        // Sans opération terminale, le pipeline ne s'exécute pas.
        etudiants.stream()
                .filter(regle::valider)
                .forEach(AnalyseEtudiants::afficherEtudiant);
    }

    public static void afficherTransformations(List<Etudiant> etudiants,
                                               RegleAdmission regle) {
        // Étape 2 — avant map : Etudiant ; après map : ResultatAnalyse.
        // ResultatAnalyse est une copie immuable ; les objets Etudiant d'origine ne changent pas.
        Function<Etudiant, ResultatAnalyse> conversion = etudiant ->
                new ResultatAnalyse(
                        etudiant.getId(),
                        etudiant.getNom(),
                        etudiant.getNote(),
                        regle.valider(etudiant)
                );

        List<ResultatAnalyse> resultats = etudiants.stream()
                .filter(regle::valider)
                .map(conversion)
                .toList();
        resultats.forEach(System.out::println);

        List<String> nomsAdmis = etudiants.stream()
                .filter(regle::valider)
                .map(Etudiant::getNom)
                .toList();
        System.out.println("Noms des admis : " + nomsAdmis);
    }

    public static List<Etudiant> afficherClassements(List<Etudiant> etudiants) {
        // Étape 3 — sorted().limit(3) conserve le vrai top 3 ; limit(3).sorted()
        // ne ferait que trier les trois premiers éléments de la liste.
        // sorted() crée un parcours ordonné sans modifier la liste source.
        Comparator<Etudiant> ordreCroissant =
                Comparator.comparingDouble(Etudiant::getNote);
        Comparator<Etudiant> ordreDecroissant = ordreCroissant.reversed();

        System.out.println("Notes croissantes : " + etudiants.stream()
                .sorted(ordreCroissant)
                .map(AnalyseEtudiants::formaterEtudiant)
                .toList());
        System.out.println("Notes décroissantes : " + etudiants.stream()
                .sorted(ordreDecroissant)
                .map(AnalyseEtudiants::formaterEtudiant)
                .toList());

        List<Etudiant> top3 = etudiants.stream()
                .sorted(ordreDecroissant)
                .limit(3)
                .toList();
        String classementTop3 = IntStream.range(0, top3.size())
                .mapToObj(index -> (index + 1) + ". "
                        + formaterEtudiant(top3.get(index)))
                .collect(Collectors.joining(" | "));
        System.out.println("Top 3 : " + classementTop3);

        List<String> nomsTop3 = top3.stream()
                .map(Etudiant::getNom)
                .toList();
        System.out.println("Noms du top 3 : " + nomsTop3);
        return top3;
    }

    public static void afficherStatistiques(List<Etudiant> etudiants) {
        // Étape 4 — count() retourne un long ; max() et average() sont optionnels
        // car un flux peut être vide (Optional et OptionalDouble).
        long admis = etudiants.stream()
                .filter(Etudiant::estAdmis)
                .count();
        boolean noteAuMoins16 = etudiants.stream()
                .anyMatch(etudiant -> etudiant.getNote() >= 16);
        boolean notesValides = etudiants.stream()
                .allMatch(etudiant -> Double.isFinite(etudiant.getNote())
                        && etudiant.getNote() >= 0
                        && etudiant.getNote() <= 20);
        Optional<Etudiant> meilleur = etudiants.stream()
                .max(Comparator.comparingDouble(Etudiant::getNote));
        double moyenne = etudiants.stream()
                .mapToDouble(Etudiant::getNote)
                .average()
                .orElse(0.0);

        System.out.print("Admis : " + admis
                + " | Note >= 16 : " + noteAuMoins16
                + " | Notes valides : " + notesValides
                + " | ");
        meilleur.ifPresentOrElse(
                etudiant -> System.out.print("Meilleur : " + etudiant.getNom()
                        + " (" + etudiant.getNote() + ") | "),
                () -> System.out.print("Meilleur : aucun étudiant | ")
        );
        System.out.println("Moyenne : " + formaterMoyenne(moyenne));
    }

    public static void afficherGroupesEtBilan(List<Etudiant> etudiants,
                                              RegleAdmission regle,
                                              List<Etudiant> top3) {
        // Étape 5 — partitioningBy produit les deux clés true/false d'un prédicat.
        // groupingBy est plus général : sa Function classifier calcule une clé libre.
        Map<Boolean, List<Etudiant>> partition = etudiants.stream()
                .collect(Collectors.partitioningBy(regle::valider));
        Map<Boolean, List<String>> nomsParAdmission = partition.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entree -> entree.getValue().stream()
                                .map(Etudiant::getNom)
                                .toList()
                ));
        System.out.println("Admis : " + nomsParAdmission.get(true)
                + " | Ajournés : " + nomsParAdmission.get(false));

        Map<String, List<String>> groupesParNiveau = etudiants.stream()
                .collect(Collectors.groupingBy(
                        AnalyseEtudiants::determinerNiveau,
                        LinkedHashMap::new,
                        Collectors.mapping(Etudiant::getNom, Collectors.toList())
                ));
        Map<String, List<String>> groupes = List.of("Très bien", "Admis", "Ajourné")
                .stream()
                .collect(Collectors.toMap(
                        Function.identity(),
                        niveau -> groupesParNiveau.getOrDefault(niveau, List.of()),
                        (premier, ignore) -> premier,
                        LinkedHashMap::new
                ));
        groupes.entrySet().stream()
                .map(entree -> entree.getKey() + " : " + entree.getValue())
                .forEach(System.out::println);

        long total = etudiants.stream().count();
        long nombreAdmis = etudiants.stream()
                .filter(regle::valider)
                .count();
        double moyenne = etudiants.stream()
                .mapToDouble(Etudiant::getNote)
                .average()
                .orElse(0.0);
        Optional<Etudiant> meilleur = etudiants.stream()
                .max(Comparator.comparingDouble(Etudiant::getNote));
        String meilleurNom = meilleur.map(Etudiant::getNom).orElse("aucun étudiant");
        List<String> nomsTop3 = top3.stream().map(Etudiant::getNom).toList();

        System.out.println("Bilan final : total " + total
                + " | admis " + nombreAdmis
                + " | moyenne " + formaterMoyenne(moyenne)
                + " | meilleur " + meilleurNom
                + " | top 3 " + nomsTop3
                + " | groupes " + groupes);
    }

    public static void afficherDefiSomme(List<Etudiant> etudiants) {
        // Défi A — reduce() additionne le flux enveloppé ; sum() additionne les doubles primitifs.
        double sommeReduce = etudiants.stream()
                .map(Etudiant::getNote)
                .reduce(0.0, Double::sum);
        double sommePrimitive = etudiants.stream()
                .mapToDouble(Etudiant::getNote)
                .sum();
        System.out.println("Somme reduce : " + sommeReduce
                + " | Somme mapToDouble : " + sommePrimitive);
    }

    public static void afficherDefiFusion(List<Etudiant> etudiants) {
        // Défi B — flatMap() aplatit les deux flux de listes en un flux unique.
        List<Etudiant> premiereListe = etudiants.stream().limit(3).toList();
        List<Etudiant> secondeListe = etudiants.stream().skip(3).toList();
        List<Etudiant> fusion = java.util.stream.Stream.of(premiereListe, secondeListe)
                .flatMap(List::stream)
                .toList();
        System.out.println("Fusion (" + fusion.size() + ") : "
                + fusion.stream().map(Etudiant::getNom).toList());
    }

    private static String determinerNiveau(Etudiant etudiant) {
        if (etudiant.getNote() >= 16) {
            return "Très bien";
        }
        if (etudiant.getNote() >= 10) {
            return "Admis";
        }
        return "Ajourné";
    }

    private static void afficherEtudiant(Etudiant etudiant) {
        System.out.println(formaterEtudiant(etudiant));
    }

    private static String formaterEtudiant(Etudiant etudiant) {
        return etudiant.getNom() + " : " + etudiant.getNote();
    }

    private static String formaterMoyenne(double moyenne) {
        return String.format(Locale.US, "%.2f", moyenne);
    }
}
