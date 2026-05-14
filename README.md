# 🛠️ Hardware Store Management

**Un projet conçu pour la gestion d’un catalogue de quincaillerie et de son système de vente.**

---

## 📋 Objectif du Projet

Ce projet propose une version simplifiée d’un système de gestion de catalogue pour une quincaillerie, inspiré d’un cas d’étude de l’Université de Montpellier 2. Il consiste à modéliser, gérer et interagir avec différentes catégories de pièces ainsi qu’à gérer les informations des clients (particuliers et entreprises).

---

## 🛠️ Fonctionnalités principales

1. **Gestion des pièces :**
   - Trois types de pièces :
     - **Pièces de base** (éléments unitaires comme vis, clous, etc.).
     - **Pièces composites en kit** (assemblées par un particulier avec une notice de montage).
     - **Pièces composites montées** (assemblées en atelier avec une garantie additionnelle).
   - Calcul automatisé des caractéristiques : prix, garantie, et durée de fabrication pour chaque type de pièce.
   - Fonctions :
     - `toString()` : Description succincte.
     - `affiche()` : Fiche détaillée des caractéristiques.
     - Méthodes pour calculer : prix, durée de garantie, durée de fabrication.
     - Ajouter des composants à une pièce composite.

2. **Catalogue de pièces :**
   - Ajout de pièces avec vérification d’unicité (nom + référence).
   - Recherche et affichage des caractéristiques d’une pièce spécifique.
   - Affichage succinct de l’ensemble des pièces du catalogue.

3. **Gestion des clients :**
   - Modélisation et gestion de clients particuliers et entreprises.
   - Détails des clients :
     - Particulier : Nom, prénom, civilité, adresse postale/email.
     - Entreprise : Nom, numéro de SIRET, adresse postale/email.
   - Méthodes pour comparer et manipuler les clients.

---

## ⚙️ Modélisation

Le projet repose sur un diagramme UML élaboré pour représenter :

1. **La structure des pièces (base, composites en kit, composites montées)** avec les relations entre elles.
2. **Le catalogue**, permettant de regrouper, gérer et interagir avec les pièces.
3. **Les détails des clients (particuliers et entreprises)**.

Le diagramme UML intégral contient les classes suivantes :

### 📐 Les pièces :
- **Piece** (classe abstraite).
- **PieceDeBase** : Composants simples accompagnés de leurs caractéristiques (prix, garantie, etc.).
- **PieceCompositeEnKit** : Assemblées par le client avec réduction de garantie.
- **PieceCompositeMontee** : Assemblées en atelier avec garanties et coûts majorés.

### 🗂️ Le catalogue :
- Ajout, recherche et gestion des pièces.
- Fonctionnalités de listing succin ou détaillé.

### 👥 Les clients :
- **Client** (classe abstraite).
- **Particulier** : Individus ayant civilité et prénom.
- **Entreprise** : Sociétés identifiées par SIRET.

![Diagramme UML du projet](./path/to/UML-image.png)

---

## 🔧 Implémentation et Extensions

Les questions du sujet servent de guide pour coder progressivement chaque classe et sa logique métier. 
Les étapes principales incluent :

1. **Implémentation des classes liées aux pièces (de base et composites).**
2. **Test des propriétés et méthodes des pièces.**
3. **Création et gestion du catalogue des pièces, suivi des clients et gestion des interactions.**
4. **Extensions possibles :**
   - Analyse des clients les plus actifs.
   - Ajout de statistiques (ventes, types de pièces).
   - Gestion plus complexe des commandes et inventaire.

---

## 🛠️ Fonctionnement : Exemple

1. **Ajout de pièces** :
   - Exemple de fiche :
     ```
     nom : pneu
     référence : 004741
     prix : 12.5 euros
     garantie :60 mois
     durée de fabrication : 2 jour(s)
     ```

2. **Ajout au catalogue et recherche :**
   - Ajoutez des pièces au catalogue et recherchez leurs fiches détaillées via leur nom et référence.

3. **Gestion de clients :**
   - Ajoutez et affichez des clients (particuliers et entreprises).
   - Exemple :
     - Particulier : Mme Sophie Dupont, sophie.dupont@email.com
     - Entreprise : Technocom (SIRET : 12345678900019)

---

## 🚀 Développement et Points d’Apprentissage

- Application du principe d’héritage en modélisant un système complexe sous forme d’entités distinctes mais reliées.
- Utilisation de structures de données dynamiques (ArrayList et collections).
- Conception et implémentation d’une solution logicielle suivant le diagramme UML fourni.
