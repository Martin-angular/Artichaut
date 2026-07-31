# WBS Complet — Projet Hôtel Artichaut

> **Règle WBS** : chaque élément est un **livrable** (résultat tangible), jamais une tâche.
> « Page d'accueil » ✅ · « Coder la page d'accueil » ❌
>
> **Légende** :
> ✅ Réalisé · 🔲 À faire · 🔁 En cours
> It.1 → It.4 : itération de réalisation prévue
> (M) Martin — UX/UI/Conception · (B) Membre 2 — Back-end · (F) Membre 3 — Front-end

---

## 1. Gestion de projet & cadrage *(It.1)*

### 1.1 Analyse & cadrage
- 1.1.1 ✅ Analyse du cahier des charges *(M)*
- 1.1.2 ✅ Questions client à trancher *(M)*
- 1.1.3 ✅ Définition du périmètre MVP *(M,B,F)*

### 1.2 Planification
- 1.2.1 ✅ WBS technique (vue production) *(M)*
- 1.2.2 ✅ WBS client (vue livrables) *(M)*
- 1.2.3 ✅ Backlog structuré et priorisé (MoSCoW, phases) *(M)*
- 1.2.4 ✅ Roadmap des 4 itérations *(M)*

### 1.3 Outils & organisation
- 1.3.1 ✅ Espace de gestion de projet ClickUp configuré *(M)*
- 1.3.2 ✅ Dépôts GitLab (back + front) créés avec GitFlow *(B,F)*
- 1.3.3 ✅ Convention de nommage et branches définies *(B,F)*

---

## 2. Conception UX / UI *(It.1)*

### 2.1 Recherche & exploration
- 2.1.1 🔲 Benchmark UX concurrents (grille + synthèse) *(M)*
- 2.1.2 🔲 Moodboard / planche d'inspiration *(M)*

### 2.2 Expérience utilisateur
- 2.2.1 ✅ Persona client (voyageur) *(M)*
- 2.2.2 ✅ Persona personnel hôtelier (Michel) *(M)*
- 2.2.3 ✅ Persona directeur *(M)*
- 2.2.4 ✅ User flow réservation *(M)*
- 2.2.5 ✅ User flow Michel (personnel) *(M)*
- 2.2.6 ✅ User flow directeur *(M)*
- 2.2.7 ✅ Arborescence du site (plan de navigation) *(M)*

### 2.3 Interface utilisateur
- 2.3.1 🔲 Charte graphique / design system (couleurs, typo, composants) *(M)*
- 2.3.2 🔲 Wireframes mobile-first — écrans clés (accueil, recherche, réservation, compte) *(M)*
- 2.3.3 🔲 Maquettes haute fidélité *(M)*

---

## 3. Architecture & fondations techniques *(It.1 – It.2)*

### 3.1 Architecture système
- 3.1.1 🔲 Schéma d'architecture (API REST + SPA, séparation back/front) *(B)*
- 3.1.2 🔲 Contrat d'API — spécification OpenAPI *(B)*

### 3.2 Modèle de données
- 3.2.1 🔲 Schéma entité-relation (chambres, tarifs, clients, réservations, options, contenus) *(B)*
- 3.2.2 🔲 Scripts SQL (création, suppression, insertion + jeux de données exemples) *(B)*
- 3.2.3 🔲 Base de données initialisée (schéma + migrations Flyway/Liquibase) *(B)*

### 3.3 Environnements de développement
- 3.3.1 🔲 Squelette projet back-end Spring Boot *(B)*
- 3.3.2 🔲 Squelette projet front-end Vue.js *(F)*

---

## 4. CI / CD & Infrastructure *(It.1 – It.2)*

### 4.1 Diagrammes & documentation infra
- 4.1.1 ✅ Diagramme de déploiement *(B)*
- 4.1.2 ✅ Documentation pipeline CI/CD *(B)*
- 4.1.3 ✅ Documentation GitFlow *(B)*

