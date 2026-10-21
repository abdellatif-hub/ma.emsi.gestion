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
- [9. Auteur](#-9-auteur)

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
