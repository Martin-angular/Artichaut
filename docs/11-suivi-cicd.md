# Suivi — Itération 1 · Module CI/CD

> Source : *Projet Artichaut DEVA&IA — Itération 1 (Go2Moodle)*, mise en place des environnements CI/CD (1,5 j présentiel).
> Objectif : préparer les environnements CI/CD (serveurs de déploiement + projets GitLab-CI).

## Livrables attendus (référence Moodle)

1. Un **diagramme de déploiement** clair et concis (nœuds + composants du périmètre d'exploitation).
2. Des **serveurs de recette (staging) et de production** configurés et prêts pour le déploiement.
3. Des **projets GitLab** créés pour le back-end et le front-end.

---

## ✅ Points validés

| # | Élément | Preuve / fichier |
|---|---|---|
| 1.1 | **Diagramme de déploiement** produit au format UML (nœuds, composants, ports, protocoles, staging + prod, GitLab/runners, Docker Hub, Maven Central) | `docs/09-deployment-diagram.md` + `deployment-diagram.svg` |
| — | **Stratégie GitFlow définie et documentée** (main / develop / feature / release / hotfix + règles d'équipe) | `docs/10-gitflow.md` + `gitflow.svg` |
| — | **Pipeline CI conçu** (build + test back & front, notify ClickUp) | `.gitlab-ci.yml`, `docs/08-pipeline-cicd.md` + `pipeline-cicd.svg` |
| — | **Bac à sable de validation** du pipeline (mini back Spring Boot + front Vue.js avec tests) | dossiers `back/`, `front/`, `SANDBOX.md` |
| — | **Intégration GitLab ↔ ClickUp** testée via MCP (commentaire posté sur tâche) | `SANDBOX.md` (historique 2026-07-30 ✅) |
| 1.3 | **2 projets GitLab séparés créés** (`artichaut-back`, `artichaut-front`), poussés en SSH sur `main` + `develop` | `repos/artichaut-back`, `repos/artichaut-front` |
| 1.3 | **Pipeline CI déclenché et vérifié** sur chaque projet (build + test) | onglet Build → Pipelines de chaque projet |

---

## 🔲 Points à faire

### 1.1 — Diagramme de déploiement (finalisation)
- [ ] Renseigner les **vraies IP** des serveurs Scaleway (à demander au formateur).
- [ ] Renseigner les **noms de domaine / sous-domaines réels** (remplacer `artichaut.xxx`).

### 1.2 — Préparer les serveurs de déploiement *(non commencé — dépend des serveurs formateur)*
- [ ] Vérifier l'**accès SSH** aux 2 serveurs Scaleway (faire ajouter nos clés publiques à `authorized_keys` par le formateur).
- [ ] Générer une **paire de clés dédiée GitLab ↔ serveurs** ; clé publique sur le serveur, clé privée conservée en lieu sûr (pour les pipelines CI).
- [ ] **Nettoyer** les serveurs (supprimer logiciels/config inutiles).
- [ ] Installer **Docker** (seul prérequis à installer manuellement).
- [ ] Créer les **sous-domaines** : `api-staging.*`, `web-staging.*`, `api-prod.*`, `web-prod.*`.
- [ ] **Livrable** : les 2 serveurs prêts pour le déploiement.

### 1.3 — Créer et préparer les projets GitLab
- [x] Créer **2 projets GitLab distincts** : `artichaut-back`, `artichaut-front`. ✅
- [x] Appliquer le **GitFlow** (branches `main` + `develop` créées au push). ✅
- [x] **Pipeline CI déclenché** au push et vérifié. ✅
- [ ] Ajouter **tous les membres de l'équipe** aux deux projets (Manage → Members).
- [ ] **Protéger `main` et `develop`** contre les push directs → contributions via **Merge Request** (Settings → Repository → Protected branches).
- [ ] Stocker les **secrets en variables CI** (clé API Docker Hub, clés SSH, `CLICKUP_API_TOKEN`) — Settings → CI/CD → Variables.
- [ ] Tester les secrets avec des **pipelines vides** (vérifier accès Docker Hub, SSH, etc.).

---

## Notes
- Le pipeline actuel s'arrête au **build + test** (CI). Le **déploiement (CD)** vers staging/prod viendra une fois les serveurs prêts (1.2).
- Le dépôt courant est un **monorepo bac à sable** ; la bonne pratique demandée est de **séparer back et front** en deux projets GitLab.
- Compétences visées : *réaliser un diagramme de déploiement* · *mettre en place les environnements CI/CD*.
