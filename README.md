# 🏨 Hôtel Artichaut

Site vitrine et système de réservation en ligne pour l'hôtel **L'Artichaut** (3⭐ : 25 chambres standard, 5 chambres de luxe, 1 suite).

Le projet vise à moderniser le processus de réservation de l'hôtel : présenter l'établissement, permettre aux clients de réserver en ligne, et offrir aux employés une meilleure gestion des réservations — le tout sur une base technique évolutive.

## 🧱 Stack technique

- **Back-end** : Spring Boot — API REST
- **Front-end** : Angular — SPA (Single Page Application)
- **Architecture** : séparation stricte back / front via API, principes SOLID
- **Qualité** : tests unitaires + fonctionnels, intégration continue
- **Éco-conception** : bonnes pratiques Green IT (objectif ≥ 30 %)

## 📁 Structure du dépôt

```
Artichaut/
├── README.md              → ce fichier
├── docs/                  → documentation projet
│   ├── 01-analyse-cdc.md      → objectif + règles métier du cahier des charges
│   ├── 01b-notes-lecture-cdc.md → lecture active (clair / flou / inspirant)
│   ├── 01c-questions-client.md  → questions à trancher avec le client
│   ├── 02-wbs.md              → découpage technique (WBS)
│   ├── 03-backlog.md          → backlog priorisé (à venir)
│   └── 04-benchmark-ux.md     → benchmark concurrents (à venir)
├── roadmap.md             → vue d'ensemble des 4 itérations
├── back/                  → API Spring Boot (à venir)
└── front/                 → SPA Angular (à venir)
```

## 🚀 Installation & lancement

> À compléter au fur et à mesure du développement.

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

## 📚 Documentation

- [Analyse du cahier des charges](docs/01-analyse-cdc.md) — objectif et règles métier
- [Notes de lecture](docs/01b-notes-lecture-cdc.md) — points clairs, flous, pistes
- [Questions client](docs/01c-questions-client.md) — zones grises à trancher
- [WBS](docs/02-wbs.md) — découpage en livrables
- [Roadmap](roadmap.md) — les 4 itérations

## 👥 Équipe

| Membre | Rôle principal |
|---|---|
| **Martin** | UX / UI / Conception |
| Membre 2 | Back-end |
| Membre 3 | Front-end |

*Équipe polyvalente : chacun peut intervenir sur le back comme le front.*

## 📌 Avancement

Itération en cours : **Itération 1 — Gestion de projet & MVP**

- [x] Analyse du cahier des charges
- [x] WBS
- [ ] Backlog structuré (MoSCoW, MVP, dépendances)
- [ ] Benchmark UX
- [ ] Développement du MVP (réservation, comptes clients, gestion chambres/tarifs)
