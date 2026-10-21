#  Gestion des Étudiants — EMSI

Application console développée en **Java** dans le cadre du TP de synthèse de Programmation Java — Révision générale du Semestre 1 à l'EMSI.

Le projet permet de gérer une liste d'étudiants, de consulter leurs notes, de calculer la moyenne, d'identifier les étudiants admis, d'effectuer des recherches et de trier les résultats.

---

## 📌 Table des matières

- [1. Objectifs du TP](#-1-objectifs-du-tp)
- [2. Technologies utilisées](#-2-technologies-utilisées)
- [3. Structure du projet](#-3-structure-du-projet)
- [4. Fonctionnalités et démonstrations](#-4-fonctionnalités-et-démonstrations)
- [5. Données de test](#-5-données-de-test)
- [6. Résultats attendus](#-6-résultats-attendus)
- [7. Installation et exécution](#-7-installation-et-exécution)
- [8. Notions Java mobilisées](#-8-notions-java-mobilisées)
- [9. Auteur](#-9-auteur)

---

## 🎯 1. Objectifs du TP

L'objectif de ce TP est de mettre en pratique les principales notions étudiées en programmation Java durant le premier semestre, à travers une seule application console.

Le travail porte notamment sur :

- La création de classes et de packages.
- L'encapsulation des attributs.
- Les constructeurs, les getters et les setters.
- L'héritage, l'abstraction et le polymorphisme.
- Les interfaces et leur implémentation.
- Les collections Java et les traitements de données.
- La recherche d'un étudiant par son nom.
- La gestion des exceptions.
- L'utilisation de `HashSet`, `HashMap` et `Map`.
- Le tri des étudiants selon différents critères.

## 🛠️ 2. Technologies utilisées

| Technologie | Utilisation |
|---|---|
| Java | Langage de programmation |
| JDK 21 | Environnement de développement et d'exécution |
| IntelliJ IDEA | IDE utilisé pour développer le projet |
| Git | Gestion de versions |
| GitHub | Hébergement du code source |

## 📂 3. Structure du projet

```text
GestionEtudiants/
│
├── src/
│   └── ma/
│       └── emsi/
│           └── gestion/
│               ├── Main.java
│               ├── Personne.java
│               ├── Etudiant.java
│               └── Evaluatable.java
│
├── screenshots/
│   ├── 01-demarrage.png
│   ├── 02-encapsulation.png
│   ├── 03-heritage-polymorphisme.png
│   ├── 04-interface.png
│   ├── 05-collections-moyenne-admission.png
│   ├── 06-recherche.png
│   ├── 07-exceptions.png
│   ├── 08-hashset-map.png
│   └── 09-tri.png
│
├── .gitignore
└── README.md
```

**Rôle des classes :**

- `Main.java` : point d'entrée du programme et tests des différentes fonctionnalités.
- `Personne.java` : classe abstraite représentant une personne.
- `Etudiant.java` : classe représentant un étudiant, ses informations et ses opérations.
- `Evaluatable.java` : interface définissant la méthode `estAdmis()`.

## 💻 4. Fonctionnalités et démonstrations

### 4.1. Démarrage et structure

Affichage du titre de l'application et lancement du programme à partir de la méthode `main()`.

**Notions :** package, classe, méthode principale et affichage console.

📸 **Capture d'écran — Exécution 1**

![Démarrage de l'application](screenshots/01-demarrage.png)

> À ajouter : une capture montrant le titre « Gestion des étudiants — EMSI ».

---

### 4.2. Classe Etudiant et encapsulation

La classe `Etudiant` contient les attributs `id`, `nom` et `note`. Les attributs sont privés afin de protéger les données.

Les opérations comprennent :
- L'initialisation d'un étudiant avec un constructeur.
- L'accès aux informations avec des getters.
- La modification de la note avec `setNote(double)`.
- La validation des notes entre 0 et 20.
- La vérification de l'admission avec `estAdmis()`.

**Notions :** encapsulation, constructeur, `this`, méthodes, conditions et exceptions.

📸 **Capture d'écran — Exécution 2**

![Encapsulation et validation](screenshots/02-encapsulation.png)

> À ajouter : une capture montrant les informations d'un étudiant et, si possible, la validation de sa note.

---

### 4.3. Héritage, redéfinition et polymorphisme

La classe `Personne` est abstraite et fournit une base commune aux personnes.

La classe `Etudiant` hérite de `Personne` et redéfinit la méthode `role()` afin de retourner le rôle « Étudiant ».

**Notions :** `extends`, `super`, classe abstraite, `@Override` et polymorphisme.

📸 **Capture d'écran — Exécution 3**

![Héritage et polymorphisme](screenshots/03-heritage-polymorphisme.png)

> À ajouter : une capture montrant le nom de la personne et son rôle.

---

### 4.4. Interface et contrat

L'interface `Evaluatable` définit la méthode `estAdmis()`. La classe `Etudiant` implémente cette interface.

L'application vérifie l'admission à travers une référence de type `Evaluatable`.

**Notions :** interface, `implements`, contrat et méthodes booléennes.

📸 **Capture d'écran — Exécution 4**

![Interface Evaluatable](screenshots/04-interface.png)

> À ajouter : une capture montrant le résultat du test d'admission.

---

### 4.5. Collections et traitements

Une liste `List<Etudiant>` est créée avec `ArrayList` pour stocker les étudiants.

Les traitements effectués sont :
- Parcourir la liste avec une boucle `for-each`.
- Afficher les noms et les notes.
- Calculer la moyenne des notes.
- Afficher les étudiants admis.
- Gérer le cas d'une liste vide.

**Notions :** `List`, `ArrayList`, boucles, conditions et calculs.

📸 **Capture d'écran — Exécution 5**

![Liste et moyenne des étudiants](screenshots/05-collections-moyenne-admission.png)

> À ajouter : une capture montrant la liste des étudiants, la moyenne et les étudiants admis.

---

### 4.6. Recherche d'un étudiant

La méthode `rechercherParNom(List<Etudiant>, String)` permet de rechercher un étudiant par son nom.

La recherche ignore les différences entre majuscules et minuscules et les espaces situés au début ou à la fin de la saisie.

Exemple : rechercher `amina` permet de retrouver `Amina`.

**Notions :** `String`, `trim()`, `equalsIgnoreCase()`, méthodes et valeur `null`.

📸 **Capture d'écran — Exécution 6**

![Recherche d'un étudiant](screenshots/06-recherche.png)

> À ajouter : une capture montrant le résultat de la recherche d'Amina.

---

### 4.7. Gestion des exceptions et saisie

Le programme teste une note invalide, par exemple `-2`, afin de vérifier que l'exception `IllegalArgumentException` est correctement interceptée.

Un message explicatif est affiché à l'utilisateur.

Le TP propose également en bonus la lecture d'un identifiant avec `Scanner` et le traitement de `NumberFormatException` lorsqu'une conversion échoue.

**Notions :** `try`, `catch`, `throw`, `Scanner` et conversion de données.

📸 **Capture d'écran — Exécution 7**

![Gestion des exceptions](screenshots/07-exceptions.png)

> À ajouter : une capture montrant le message d'erreur pour une note invalide.

---

### 4.8. Égalité, ensembles et dictionnaires

La classe `Etudiant` redéfinit `equals(Object)` et `hashCode()` pour considérer deux étudiants comme égaux lorsque leurs identifiants sont identiques.

Le programme utilise :
- `HashSet` pour vérifier qu'un doublon d'identifiant n'ajoute pas un deuxième élément.
- `Map<Integer, Etudiant>` et `HashMap` pour retrouver un étudiant à partir de son identifiant.

**Notions :** `equals()`, `hashCode()`, `Set`, `HashSet`, `Map` et `HashMap`.

📸 **Capture d'écran — Exécution 8**

![HashSet et HashMap](screenshots/08-hashset-map.png)

> À ajouter : une capture montrant une taille de HashSet égale à 1 et la recherche de Youssef avec l'identifiant 2.

---

### 4.9. Tri des étudiants

Le programme permet de trier les étudiants selon deux critères :

- **Par identifiant croissant** : grâce à `Comparable<Etudiant>`.
- **Par note croissante** : grâce à `Comparator` et `Collections.sort()`.

Le tri est effectué sur des copies de la liste afin de conserver la liste originale.

**Notions :** `Comparable`, `Comparator`, `Collections.sort()` et comparaison d'objets.

📸 **Capture d'écran — Exécution 9**

![Tri des étudiants](screenshots/09-tri.png)

> À ajouter : une capture montrant les résultats des deux tris.

## 📊 5. Données de test

Les données utilisées dans le TP sont les suivantes :

| Identifiant | Nom | Note / 20 | Résultat |
|---:|---|---:|---|
| 1 | Amina | 15 | Admise |
| 2 | Youssef | 9 | Non admis |
| 3 | Sara | 12,5 | Admise |

Le seuil d'admission est fixé à **10/20**.

## ✅ 6. Résultats attendus

| Test | Résultat attendu |
|---|---|
| Moyenne des notes | 12,17/20 environ |
| Étudiants admis | Amina et Sara |
| Recherche `amina` | Amina |
| Note invalide `-2` | Exception traitée |
| Deux objets avec l'identifiant 1 dans un `HashSet` | Taille : 1 |
| Recherche dans la Map avec la clé 2 | Youssef |
| Tri par identifiant | Amina, Youssef, Sara |
| Tri par note croissante | Youssef, Sara, Amina |

## ▶️ 7. Installation et exécution

### Prérequis

- Installer un JDK compatible avec le projet.
- Installer IntelliJ IDEA.
- Cloner le dépôt GitHub.

### Cloner le projet

```bash
git clone https://github.com/VOTRE-USERNAME/GestionEtudiants.git
```

Remplacer `VOTRE-USERNAME` par votre nom d'utilisateur GitHub.

### Ouvrir le projet

1. Ouvrir IntelliJ IDEA.
2. Cliquer sur **Open**.
3. Sélectionner le dossier `GestionEtudiants`.
4. Vérifier la configuration du JDK.
5. Ouvrir `Main.java`.
6. Exécuter la méthode `main()` en cliquant sur le bouton **Run**.

Le résultat de l'exécution apparaît dans la console d'IntelliJ IDEA.

## 📚 8. Notions Java mobilisées

Ce TP permet de réviser les notions suivantes :

- **Programmation orientée objet :** classes, objets, attributs, constructeurs et méthodes.
- **Encapsulation :** protection des attributs et accès contrôlé aux données.
- **Héritage :** réutilisation et spécialisation des classes.
- **Polymorphisme :** utilisation d'une référence de type parent.
- **Abstraction et interfaces :** définition de contrats et implémentation de méthodes.
- **Collections :** manipulation de listes, ensembles et dictionnaires.
- **Exceptions :** validation des données et traitement des erreurs.
- **Recherche et tri :** traitement et organisation des données.

Conformément aux consignes du TP, les traitements sont réalisés sans Streams ni expressions lambda.

## 👨‍💻 9. Auteur

**Nom :** Abdellatif El Hamaoui  
**Établissement :** EMSI  
**Module :** Programmation Java — Révision générale du S1  
**Projet :** TP de synthèse — Gestion des étudiants

---

*Projet réalisé dans un objectif pédagogique afin de mettre en pratique les fondamentaux de la programmation Java.*
