# Backlog par Phases — Projet Hôtel Artichaut

> **Principe** : chaque **Phase** reprend un bloc du WBS client (`02b-wbs-client.md`).
> Sous chaque phase, les **étapes concrètes** pour la produire (couches BDD → API → front → tests),
> issues du WBS concepteur (`02-wbs.md`). C'est l'**association des deux WBS**.
>
> ⚠️ Ici « Phase » = bloc fonctionnel du produit, à ne pas confondre avec les 4 **itérations** de livraison (`roadmap.md`).

## Légendes

**Pastille de priorité (MoSCoW)** — 🔴 Must · 🟡 Should · 🔵 Could · ⚪ Won't
**Effort** — ⚡ rapide · ⏳ moyen · 🧱 long
**Labels** — 🟣 UX · 🎨 UI · 🔵 front · 🟢 back · 🟠 BDD · 🔴 Ops/CI · ⚫ wording
**#MVP** — inclus dans le Minimum Viable Product (itération 1)

---

## Phase 0 — Socle technique & conception
*(transversal — prérequis de toutes les phases, issu du WBS concepteur)*

| Étape | Prio | Effort | Labels | #MVP |
|---|---|---|---|---|
| Initialiser le repo Git & conventions | 🔴 | ⚡ | 🔴 | ✅ |
| Squelette projet Spring Boot | 🔴 | ⏳ | 🟢 | ✅ |
| Squelette projet Angular | 🔴 | ⏳ | 🔵 | ✅ |
| Schéma d'architecture (API + SPA) | 🔴 | ⏳ | 🟢 | ✅ |
| Contrat d'API (OpenAPI) | 🔴 | 🧱 | 🟢 | ✅ |
| Modèle de données | 🔴 | 🧱 | 🟠 | ✅ |
| Base initialisée + migrations | 🔴 | ⏳ | 🟠 | ✅ |
| Benchmark UX des concurrents | 🔴 | ⏳ | 🟣 | ✅ |
| Note de synthèse des besoins utilisateurs | 🔴 | ⚡ | 🟣 | ✅ |
| User flows (parcours utilisateur) | 🔴 | ⏳ | 🟣 | ✅ |
| Wireframes mobile-first v1 (ind.) | 🔴 | 🧱 | 🟣 | ✅ |
| Analyse des points de friction | 🟡 | ⚡ | 🟣 | — |
| Wireframes itérés v2 (ind.) | 🟡 | ⏳ | 🟣 | — |
| Maquettes UI / design system | 🟡 | 🧱 | 🎨 | — |

---

## Phase 1 — Site vitrine

**Étapes pour livrer les sections et les contenus dynamiques :**

| Étape | Prio | Effort | Labels | #MVP |
|---|---|---|---|---|
| Modèle de contenu en blocs réutilisables (BDD) | 🟡 | 🧱 | 🟠 🟢 | — |
| API sécurisée de gestion de contenu | 🟡 | 🧱 | 🟢 | — |
| Intégration des sections (Hero, Avantages, Avis, Actus, Footer) | 🟡 | 🧱 | 🔵 🎨 | — |
| Section vidéo intégrée | 🔵 | ⚡ | 🔵 | — |
| Édition des contenus & bandeaux promo | 🔵 | ⏳ | 🟢 🔵 | — |
| Préparation au multilingue (i18n) | ⚪ | 🧱 | 🔵 ⚫ | — |

---

## Phase 2 — Compte utilisateur

**Étapes pour créer un compte et gérer l'espace client :**

| Étape | Prio | Effort | Labels | #MVP |
|---|---|---|---|---|
| Inscription par email (nom, prénom, adresse) | 🔴 | ⏳ | 🟢 | ✅ |
| Connexion / authentification (JWT) | 🔴 | 🧱 | 🟢 | ✅ |
| Écrans inscription / connexion | 🔴 | ⏳ | 🔵 🎨 | ✅ |
| Connexion Google / Facebook (OAuth) | 🟡 | 🧱 | 🟢 🔵 | — |
| Espace client — consultation des réservations | 🟡 | ⏳ | 🔵 | — |
| Historique des nuits & remises | 🔵 | ⏳ | 🔵 🟢 | — |

---

## Phase 3 — Communication automatisée

**Étapes pour l'envoi des emails automatiques :**

| Étape | Prio | Effort | Labels | #MVP |
|---|---|---|---|---|
| Email de confirmation client + notification hôtel | 🟡 | ⏳ | 🟢 ⚫ | — |
| Email « préparer son séjour » (7j avant) | 🔵 | 🧱 | 🟢 ⚫ | — |
| Intégration météo (M2M) | 🔵 | ⏳ | 🟢 | — |
| QR code d'identité client | 🔵 | 🧱 | 🟢 | — |

