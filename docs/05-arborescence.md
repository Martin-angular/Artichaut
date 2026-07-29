# Arborescence du site — Hôtel Artichaut

> Plan de site : les pages du site et la navigation entre elles.
> Vue d'ensemble qui cadre les wireframes (chaque page = un futur wireframe).
> Aligné sur le WBS client (`02b-wbs-client.md`).

```mermaid
flowchart TD
    A[🏠 Accueil - Site vitrine]

    A --> V[Sections vitrine]
    V --> V1[Hero]
    V --> V2[Avantages]
    V --> V3[Vidéo]
    V --> V4[Avis clients]
    V --> V5[Actualités]

    A --> R[📅 Réservation]
    R --> R1[Recherche - dates & personnes]
    R1 --> R2[Disponibilité & choix chambre]
    R2 --> R3[Choix des options]
    R3 --> R4[Récapitulatif & paiement]
    R4 --> R5[Confirmation]

    A --> C[👤 Compte]
    C --> C1[Inscription - email / Google / Facebook]
    C --> C2[Connexion]

    A --> E[🔑 Espace client - connecté]
    E --> E1[Mes réservations]
    E --> E2[Historique nuits & remises]

    A --> F[Footer - liens & réseaux]

    B[🔧 Back-office - accès restreint]
    B --> B1[Personnel : réservations, fiches, factures]
    B --> B2[Admin : chambres, tarifs, contenus, comptes, droits]
```

## Lecture

- **Accueil (vitrine)** : point d'entrée public, avec le bandeau promo et les sections descriptives. Le bouton « Réserver » y est accessible en permanence.
- **Réservation** : parcours linéaire en 5 étapes (voir le user flow `04-userflow-reservation.md`).
- **Compte** : inscription/connexion, sollicité pendant la réservation (après l'affichage des prix).
- **Espace client** : accessible une fois connecté, pour suivre ses réservations.
- **Back-office** : zone séparée, réservée au Personnel et à l'Administrateur (hors parcours visiteur).

## Périmètre MVP (itération 1)

Pages à couvrir en priorité : **Accueil**, **Réservation (les 5 étapes)**, **Inscription / Connexion**.
Espace client et back-office : versions basiques ou itérations suivantes.
