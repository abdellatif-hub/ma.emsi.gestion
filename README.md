#  Gestion des Étudiants — EMSI

Application console développée en **Java** dans le cadre du TP de synthèse de Programmation Java — Révision générale du Semestre 1 à l'EMSI.

Ce projet permet de gérer les étudiants, de consulter leurs notes, de calculer la moyenne, d'identifier les étudiants admis, d'effectuer des recherches et des tris, et de gérer les exceptions.

## 📑 Sommaire

- [1. Objectifs du TP](#-1-objectifs-du-tp)
- [2. Technologies utilisées](#-2-technologies-utilisées)
- [3. Structure du projet](#-3-structure-du-projet)
- [4. Démonstrations et captures d'écran](#-4-démonstrations-et-captures-décran)
- [5. Données de test](#-5-données-de-test)
- [6. Résultats attendus](#-6-résultats-attendus)
- [7. Installation et exécution](#-7-installation-et-exécution)
- [8. Notions Java mobilisées](#-8-notions-java-mobilisées)

---

## 🎯 1. Objectifs du TP

L'objectif de ce TP est de mettre en pratique les principales notions de programmation Java étudiées durant le premier semestre.

Les objectifs sont les suivants :

- Créer des classes et des objets.
- Appliquer l'encapsulation et l'héritage.
- Comprendre l'abstraction et le polymorphisme.
- Utiliser les interfaces Java.
- Manipuler des collections.
- Calculer la moyenne des notes et identifier les étudiants admis.
- Rechercher un étudiant par son nom.
- Gérer les exceptions.
- Utiliser `HashSet`, `Map` et `HashMap`.
- Trier les étudiants par identifiant et par note.
- Effectuer une conversion et gérer les erreurs de saisie.

## 🛠️ 2. Technologies utilisées

| Technologie | Utilisation |
|---|---|
| Java | Langage de programmation |
| JDK 21 | Environnement Java |
| IntelliJ IDEA | Environnement de développement |
| Git | Gestion de versions |
| GitHub | Hébergement du code source |

## 📂 3. Structure du projet

```text
GestionEtudiants/
├── src/
│   └── ma/
│       └── emsi/
│           └── gestion/
│               ├── Main.java
│               ├── Personne.java
│               ├── Etudiant.java
│               └── Evaluatable.java
├── .gitignore
└── README.md
```

### Description des classes

- **`Main.java`** : point d'entrée du programme et exécution des différents tests.
- **`Personne.java`** : classe abstraite représentant une personne.
- **`Etudiant.java`** : classe représentant un étudiant, ses informations et ses méthodes.
- **`Evaluatable.java`** : interface définissant la méthode `estAdmis()`.

## 📸 4. Démonstrations et captures d'écran

Les captures d'écran suivantes présentent les résultats de l'exécution des différentes parties du TP.

### 4.1. Héritage et polymorphisme

Cette partie illustre l'héritage entre les classes `Personne` et `Etudiant`, la redéfinition de méthodes et le polymorphisme.

<img width="2285" height="172" alt="image" src="https://github.com/user-attachments/assets/be3c3e0a-4ea2-40be-95c6-d35e1352c2df" />

### 4.2. Interface

Cette partie présente l'utilisation de l'interface `Evaluatable` et le test de la méthode `estAdmis()`.

<img width="2222" height="169" alt="image" src="https://github.com/user-attachments/assets/4463e4ca-60f6-4e0e-b89f-77b0f3e30e2c" />

### 4.3. Liste des étudiants

Cette partie montre le parcours de la liste des étudiants et l'affichage de leurs noms et de leurs notes.

<img width="2294" height="274" alt="image" src="https://github.com/user-attachments/assets/1a6e27aa-dbaf-4bdf-9e5f-c62b0ffe92f0" />

### 4.4. Étudiants admis

Cette partie présente les étudiants ayant obtenu une note supérieure ou égale au seuil d'admission de 10/20.

<img width="2213" height="167" alt="image" src="https://github.com/user-attachments/assets/0c628f25-faf7-4caa-b0e5-4f4712d1ac7b" />

### 4.5. Recherche

Cette partie illustre la recherche d'un étudiant à partir de son nom, sans tenir compte des majuscules et des minuscules.

<img width="2226" height="138" alt="image" src="https://github.com/user-attachments/assets/dda4dbf0-f7f8-4644-90a6-f31586876dec" />

### 4.6. Gestion des exceptions

Cette partie montre le traitement d'une note invalide et l'affichage d'un message d'erreur explicatif.

<img width="2234" height="156" alt="image" src="https://github.com/user-attachments/assets/a65c9d9e-cb31-48a9-b429-ad988f337814" />

### 4.7. HashSet

Cette partie présente l'utilisation de `HashSet` et la gestion des doublons à partir de l'égalité définie dans la classe `Etudiant`.

<img width="2251" height="141" alt="image" src="https://github.com/user-attachments/assets/a80eefc4-d771-4214-a483-ca7bd6c133af" />

### 4.8. Map

Cette partie illustre l'utilisation d'une `Map<Integer, Etudiant>` pour retrouver un étudiant à partir de son identifiant.

<img width="2265" height="175" alt="image" src="https://github.com/user-attachments/assets/122edefe-879d-4bda-a178-f155913efa92" />

### 4.9. Tri par ID

Cette partie présente le tri des étudiants par identifiant croissant.

<img width="2278" height="249" alt="image" src="https://github.com/user-attachments/assets/d22cb4b7-ea38-4397-8684-3c08385ea9ad" />

### 4.10. Tri par note croissante

Cette partie montre le classement des étudiants de la note la plus faible à la note la plus élevée.

<img width="2242" height="232" alt="image" src="https://github.com/user-attachments/assets/012f1985-11d8-4dfd-b653-5970ebe91ccf" />

### 4.11. Bonus : conversion

Cette partie présente le traitement d'une conversion invalide lors de la saisie d'un identifiant.

<img width="2274" height="160" alt="image" src="https://github.com/user-attachments/assets/d00d11df-4591-459f-ad3c-dd88502e3909" />

## 📊 5. Données de test

Les données utilisées dans le TP sont les suivantes :

| Identifiant | Nom | Note / 20 | Résultat |
|---:|---|---:|---|
| 1 | Amina | 15 | Admise |
| 2 | Youssef | 9 | Non admis |
| 3 | Sara | 12,5 | Admise |

**Seuil d'admission : 10/20.**

## ✅ 6. Résultats attendus

| Test | Résultat attendu |
|---|---|
| Moyenne des notes | 12,17/20 environ |
| Étudiants admis | Amina et Sara |
| Recherche de `amina` | Amina |
| Note invalide `-2` | Exception traitée |
| Deux étudiants ayant le même ID dans un `HashSet` | Taille : 1 |
| Recherche dans la Map avec la clé 2 | Youssef |
| Tri par ID | Amina, Youssef, Sara |
| Tri par note croissante | Youssef, Sara, Amina |

## ▶️ 7. Installation et exécution

### Prérequis

- Installer un JDK compatible avec le projet.
- Installer IntelliJ IDEA.

### Cloner le dépôt GitHub

```bash
git clone https://github.com/VOTRE-USERNAME/GestionEtudiants.git
```

Remplacez `VOTRE-USERNAME` par votre nom d'utilisateur GitHub.

### Exécuter le programme

1. Ouvrir le projet dans IntelliJ IDEA.
2. Vérifier la configuration du JDK.
3. Ouvrir le fichier `Main.java`.
4. Cliquer sur **Run**.
5. Consulter les résultats dans la console d'exécution.

## 📚 8. Notions Java mobilisées

Ce TP permet de réviser les notions suivantes :

- **Programmation orientée objet :** classes, objets, constructeurs et méthodes.
- **Encapsulation :** protection des attributs et validation des données.
- **Héritage et polymorphisme :** réutilisation et redéfinition des méthodes.
- **Abstraction et interfaces :** définition de contrats et implémentation.
- **Collections Java :** `List`, `ArrayList`, `Set`, `HashSet`, `Map` et `HashMap`.
- **Traitement des données :** boucles, conditions, calculs et recherche.
- **Gestion des erreurs :** exceptions et conversion des données.
- **Égalité des objets :** `equals()` et `hashCode()`.
- **Tri :** `Comparable`, `Comparator` et `Collections.sort()`.

Conformément aux consignes du TP, les traitements sont réalisés sans Streams ni expressions lambda.




---

# 9. TP n°2 — Programmation fonctionnelle en Java

Cette partie constitue la suite du projet **Gestion des étudiants — EMSI**. Elle vise à approfondir les notions de programmation fonctionnelle en Java tout en conservant les classes et les fonctionnalités développées lors du TP n°1.

Les trois premières étapes portent sur la mutabilité des objets, les fonctions pures, les interfaces fonctionnelles personnalisées et les quatre interfaces fonctionnelles standard du JDK.

## 9.1. Étape 1 — Observer l’état et écrire une fonction pure

### Objectif

Comprendre la différence entre la modification de l’état d’un objet et l’utilisation d’une fonction pure.

### Travail réalisé

- Création d’un étudiant nommé Youssef avec une note initiale de 9/20.
- Affichage de sa note initiale.
- Modification de sa note à l’aide de la méthode `setNote(11)`.
- Affichage de sa nouvelle note.
- Création de la méthode statique `noteAdmise(double note)`, qui retourne `true` lorsque la note est supérieure ou égale à 10.
- Analyse de la mutabilité de la classe `Etudiant`.

La méthode `noteAdmise()` est une fonction pure : elle reçoit une note en paramètre, retourne un résultat booléen et ne modifie aucun objet.

En revanche, la méthode `setNote()` permet de modifier la note après la création de l’étudiant. La classe `Etudiant` est donc mutable. Le mot-clé `final`, appliqué à une référence, empêche de réaffecter cette référence, mais ne rend pas automatiquement l’objet immuable.

### Résultat obtenu

```text
Note initiale : 9.0
Note modifiée : 11.0
noteadmise(9) : false
```

### Capture d’écran — Étape 1

<img width="2559" height="331" alt="image" src="https://github.com/user-attachments/assets/7e682079-0b92-48c3-9b04-01628f52b6bf" />

## 9.2. Étape 2 — Créer une interface fonctionnelle et utiliser une expression lambda

### Objectif

Définir une règle d’admission modifiable sans devoir changer le code de la classe `Etudiant`.

### Travail réalisé

Une interface fonctionnelle nommée `RegleAdmission` est créée dans le package `ma.emsi.gestion`.

Elle est annotée avec `@FunctionalInterface` et contient une seule méthode abstraite :

```java
boolean valider(Etudiant e);
```

Cette interface est utilisée de deux manières :

- Une classe anonyme permet de définir une règle d’admission.
- Une expression lambda permet de définir la même règle de manière plus concise.

La méthode `verifier(Etudiant e, RegleAdmission regle)` applique la règle reçue en paramètre à un étudiant.

Deux seuils d’admission sont testés : 10/20 et 12/20.


Cette étape montre qu’une interface fonctionnelle permet de séparer la règle d’admission de la classe métier. Le seuil peut ainsi changer sans modifier la classe `Etudiant`.

### Capture d’écran — Étape 2

<img width="2418" height="98" alt="image" src="https://github.com/user-attachments/assets/1f2c9c34-2041-4db8-972f-03aa4cf9dc3e" />


## 9.3. Étape 3 — Utiliser les quatre interfaces fonctionnelles standard

### Objectif

Découvrir les interfaces fonctionnelles du package `java.util.function` et comprendre leur utilisation pour traiter les objets étudiants.

### A. Predicate<Etudiant>

L’interface `Predicate<T>` permet de tester une condition et de retourner un résultat booléen.

Dans ce TP, elle permet de vérifier si un étudiant est admis, en utilisant le seuil de 10/20.

- Méthode utilisée : `test()`.
- Entrée : un étudiant.
- Résultat : `true` si l’étudiant est admis, sinon `false`.

### B. Function<Etudiant, String>

L’interface `Function<T, R>` permet de transformer une valeur d’entrée en une valeur de sortie.

Dans ce TP, elle détermine le statut de l’étudiant :

- `Admis` si sa note est supérieure ou égale à 10.
- `Ajourné` si sa note est inférieure à 10.

- Méthode utilisée : `apply()`.
- Entrée : un étudiant.
- Résultat : une chaîne de caractères.

### C. Consumer<Etudiant>

L’interface `Consumer<T>` permet d’exécuter une opération sur une valeur sans retourner de résultat.

Dans ce TP, elle affiche le nom et la note de chaque étudiant.

- Méthode utilisée : `accept()`.
- Entrée : un étudiant.
- Résultat : affichage des informations, sans valeur retournée.

### D. Supplier<Etudiant>

L’interface `Supplier<T>` permet de fournir une valeur sans recevoir d’argument.

Dans ce TP, elle crée un nouvel étudiant nommé Omar, possédant l’identifiant 4 et une note de 14/20.

- Méthode utilisée : `get()`.
- Entrée : aucun argument.
- Résultat : un nouvel objet `Etudiant`.

### Résultats obtenus

La console affiche notamment les résultats suivants :

```text
Amina : true
Youssef : false
Sara : true

Amina : Admis
Youssef : Ajourné
Sara : Admis

Amina : 15.0
Youssef : 9.0
Sara : 12.5

Omar : 14.0
```

Ces résultats illustrent les quatre rôles : tester une condition, transformer une valeur, exécuter une opération d’affichage et fournir un nouvel objet.

### Capture d’écran — Étape 3

<img width="2405" height="659" alt="image" src="https://github.com/user-attachments/assets/f77698d5-3bcd-4186-9363-9e5072578f53" />


## 9.4. Nouveaux fichiers du projet

Les trois fichiers suivants ont été ajoutés au package `ma.emsi.gestion` :

| Fichier | Description |
|---|---|
| `RegleAdmission.java` | Définit l’interface fonctionnelle utilisée pour valider un étudiant selon une règle d’admission. |
| `ResultatEtudiant.java` | Prépare la représentation des résultats sous forme de `Record` pour la suite du TP. |
| `TP2Main.java` | Contient le point d’entrée permettant d’exécuter les étapes 1, 2 et 3 du TP n°2. |

La structure du projet devient :

```text
GestionEtudiants/
├── src/
│   └── ma/
│       └── emsi/
│           └── gestion/
│               ├── Main.java
│               ├── Personne.java
│               ├── Etudiant.java
│               ├── Evaluatable.java
│               ├── RegleAdmission.java
│               ├── ResultatEtudiant.java
│               └── TP2Main.java
├── .gitignore
└── README.md
```

## 9.5. Exécution du TP n°2

Pour exécuter les nouvelles fonctionnalités, il faut :

1. Ouvrir le projet `GestionEtudiants` dans IntelliJ IDEA.
2. Ouvrir le fichier `TP2Main.java`.
3. Cliquer sur **Run** pour lancer le programme.
4. Consulter les résultats dans la fenêtre d’exécution.
5. Vérifier les résultats des trois étapes.

L’exécution présentée dans la capture d’écran s’est terminée avec le code de sortie `0`, ce qui indique que le programme s’est terminé normalement.

### Capture d’écran — Exécution complète

<img width="2557" height="1340" alt="image" src="https://github.com/user-attachments/assets/30f8d9f4-0ff4-4d61-a428-9e5280ec8a76" />


## 9.6. Bilan des notions étudiées

Les trois premières étapes du TP n°2 permettent de mettre en pratique les notions suivantes :

- **Mutabilité des objets :** modification de l’état d’un étudiant après sa création.
- **Fonctions pures :** calcul d’un résultat sans modifier l’état des objets.
- **Interfaces fonctionnelles :** définition d’un contrat contenant une seule méthode abstraite.
- **Expressions lambda :** définition concise d’un comportement.
- **Classes anonymes :** implémentation d’une interface sans créer une classe nommée supplémentaire.
- **Predicate :** test d’une condition.
- **Function :** transformation d’une valeur.
- **Consumer :** exécution d’une opération sans retour de valeur.
- **Supplier :** création ou fourniture d’une valeur sans argument.

### Conclusion

Les étapes 1, 2 et 3 du TP n°2 prolongent le travail réalisé dans le TP n°1 en introduisant les premières notions de programmation fonctionnelle.

La classe `Etudiant` reste le modèle métier du projet. Les nouvelles règles de traitement sont définies séparément, ce qui facilite leur réutilisation et leur évolution.

Les étapes suivantes du TP n°2 seront documentées après leur réalisation.

---

# TP3 – API Stream : Gestion des étudiants

**EMSI – Programmation Java – Semestre 2**
**Package :** `ma.emsi.gestion` | **Java :** 27 (exécuté avec JDK 21) | **IDE :** VS Code / IntelliJ IDEA

## 1. Présentation

Ce TP prolonge le projet des TP1 et TP2 (« Programmation fonctionnelle et Records »). Les classes existantes (`Personne`, `Evaluatable`, `Etudiant`, `Main`, `RegleAdmission`, `ResultatEtudiant`, `TP2Main`) n'ont **pas été modifiées**. Seuls deux fichiers ont été ajoutés :

| Fichier | Rôle |
|---|---|
| `AnalyseEtudiants.java` | Méthodes de traitement basées sur l'API Stream |
| `TP3Main.java` | Programme principal : création des données et affichage des 5 étapes + défis |

## 2. Jeu d'essai (seuil d'admission : 10/20)

| ID | Nom | Note /20 | Situation |
|---|---|---|---|
| 1 | Amina | 15,0 | Admis |
| 2 | Youssef | 9,0 | Ajourné |
| 3 | Sara | 12,5 | Admis |
| 4 | Omar | 14,0 | Admis |
| 5 | Lina | 18,0 | Admis |
| 6 | Karim | 7,5 | Ajourné |

## 3. Compilation et exécution

```powershell
javac -d out src/ma/emsi/gestion/*.java
java -cp out ma.emsi.gestion.TP3Main
```

---

## 4. Étape 1 – De la boucle impérative au Stream

**Objectif :** remplacer la boucle `for-each` du TP2 par un pipeline `stream().filter().forEach()` qui affiche les admis sous la forme « nom : note ».

**Résultat obtenu :**
```
Amina : 15.0
Sara : 12.5
Omar : 14.0
Lina : 18.0
```

<img width="2449" height="167" alt="1" src="https://github.com/user-attachments/assets/ca72eda9-c7ba-47b3-90b8-fcfec624f91b" />

**Questions de cours :**
- *Pourquoi `filter()` est intermédiaire et `forEach()` terminale ?* `filter()` retourne un nouveau `Stream` et s'exécute de façon paresseuse (lazy). `forEach()` produit un résultat/effet et déclenche l'exécution de tout le pipeline.
- *Que devient le pipeline sans opération terminale ?* Il ne s'exécute pas : aucun élément n'est traité.

---

## 5. Étape 2 – Filtrer et transformer les données

**Objectif :** filtrer les notes ≥ 10, convertir les étudiants en Records avec `map()`, collecter avec `toList()`, puis extraire les noms avec `Etudiant::getNom`.

**Résultat obtenu :**
```
ResultatAnalyse[id=1, nom=Amina, note=15.0, admis=true]
ResultatAnalyse[id=3, nom=Sara, note=12.5, admis=true]
ResultatAnalyse[id=4, nom=Omar, note=14.0, admis=true]
ResultatAnalyse[id=5, nom=Lina, note=18.0, admis=true]
Noms des admis : [Amina, Sara, Omar, Lina]
```

<img width="2440" height="210" alt="2" src="https://github.com/user-attachments/assets/c5e19da1-81ad-4c6b-9b5b-38b51c5e0cce" />

**Questions de cours :**
- *Type avant/après `map()` ?* `Etudiant` avant, Record (`id`, `nom`, `note`, `admis`) après.
- *Pourquoi les `Etudiant` d'origine ne sont pas modifiés ?* Le Record est un nouvel objet immuable ; `map()` crée de nouveaux éléments sans toucher à la source.

---

## 6. Étape 3 – Trier, classer et limiter

**Objectif :** trier par note croissante puis décroissante, et extraire le top 3 avec `sorted()` et `limit(3)`, sans modifier la liste source.

**Résultat obtenu :**
```
Notes croissantes   : [Karim : 7.5, Youssef : 9.0, Sara : 12.5, Omar : 14.0, Amina : 15.0, Lina : 18.0]
Notes décroissantes : [Lina : 18.0, Amina : 15.0, Omar : 14.0, Sara : 12.5, Youssef : 9.0, Karim : 7.5]
Top 3 : 1. Lina : 18.0 | 2. Amina : 15.0 | 3. Omar : 14.0
Noms du top 3 : [Lina, Amina, Omar]
```

<img width="2435" height="172" alt="3" src="https://github.com/user-attachments/assets/42b730b8-5532-424c-aa18-e4732dfadeab" />

**Questions de cours :**
- *`sorted().limit(3)` vs `limit(3).sorted()` ?* Le premier trie tout puis garde les 3 meilleurs (correct). Le second garde les 3 premiers éléments de l'ordre initial puis les trie (résultat faux pour un classement).
- *`sorted()` modifie-t-elle la liste d'origine ?* Non, elle produit un nouveau flux trié ; la liste source garde son ordre.

---

## 7. Étape 4 – Recherches et statistiques

**Objectif :** obtenir un tableau de bord statistique avec `count()`, `anyMatch()`, `allMatch()`, `max()`, `mapToDouble()` et `average()`.

**Résultat obtenu :**
```
Admis : 4 | Note >= 16 : true | Notes valides : true | Meilleur : Lina (18.0) | Moyenne : 12.67
```

<img width="2451" height="72" alt="4" src="https://github.com/user-attachments/assets/0dcd81b8-8465-47a2-b93f-7b8068d438e1" />

**Questions de cours :**
- *Pourquoi `count()` retourne un `long` ?* Un flux peut contenir plus d'éléments que la capacité d'un `int`.
- *Pourquoi `Optional` / `OptionalDouble` ?* Le flux peut être vide : il n'existe alors ni maximum ni moyenne. `Optional` force à gérer ce cas (`orElse`, `ifPresentOrElse`).

---

## 8. Étape 5 – Regrouper et produire un bilan

**Objectif :** séparer admis/ajournés avec `Collectors.partitioningBy()`, regrouper par niveau (Très bien ≥ 16, Admis ≥ 10 et < 16, Ajourné < 10) avec `Collectors.groupingBy()`, puis afficher un bilan.

**Résultat obtenu :**
```
Admis : [Amina, Sara, Omar, Lina] | Ajournés : [Youssef, Karim]
Très bien : [Lina]
Admis : [Amina, Sara, Omar]
Ajourné : [Youssef, Karim]
Bilan final : total 6 | admis 4 | moyenne 12.67 | meilleur Lina | top 3 [Lina, Amina, Omar] | groupes {Très bien=[Lina], Admis=[Amina, Sara, Omar], Ajourné=[Youssef, Karim]}
```

<img width="2431" height="246" alt="5" src="https://github.com/user-attachments/assets/1bb8af10-50df-4ebe-8a35-81f6e324788b" />

**Questions de cours :**
- *Pourquoi `partitioningBy()` donne des clés `true`/`false` ?* Elle utilise un prédicat booléen : il n'y a que deux groupes possibles.
- *Pourquoi `groupingBy()` est plus générale ?* Sa clé est calculée par une `Function` quelconque (texte, entier, énumération…), avec autant de groupes que nécessaire.

---

## 9. Défi A – Réduire une séquence de notes

**Objectif :** calculer la somme des six notes avec `map()` + `reduce()` et comparer avec `mapToDouble().sum()`.

**Résultat obtenu :**
```
Somme reduce : 76.0 | Somme mapToDouble : 76.0
```

<img width="2447" height="70" alt="6" src="https://github.com/user-attachments/assets/09ebace1-23d5-4ae8-8d44-1e3f40e7df5c" />

Les deux méthodes donnent le même résultat (76.0).

---

## 10. Défi B – Aplatir plusieurs groupes

**Objectif :** fusionner deux listes d'étudiants en une seule avec `flatMap(List::stream)` en conservant les six étudiants et leur ordre.

**Résultat obtenu :**
```
Fusion (6) : [Amina, Youssef, Sara, Omar, Lina, Karim]
```

<img width="2439" height="74" alt="7" src="https://github.com/user-attachments/assets/1abd7f55-45be-426f-bf56-e291a78045b7" />

---

## 11. Vérification

- [x] Les fichiers du TP1/TP2 sont inchangés et compilent.
- [x] Aucune boucle `for`/`while` dans les traitements : uniquement des Streams.
- [x] Pas de traitement parallèle, pas de bibliothèque externe.
- [x] Les résultats des 5 étapes correspondent aux résultats attendus de l'énoncé.
- [x] Les notes de référence restent inchangées (Youssef = 9.0).

<img width="2455" height="1066" alt="image" src="https://github.com/user-attachments/assets/ac295dfa-ebd3-4e61-a484-0e293abefa4c" />



