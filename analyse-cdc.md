# Analyse du cahier des charges — Projet Hôtel Artichaut

## Objectif du projet

L'hôtel L'Artichaut (3⭐ : 25 chambres standard, 5 chambres de luxe, 1 suite) veut **moderniser son processus de réservation via un site internet**. Aujourd'hui les clients réservent en réception ou par téléphone ; l'hôtel veut un site qui à la fois **présente l'hôtel** (site vitrine) et **permet de réserver en ligne**, tout en offrant une **meilleure gestion des réservations pour les employés**.

Le client veut un **contrôle total et automatisable** sur le contenu du site vitrine et sur le système de réservation, ainsi qu'un **système évolutif** (il compte étendre son SI plus tard). D'où une architecture **back/front séparée** (API REST + SPA). La livraison se fait de façon progressive, en commençant par un **MVP** : réservation en ligne, création de comptes clients, gestion basique des chambres et tarifs via API.

## Les règles métier

### Tarification (par nuit et par personne)

- Chambre Standard (101-110, 201-210, 301-305) : **70 €/nuit/personne**
- Chambre de luxe (111, 211, 306, 307, 308) : **140 €/nuit/personne**
- Suite (309) : **280 €/nuit/personne**
- Capacité : jusqu'à **3 personnes** par chambre

### Réductions fidélité (cumulatives dans le temps, « à vie »)

- À partir de la **10ᵉ nuit** de séjour dans l'hôtel : **-10 %** sur chaque nuit
- À partir de la **100ᵉ nuit** : **-25 %**

### Réservation & paiement

- Une **empreinte de carte de crédit** est demandée pour confirmer la réservation ; la carte **n'est pas débitée immédiatement**.
- Annulation possible **jusqu'à 24h avant**. Passé ce délai, la chambre est **facturée au début du booking, soit à 12h pile le jour d'arrivée**.
- Le client **ne doit pas changer de chambre** pendant son séjour → l'allocation de chambre doit être garantie.
- Un **estimatif** de prix est fourni pour les dates saisies, avant le choix des options.

### Options réservables

- Petit-déjeuner continental : **12 €/nuit/personne**
- Formule demi-pension (soir) : **20 €/personne/jour**
- Formule pension complète (midi + soir) : **35 €/personne/jour**
- Formule petit-déjeuner (matin) : **12 €/personne/jour**
- Pack confort (Wi-Fi, TV, services de chambre premium) : **30 €/séjour/personne**

### Comptes clients

- Inscription via **Google/Facebook** ou par **email**.
- Informations requises : nom, prénom, adresse postale.
- Pour les professionnels : possibilité d'émettre la facture à **l'adresse de l'entreprise** en plus de celle du voyageur.

### Communication (emails)

- Réservation → email de **confirmation au client** + email d'alerte au **maître d'hôtel**.
- Une semaine avant l'arrivée (ou à la confirmation si trop tard) → email **« préparer son séjour »** contenant :
  - la **météo** prévue pour le séjour (M2M),
  - un **QR Code « IDENTITÉ »** (accès aux services + ajout automatique des frais de restauration/chambre à la note),
  - les **infos de la chambre** réservée,
  - **comment accéder** à l'hôtel.

### Rôles & droits d'accès

- **Client** : créer un compte, réserver une chambre, consulter ses réservations, recevoir les emails liés à son séjour.
- **Personnel hôtelier** : accéder aux réservations, voir les fiches clients, émettre les factures, gérer les infos liées aux séjours. **Ne peut pas** modifier le contenu du site vitrine.
- **Administrateur** : accès complet au back-office/API — chambres, tarifs, options, contenus du site vitrine, comptes du personnel.

### RGPD

- Gestion **automatique** des règles : durée de conservation, fourniture des données personnelles sur demande.

### Site vitrine (contenu pilotable par API sécurisée)

- Modifiable par les administrateurs via **API sécurisée** (interface d'administration **optionnelle**), avec gestion de **bandeaux promotionnels**.
- Sections attendues :
  - Bandeau de promotion
  - **Hero** : titre, sous-titre, 2 boutons CTA, illustration
  - **Avantages** : chacun avec icône + titre + description
  - **Vidéo** : titre, description, vidéo intégrée
  - **Avis** : titre, puis pour chaque avis un titre, une description, une note, le nom de la personne et son avatar
  - **Actualités** : liste, chaque actualité avec titre, image, description
  - **Footer** : nom de l'hôtel, icônes réseaux sociaux cliquables, liens affichés en colonnes

### Éco-conception (Green IT)

- Appliquer un maximum du référentiel des **115 bonnes pratiques** (collectif.greenit.fr/ecoconception-web) → **score minimum de 30 %**.

### Exigences techniques

- Stack imposée : **Spring Boot** + **Angular**.
- Chaque route de l'API REST doit avoir un **test fonctionnel** (format de sortie a minima) ; **tests unitaires** pour les fonctionnalités compatibles.
- **Intégration continue** automatisée en fin de projet, incluant les tests.
- Base de données et code **évolutifs**, respectant au mieux les principes **SOLID**.
- Prévoir la **traduction multilingue** à terme et une **protection contre les attaques** malveillantes.
