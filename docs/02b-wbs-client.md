# WBS — Vue client (orientée livrables) — Hôtel Artichaut

> Découpage du projet par **composants du produit tels que le client les perçoit**.
> Complémentaire du WBS orienté production (`02-wbs.md`, vue concepteur).
> Chaque nœud est un **livrable** (un résultat), pas une tâche.
>
> Niveaux : 🟩 Bloc produit (niveau 1) → 🟨 Sous-ensemble (niveau 2) → 🟧 Livrable (niveau 3)

---

## 1. Site vitrine

### 1.1 Pages et sections
- Section Hero (titre, sous-titre, CTA, illustration)
- Avantages (icône, titre, description)
- Section vidéo (titre, description, player)
- Section avis clients (note, texte, avatar)
- Actualités (titre, image, description)
- Footer (liens, réseaux, nom hôtel)

### 1.2 Contenus dynamiques
- Gestion via API
- Édition des contenus (textes, bandeaux)
- Préparation au multilingue

## 2. Compte utilisateur

### 2.1 Création de compte
- Via email classique
- Via Google ou Facebook

### 2.2 Espace client
- Consultation des réservations
- Historique des nuits et remises

## 3. Communication automatisée

### 3.1 Email de préparation au séjour
- Infos chambre, météo, accès
- QR code d'identité client

## 4. Réservation en ligne

### 4.1 Recherche et estimation
- Saisie des dates et personnes
- Calcul disponibilité et prix

### 4.2 Choix des options
- Formules repas (petit-déj, demi-pension…)
- Pack confort
- Réductions fidélité

### 4.3 Validation et paiement
- Attribution unique de chambre
- Saisie empreinte carte bancaire
- Email de confirmation client et hôtel

## 5. Back-office administration

### 5.1 Gestion des chambres et tarifs
- CRUD chambres (types, numéros)
- Gestion des prix par type

### 5.2 Gestion des utilisateurs
- Personnel hôtelier
- Administrateurs

### 5.3 Interface d'administration
- Gestion des contenus
- Gestion des droits et rôles

---

## Note d'articulation

Ce WBS **vue client** décrit *ce que le client reçoit*. Il sert de base au **backlog** (`03-backlog.md`),
où chaque livrable est décomposé en tâches, priorisé (MoSCoW), estimé et assigné — c'est là que se fait
la **répartition dans l'équipe**. Le WBS ne porte pas lui-même les affectations : il cadre le périmètre.