### 4.2 Infrastructure serveurs
- 4.2.1 🔲 Serveurs Scaleway provisionnés (staging + production) *(B)*
- 4.2.2 🔲 Docker configuré sur les serveurs *(B)*
- 4.2.3 🔲 Noms de domaine + certificats SSL actifs *(B)*

### 4.3 Pipeline GitLab CI/CD
- 4.3.1 🔁 Pipeline CI back-end (build, tests, staging) *(B)*
- 4.3.2 🔲 Pipeline CI front-end (build, lint, staging) *(F)*
- 4.3.3 🔲 Pipeline CD — déploiement automatique en production *(B,F)*
- 4.3.4 ✅ Notification ClickUp depuis pipeline *(B)*

---

## 5. Back-end — API REST Spring Boot *(It.2 – It.4)*

### 5.1 Authentification & comptes
- 5.1.1 🔲 Module inscription / connexion (email + JWT) *(B)*
- 5.1.2 🔲 Module OAuth (Google / Facebook) *(B)*
- 5.1.3 🔲 Module rôles & permissions (Client / Personnel / Admin) *(B)*

### 5.2 Gestion des chambres & tarifs
- 5.2.1 🔲 Module CRUD chambres (types, numéros, caractéristiques) *(B)*
- 5.2.2 🔲 Module CRUD tarifs (prix par type de chambre) *(B)*
- 5.2.3 🔲 Module options (formules repas, packs confort) *(B)*
- 5.2.4 🔲 Module disponibilité & allocation de chambre *(B)*
- 5.2.5 🔲 Module moteur de tarification (calcul prix, réductions fidélité) *(B)*

### 5.3 Réservation & facturation
- 5.3.1 🔲 Module création de réservation *(B)*
- 5.3.2 🔲 Module empreinte carte bancaire *(B)*
- 5.3.3 🔲 Module annulation de réservation *(B)*
- 5.3.4 🔲 Module facturation client *(B)*
- 5.3.5 🔲 Module facturation entreprise *(B)*

