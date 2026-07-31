# Roadmap — Projet Hôtel Artichaut

**Équipe** : 3 (Martin : UX/UI · 2 autres : back / front)
**Stack** : Spring Boot (API REST) / **Vue.js** (SPA) — *stack officielle du cours*
**Format** : 4 itérations de 2 semaines · 40 jours / 280 h au total

**Livrables finaux du projet** : le dossier de conception de l'application · un dépôt Git fonctionnel
(API REST Spring Boot + front Vue.js) · l'URL publique du site déployé avec nom de domaine sécurisé (SSL).

## Vue d'ensemble des itérations

| Itération | Thème |
|---|---|
| 1 | Conception du projet & création du modèle de données |
| 2 | Développement du back-end (CI/CD, tests, Spring Boot) |
| 3 | Développement du front-end (Vue.js à partir des maquettes) |
| 4 | Full stack — développement par feature, tests & intégration continue |

---

## Itération 1 — Conception du projet & modèle de données (10 j / 70 h)

Composée de **4 modules** :

### Module 1 — Gestion de projet
Livrables : **Backlog**, **Roadmap**.
Réalisés : `03-backlog.md` (par phases), cette roadmap, + WBS (`02b-wbs-client.md`, `02-wbs.md`), analyse & questions (`01b`, `01c`), arborescence (`05`).

### Module 2 — Expérience Utilisateur (UX)
Livrables : **User flow**, **Personæ**.
Réalisés : 3 personae → 3 user flows (`04`, `06`, `07`). Wireframes/UI à produire.

### Module 3 — CI / CD
Livrables : **un diagramme de déploiement**, les **serveurs staging + prod configurés et prêts**, des **projets GitLab créés** (back-end et front-end).
Suivi détaillé : `docs/11-suivi-cicd.md`.

**✅ Validé** : diagramme de déploiement (`09` + svg) · GitFlow défini (`10` + svg) · pipeline CI conçu (`.gitlab-ci.yml`, `08` + svg) · bac à sable de validation (`back/`, `front/`, `SANDBOX.md`) · intégration GitLab ↔ ClickUp testée · **2 projets GitLab séparés créés** (`artichaut-back`, `artichaut-front`) avec `main`+`develop` et **pipeline CI déclenché/vérifié**.

**🔲 À faire** :
- 1.1 Compléter le diagramme avec IP Scaleway + domaines réels.
- 1.2 Préparer les serveurs (SSH, clés GitLab↔serveur, nettoyage, Docker, sous-domaines) — *dépend des serveurs formateur*.
- 1.3 (reste) Ajouter l'équipe aux 2 projets, protéger `main`/`develop` (Merge Requests), stocker les secrets CI, tester par pipelines vides.

### Module 4 — BDD / Conception Technique
Livrables : **schéma de la stack technique**, **schémas de données**, **scripts SQL** (création, suppression, insertion + exemples).
À produire.

---

## Itération 2 — Développement du back-end
Mise en place de la stratégie de dev : CI/CD, tests, et back-end avec Spring Boot (gestion des données et fonctionnalités de base du serveur).

## Itération 3 — Développement du front-end
Intégration du front Vue.js à partir des maquettes produites : interfaces fonctionnelles et esthétiques, expérience utilisateur.

## Itération 4 — Full stack
Développement **par feature** en full stack : fonctionnalités finalisées pour l'utilisateur, avec tests et intégration continue.

---

## Notes de gestion

- Structure conforme au module cours (Moodle) ; approche **itérative et collaborative**.
- Chaque itération : semaine 1 en travaux guidés, semaine 2 en travaux supervisés (itération 4 entièrement supervisée).
- Suivi des livrables dans ClickUp ; diagrammes et docs dans `docs/`.