---

## Phase 4 — Réservation en ligne

**Étapes pour le tunnel de réservation complet :**

| Étape | Prio | Effort | Labels | #MVP |
|---|---|---|---|---|
| Calcul de disponibilité (dates → chambres libres) | 🔴 | 🧱 | 🟢 | ✅ |
| Calcul de prix de base (tarif × nuits × pers.) | 🔴 | ⏳ | 🟢 | ✅ |
| Tests unitaires du calcul de prix | 🔴 | ⏳ | 🟢 🔴 | ✅ |
| Saisie des dates & personnes (front) | 🔴 | ⏳ | 🔵 | ✅ |
| Affichage de l'estimation de prix | 🔴 | ⏳ | 🔵 | ✅ |
| Tunnel de réservation (parcours complet) | 🔴 | 🧱 | 🔵 🎨 | ✅ |
| Attribution unique de chambre (pas de changement) | 🔴 | ⏳ | 🟢 | ✅ |
| Saisie empreinte carte bancaire (non débitée) | 🔴 | ⏳ | 🟢 🔵 | ✅ |
| Création de la réservation en base | 🔴 | ⏳ | 🟢 | ✅ |
| CRUD options (formules repas, pack confort) | 🟡 | ⏳ | 🟢 | — |
| Options dans le tunnel & le prix | 🟡 | ⏳ | 🔵 🟢 | — |
| Réductions fidélité (-10 % / -25 %) | 🟡 | 🧱 | 🟢 | — |
| Règles d'annulation (24h) & facturation 12h | 🟡 | 🧱 | 🟢 | — |

---

## Phase 5 — Back-office administration

**Étapes pour la gestion côté hôtel :**

| Étape | Prio | Effort | Labels | #MVP |
|---|---|---|---|---|
| CRUD chambres (types, numéros) via API | 🔴 | ⏳ | 🟢 | ✅ |
| Gestion des prix par type via API | 🔴 | ⏳ | 🟢 | ✅ |
| Permissions Personnel hôtelier | 🟡 | 🧱 | 🟢 | — |
| Permissions Administrateurs | 🟡 | ⏳ | 🟢 | — |
| Back-office personnel (résa, fiches, factures) | 🟡 | 🧱 | 🔵 🟢 | — |
| Facturation à l'adresse entreprise (pro) | 🔵 | ⏳ | 🟢 | — |
| Interface d'administration (contenus) | 🔵 | 🧱 | 🔵 🎨 | — |
| Gestion des droits et rôles (écran) | 🔵 | ⏳ | 🔵 | — |

---

## Phase 6 — Qualité, livraison & documentation
*(transversal — issu du WBS concepteur)*

| Étape | Prio | Effort | Labels | #MVP |
|---|---|---|---|---|
| Tests fonctionnels de chaque route API | 🔴 | 🧱 | 🟢 🔴 | ✅ |
| Pipeline d'intégration continue (CI) | 🟡 | 🧱 | 🔴 | — |
| Durcissement API (protection attaques) | 🟡 | ⏳ | 🟢 🔴 | — |
| Audit éco-conception (score ≥ 30 %) | 🟡 | ⏳ | 🔵 🔴 | — |
| Optimisations Green IT (images, lazy loading) | 🔵 | ⏳ | 🔵 | — |
| RGPD — durée de conservation des données | 🔵 | ⏳ | 🟢 🟠 | — |
| RGPD — export / suppression sur demande | 🔵 | 🧱 | 🟢 | — |
| Documentation technique (API, installation) | 🟡 | ⏳ | ⚫ | — |
| Documentation utilisateur / guide back-office | 🔵 | ⏳ | ⚫ | — |
| Support de présentation / démonstration finale | 🟡 | ⏳ | ⚫ | — |

---

## 🎯 Synthèse MVP (itération 1)

Le MVP = toutes les étapes **✅** ci-dessus, soit :
**Phase 0** (socle + benchmark, user flows, wireframes v1) · **Phase 2** (inscription, connexion, écrans) ·
**Phase 4** (disponibilité, prix + tests, saisie, estimatif, tunnel, attribution, empreinte CB, création) ·
**Phase 5** (CRUD chambres, prix par type) · **Phase 6** (tests fonctionnels des routes).

Les phases 1 (site vitrine), 3 (communication) et le reste des phases 4/5/6 relèvent des itérations 2 à 4.
