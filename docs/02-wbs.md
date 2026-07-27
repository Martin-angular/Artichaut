# WBS — Découpage technique du projet Hôtel Artichaut

> **Rappel méthode** : le WBS liste des **livrables** (résultats tangibles), pas des tâches.
> « Page d'accueil » ✅ / « Coder la page d'accueil » ❌
> Il donne la vue d'ensemble et sert de base au backlog (`03-backlog.md`).

---

## Phase 0 — Cadrage & gestion de projet

- Analyse du cahier des charges (`01-analyse-cdc.md`)
- Environnement de gestion de projet (espace ClickUp partagé)
- WBS (ce document)
- Backlog structuré et priorisé
- Benchmark UX
- Roadmap des 4 itérations (`roadmap.md`)
- Définition du périmètre MVP

## Phase 1 — Conception (UX / UI)

- Benchmark UX (grille + synthèse)
- Personas & parcours utilisateur (client, personnel, admin)
- Arborescence du site (vitrine + espace réservation)
- Wireframes des écrans clés (accueil, recherche/dispo, réservation, compte)
- Maquettes UI / design system (couleurs, typo, composants)
- Moodboard

## Phase 2 — Architecture & fondations techniques

- Schéma d'architecture (API REST + SPA, séparation back/front)
- Modèle de données (chambres, tarifs, clients, réservations, options, contenus)
- Contrat d'API (spécification OpenAPI)
- Environnement de développement (repos, conventions, branches)
- Base de données initialisée (schéma + migrations)
- Squelette back Spring Boot
- Squelette front Angular

## Phase 3 — Back-end (API REST)

- Module Authentification & comptes clients (email + OAuth Google/Facebook)
- Module Gestion des chambres
- Module Gestion des tarifs & options
- Module Disponibilité & allocation de chambre
- Module Moteur de tarification (calcul prix, réductions fidélité)
- Module Réservation (création, empreinte CB, annulation)
- Module Facturation (client + entreprise)
- Module Gestion de contenu du site vitrine (CMS via API sécurisée)
- Module Bandeaux promotionnels
- Module Rôles & permissions (Client / Personnel / Admin)
- Module Emails (confirmation, alerte maître d'hôtel, « préparer son séjour »)
- Module Communication séjour (météo M2M, QR code IDENTITÉ)
- Module Conformité RGPD (conservation, export/suppression données)

## Phase 4 — Front-end (SPA Angular)

- Site vitrine (Hero, Avantages, Vidéo, Avis, Actualités, Footer, bandeau promo)
- Écrans d'authentification (inscription / connexion / OAuth)
- Espace client (profil, mes réservations)
- Tunnel de réservation (recherche dispo, estimatif, options, paiement)
- Back-office personnel hôtelier (réservations, fiches clients, factures)
- Interface d'administration (contenus, chambres, tarifs, comptes) — *optionnel*
- Internationalisation (multilingue) — *à terme*

## Phase 5 — Qualité, sécurité & industrialisation

- Tests fonctionnels des routes API
- Tests unitaires (logique métier : prix, allocation…)
- Sécurisation de l'application (protection contre attaques)
- Éco-conception Green IT (audit + score ≥ 30 %)
- Pipeline d'intégration continue (CI) incluant les tests

## Phase 6 — Livraison & documentation

- Documentation technique (API, installation)
- Documentation utilisateur / guide back-office
- Support de présentation / démonstration finale

---

## Répartition indicative par profil (équipe de 3)

> À ajuster « en vrai » — l'équipe est polyvalente.

| Profil | Membre | Phases où il/elle pilote |
|---|---|---|
| **UX / UI / Conception** | **Martin** | Phase 1 (conception), Phase 0 (benchmark), contribue au front (Phase 4) |
| **Back-end** | Membre 2 | Phase 2 (archi/BDD), Phase 3 (API), Phase 5 (tests/CI) |
| **Front-end** | Membre 3 | Phase 2 (squelette front), Phase 4 (SPA), Phase 5 (éco-conception) |

Chacun reste polyvalent : la répartition fine des tâches se fera dans `05-repartition.md` à partir du backlog.

---

## Checklist de validation du WBS

- [x] Chaque élément est un **livrable**, pas une tâche
- [x] Le WBS est hiérarchisé en niveaux clairs (phase → livrable)
- [x] Il couvre **tout le périmètre** du projet
- [x] Il n'entre pas dans le détail des tâches (ça, c'est le backlog)