### 5.4 Contenu & communication
- 5.4.1 🔲 Module CMS site vitrine (gestion contenus via API sécurisée) *(B)*
- 5.4.2 🔲 Module bandeaux promotionnels *(B)*
- 5.4.3 🔲 Module emails automatiques (confirmation, alerte maître d'hôtel, préparation séjour) *(B)*
- 5.4.4 🔲 Module météo (intégration API M2M) *(B)*
- 5.4.5 🔲 Module QR code identité client *(B)*

### 5.5 Conformité
- 5.5.1 🔲 Module RGPD (conservation, export, suppression des données) *(B)*

---

## 6. Front-end — SPA Vue.js *(It.3 – It.4)*

### 6.1 Site vitrine
- 6.1.1 🔲 Section Hero (titre, sous-titre, CTA, illustration) *(F)*
- 6.1.2 🔲 Section Avantages *(F)*
- 6.1.3 🔲 Section Vidéo *(F)*
- 6.1.4 🔲 Section Avis clients *(F)*
- 6.1.5 🔲 Section Actualités *(F)*
- 6.1.6 🔲 Footer (liens, réseaux sociaux) *(F)*
- 6.1.7 🔲 Bandeau promotionnel dynamique *(F)*

### 6.2 Authentification
- 6.2.1 🔲 Page inscription *(F)*
- 6.2.2 🔲 Page connexion *(F)*
- 6.2.3 🔲 Connexion OAuth (Google / Facebook) *(F)*

### 6.3 Espace client
- 6.3.1 🔲 Page profil client *(F)*
- 6.3.2 🔲 Page mes réservations (historique + détail) *(F)*
- 6.3.3 🔲 Historique des nuits et remises fidélité *(F)*

### 6.4 Tunnel de réservation
- 6.4.1 🔲 Étape 1 — Recherche disponibilité (dates + nb personnes) *(F)*
- 6.4.2 🔲 Étape 2 — Résultats & estimatif tarifaire *(F)*
- 6.4.3 🔲 Étape 3 — Sélection des options *(F)*
- 6.4.4 🔲 Étape 4 — Saisie empreinte CB & validation *(F)*
- 6.4.5 🔲 Page confirmation de réservation *(F)*

### 6.5 Back-office personnel hôtelier
- 6.5.1 🔲 Vue liste réservations (filtres, statuts) *(F)*
- 6.5.2 🔲 Fiche client (coordonnées, historique) *(F)*
- 6.5.3 🔲 Accès aux factures *(F)*

### 6.6 Interface d'administration *(optionnel — It.4)*
- 6.6.1 🔲 Gestion des chambres et tarifs *(F)*
- 6.6.2 🔲 Gestion des contenus CMS *(F)*
- 6.6.3 🔲 Gestion des droits et rôles *(F)*

---

## 7. Qualité & sécurité *(It.2 – It.4)*

### 7.1 Tests
- 7.1.1 🔲 Tests unitaires — logique métier (calcul de prix, allocation chambres) *(B)*
- 7.1.2 🔲 Tests fonctionnels — routes API *(B)*
- 7.1.3 🔲 Tests d'intégration front-end *(F)*

### 7.2 Sécurité
- 7.2.1 🔲 Sécurisation API (protection OWASP, rate limiting) *(B)*
- 7.2.2 🔲 Audit de sécurité de l'application *(B,F)*

### 7.3 Éco-conception
- 7.3.1 🔲 Audit Green IT (référentiel numérique responsable) *(M,F)*
- 7.3.2 🔲 Score éco-conception ≥ 30 % atteint *(M,F)*

---

## 8. Livraison & documentation *(It.4)*

### 8.1 Documentation technique
- 8.1.1 🔲 Documentation API (Swagger / OpenAPI) *(B)*
- 8.1.2 🔲 Guide d'installation & déploiement *(B)*

### 8.2 Documentation utilisateur
- 8.2.1 🔲 Guide back-office personnel hôtelier *(M)*
- 8.2.2 🔲 Guide administrateur *(M)*

### 8.3 Livrables finaux
- 8.3.1 🔲 Dossier de conception de l'application *(M)*
- 8.3.2 🔲 Dépôt Git fonctionnel (back + front) *(B,F)*
- 8.3.3 🔲 URL publique déployée avec nom de domaine + SSL *(B)*
- 8.3.4 🔲 Support de présentation / démonstration finale *(M,B,F)*

---

## Récapitulatif par itération

| Itération | Durée | Sections WBS | Livrables clés |
|---|---|---|---|
| **It.1** — Conception & modèle de données | 2 sem. | 1, 2, 3, 4.1 | Backlog, Personas, User flows, Wireframes, Modèle BDD, Diagramme déploiement |
| **It.2** — Back-end | 2 sem. | 4.2, 4.3, 5 | Serveurs prêts, Pipeline CI, API Spring Boot (auth, chambres, réservation) |
| **It.3** — Front-end | 2 sem. | 6 | SPA Vue.js : vitrine, auth, espace client, tunnel réservation |
| **It.4** — Full stack & finalisation | 2 sem. | 6.6, 7, 8 | Features finales, tests, éco-conception, documentation, déploiement production |

---

## Répartition indicative par profil

| Profil | Membre | Responsabilités principales |
|---|---|---|
| **UX / UI / Conception** | Martin | Sections 1, 2, 8.2, 8.3.1 + contribution front (6) |
| **Back-end** | Membre 2 | Sections 3, 4, 5, 7.1-7.2, 8.1 |
| **Front-end** | Membre 3 | Sections 6, 7.3, contribution CI front (4.3.2) |

> L'équipe est polyvalente — la répartition fine est dans `docs/03-backlog.md`.

---

## Checklist de validation du WBS

- [x] Chaque élément est un **livrable**, pas une tâche
- [x] Numérotation hiérarchique sur 3 niveaux (X / X.X / X.X.X)
- [x] Couverture complète du périmètre (gestion projet → livraison)
- [x] Itération de réalisation indiquée pour chaque bloc
- [x] Avancement visible (✅ / 🔁 / 🔲)
- [x] Répartition par profil indiquée
