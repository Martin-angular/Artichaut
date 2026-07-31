# Hôtel Artichaut

Site vitrine et système de réservation en ligne pour l'hôtel **L'Artichaut** — 3 étoiles, 31 chambres (standards, luxe, suite), Paris.

Le projet modernise le processus de réservation : présenter l'établissement, permettre aux clients de réserver en ligne avec gestion des options et réductions fidélité, et offrir au personnel un back-office de gestion des réservations.

## Stack technique

| Couche | Techno |
|---|---|
| Back-end | Spring Boot — API REST |
| Front-end | Angular — SPA |
| Architecture | Séparation stricte back/front via API, principes SOLID |
| Qualité | Tests unitaires + fonctionnels, intégration continue |
| Éco-conception | Référentiel Green IT (objectif ≥ 30 %) |

## Structure du dépôt

```
Artichaut/
├── README.md
├── roadmap.md                              → vue d'ensemble des 4 itérations
├── Charte-Graphique_Hotel-Artichaut.pdf   → identité visuelle
├── WBS-Hôtel.png                          → WBS en image
├── docs/
│   ├── 01b-notes-lecture-cdc.md           → lecture active du cahier des charges
│   ├── 01c-questions-client.md            → questions à trancher avec le client
│   ├── 02-wbs.md                          → WBS concepteur (vue production)
│   ├── 02b-wbs-client.md                  → WBS client (vue livrables)
│   ├── 03-backlog.md                      → backlog MoSCoW, MVP, phases
│   ├── 04-userflow-reservation.md         → user flow réservation (Mermaid)
│   ├── 05-arborescence.md                 → plan de site (Mermaid)
│   └── arborescence.svg                   → plan de site exporté
├── back/                                  → API Spring Boot (itération 1)
└── front/                                 → SPA Angular (itération 1)
```

## Roadmap

| Itération | Durée | Objectif |
|---|---|---|
| **1 — MVP** | 2 semaines | Réservation en ligne, comptes clients, gestion chambres/tarifs |
| 2 | 2 semaines | Options, tarification avancée (fidélité), emails automatiques |
| 3 | 2 semaines | CMS site vitrine, rôles et back-office personnel |
| 4 | 2 semaines | RGPD, sécurité, éco-conception, CI/CD, QR code, météo |

Détail complet → [roadmap.md](roadmap.md)

## Installation & lancement

> À compléter au démarrage de l'itération 1.

**Back-end (Spring Boot)**
```bash
cd back
./mvnw spring-boot:run
```

**Front-end (Angular)**
```bash
cd front
npm install
ng serve
```

## Documentation

| Fichier | Contenu |
|---|---|
| [roadmap.md](roadmap.md) | Les 4 itérations, backlog itération 1, Definition of Done |
| [docs/03-backlog.md](docs/03-backlog.md) | Backlog complet par phases (MoSCoW, effort, labels, MVP) |
| [docs/04-userflow-reservation.md](docs/04-userflow-reservation.md) | Parcours utilisateur réservation + points de friction |
| [docs/05-arborescence.md](docs/05-arborescence.md) | Plan de site (arborescence des pages) |
| [docs/02-wbs.md](docs/02-wbs.md) | WBS concepteur — vue production |
| [docs/02b-wbs-client.md](docs/02b-wbs-client.md) | WBS client — vue livrables |
| [docs/01b-notes-lecture-cdc.md](docs/01b-notes-lecture-cdc.md) | Analyse du cahier des charges |
| [docs/01c-questions-client.md](docs/01c-questions-client.md) | Questions ouvertes à trancher avec le client |

## Bonnes pratiques de commit

Chaque commit doit suivre ce format pour déclencher automatiquement une notification sur la tâche ClickUp correspondante :

```
<type>: <description courte à l'impératif> CU-<identifiant_tache>
```

| Type | Usage |
|------|-------|
| `feat` | Nouvelle fonctionnalité |
| `fix` | Correction de bug |
| `test` | Ajout ou modification de tests |
| `ci` | Configuration pipeline / CI-CD |
| `docs` | Documentation |
| `refactor` | Réorganisation sans changer le comportement |
| `chore` | Tâche technique (dépendances, config) |

**Exemple :**
```bash
git commit -m "feat: ajoute le tunnel de réservation CU-869ebv7br"
```

> L'identifiant `CU-869ebv7br` est extrait du message : le pipeline poste automatiquement un commentaire sur la tâche ClickUp.
> Règle stricte : l'ID doit être en **minuscules** et collé au préfixe `CU-`.
> Guide complet → [docs/12-integration-gitlab-clickup.md](docs/12-integration-gitlab-clickup.md)

## Équipe

| Membre | Rôle principal |
|---|---|
| **Martin** | UX / UI / Conception |
| Membre 2 | Back-end |
| Membre 3 | Front-end |

Équipe polyvalente — chacun peut intervenir sur le back comme le front.

## Avancement

Itération en cours : **Itération 1 — MVP**

**Gestion de projet & conception**
- [x] Analyse du cahier des charges
- [x] WBS concepteur + WBS client
- [x] Backlog structuré (MoSCoW, phases, MVP identifié)
- [x] User flow réservation
- [x] Arborescence du site
- [x] Roadmap 4 itérations
- [ ] Benchmark UX concurrents
- [ ] Wireframes mobile-first v1

**Développement MVP**
- [ ] Initialisation back Spring Boot + front Angular
- [ ] Modèle de données (chambres, tarifs, clients, réservations)
- [ ] API : disponibilité, CRUD chambres/tarifs
- [ ] Comptes clients (inscription, connexion JWT)
- [ ] Tunnel de réservation (recherche → empreinte CB → confirmation)
- [ ] Tests unitaires (calcul de prix) + tests fonctionnels (routes API)
