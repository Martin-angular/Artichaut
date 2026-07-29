# Roadmap — Projet Hôtel Artichaut

**Équipe** : 2-3 développeurs polyvalents (back + front)
**Stack** : Spring Boot (API REST) / Angular (SPA)
**Rythme** : itérations de 2 semaines
**Découpage** : 4 itérations, la première visant le MVP défini par le client

## Vue d'ensemble

| Itération | Durée | Objectif |
|---|---|---|
| 1 — MVP | 2 semaines | Réservation en ligne, comptes clients, gestion basique chambres/tarifs |
| 2 | 2 semaines | Options de réservation, tarification avancée, emails automatiques |
| 3 | 2 semaines | CMS du site vitrine (API + contenus), rôles & back-office personnel |
| 4 | 2 semaines | RGPD, éco-conception, sécurité, CI/CD, communication séjour (météo, QR code) |

---

## Itération 1 — MVP (2 semaines)

### Objectif
Livrer le socle fonctionnel demandé explicitement par le client : un visiteur peut créer un compte, réserver une chambre, et l'hôtel dispose d'une gestion basique des chambres/tarifs via API.

### Backlog

**Fondations techniques**
- Initialisation du repo (back Spring Boot + front Angular), conventions de code
- Modèle de données : chambres (101-110, 201-210, 301-305 standards ; 111/211/306-308 luxe ; 309 suite), tarifs, clients, réservations
- Setup base de données (schéma évolutif, migrations)
- Squelette API REST + squelette SPA Angular

**Comptes clients**
- Inscription par email (nom, prénom, adresse postale)
- Connexion / authentification (JWT ou session)
- *Optionnel si le temps le permet* : inscription via Google/Facebook (sinon reporté en itération 2)

**Gestion chambres & tarifs (API, basique)**
- Endpoint CRUD chambres (numéro, type, capacité, tarif/nuit/personne)
- Endpoint de disponibilité (dates → chambres libres)
- Règle : le client ne doit pas changer de chambre pendant son séjour (allocation figée à la réservation)

**Réservation en ligne**
- Recherche de disponibilité par dates
- Estimatif de prix (tarif × nuits × personnes, sans options ni réductions fidélité à ce stade — voir itération 2)
- Saisie empreinte carte bancaire (pas de débit immédiat)
- Création de la réservation en base

**Tests & qualité**
- Tests fonctionnels sur chaque route API livrée (format de sortie a minima)
- Tests unitaires sur la logique de calcul de prix et d'allocation de chambre

### Hors périmètre (reporté)
Réductions fidélité (10%/25%), options (demi-pension, pension complète, pack confort), emails automatiques, CMS site vitrine, rôles personnel/admin, RGPD, éco-conception, CI/CD — traités dans les itérations suivantes.

### Definition of Done
- Un visiteur peut s'inscrire, rechercher une disponibilité, obtenir un prix estimatif et réserver une chambre avec empreinte CB.
- Un administrateur peut créer/modifier une chambre et son tarif via l'API.
- Les routes livrées ont un test fonctionnel ; la logique de prix a un test unitaire.
- Le code est démontrable de bout en bout (front → API → base).

---

## Itération 2 — Réservation avancée & communication (2 semaines)

- Réductions fidélité (10% dès 10 nuits, 25% dès 100 nuits)
- Options de réservation : demi-pension, pension complète, petit-déjeuner seul, pack confort
- Facturation entreprise (adresse société pour les professionnels)
- Emails automatiques : confirmation client + notification maître d'hôtel
- Email "préparer son séjour" (contenu de base, sans météo/QR code — reportés en itération 4 selon complexité)
- Connexion Google/Facebook si non faite en itération 1

## Itération 3 — Site vitrine (CMS) & rôles (2 semaines)

- API sécurisée de gestion de contenu (bandeau promo, sections Hero/Avantages/Vidéo/Avis/Actualités/Footer)
- Interface d'administration simple (optionnelle selon charge)
- Gestion des rôles Client / Personnel hôtelier / Administrateur (permissions API)
- Back-office personnel : accès réservations, fiches clients, facturation

## Itération 4 — Conformité, sécurité & industrialisation (2 semaines)

- RGPD : durée de conservation, export/suppression des données personnelles sur demande
- Sécurisation contre attaques malveillantes (durcissement API)
- Éco-conception : audit et mise en œuvre du référentiel GreenIT (objectif ≥ 30%)
- QR code "IDENTITÉ" et intégration météo (M2M) dans l'email de préparation au séjour
- Mise en place de l'intégration continue (CI) incluant les tests
- Préparation multilingue (si le temps le permet)

---

## Notes de gestion

- Le backlog de chaque itération pourra être ajusté en fin de sprint précédent selon la vélocité réelle de l'équipe.
- Les items marqués *optionnel* ou *si le temps le permet* sont les premiers candidats au report en cas de dérapage.
- Cette roadmap distingue bien le MVP (itération 1) des développements futurs, conformément à la demande du client.
