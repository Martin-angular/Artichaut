# User Flow — Réservation en ligne

> Persona : **Estelle Michaud**, 28 ans, cliente occasionnelle, à l'aise avec le numérique.
> Objectifs : réserver ses nuitées et son petit-déjeuner en ligne, être informée des promotions.
> Frustration à lever : ne pas pouvoir réserver directement ses nuitées et ses options.

Principe de conception : parcours court et fluide, promotion visible dès l'accueil,
options (petit-déjeuner, formules repas) proposées clairement avant le paiement.

```mermaid
flowchart TD
    A([Arrivée sur le site vitrine]) --> B[Voit le bandeau promo en cours]
    B --> C[Clique sur « Réserver »]
    C --> D[Saisie des dates + nb de personnes<br/>2 adultes / 2 enfants]
    D --> E{Chambre disponible<br/>pour ces dates ?}
    E -- Non --> D2[Message + suggestion<br/>d'autres dates]
    D2 --> D
    E -- Oui --> F[Affichage de l'estimation<br/>du prix + choix de la chambre]
    F --> G{Estelle a-t-elle<br/>déjà un compte ?}
    G -- Non --> H[Inscription<br/>email ou Google / Facebook]
    G -- Oui --> I[Connexion]
    H --> J[Choix des options :<br/>petit-déjeuner, formules repas, pack confort]
    I --> J
    J --> K[Récapitulatif + prix total<br/>promo & réductions fidélité incluses]
    K --> L{Estelle valide<br/>sa réservation ?}
    L -- Non, modifie --> J
    L -- Oui --> M[Saisie de l'empreinte<br/>carte bancaire - non débitée]
    M --> N[Validation de la réservation]
    N --> O[Page de confirmation<br/>+ email de confirmation]
    O --> P([Séjour réservé ✅])
```

## Étapes clés & attentes de la persona

| Étape | Ce qu'attend Estelle | Point de vigilance UX |
|---|---|---|
| Accueil | Repérer vite une bonne affaire | Bandeau promo visible immédiatement |
| Recherche | Voir dispo & prix sans friction | Estimation affichée tôt, avant le compte |
| Compte | Aller vite | Inscription sociale (Google/FB) pour éviter la saisie |
| Options | Ajouter petit-déjeuner facilement | Options présentées clairement, prix mis à jour en direct |
| Paiement | Être rassurée | Récap clair, empreinte CB expliquée (non débitée) |
| Confirmation | Preuve de réservation | Email immédiat + récap séjour |

## Points de friction à éviter (préparation étape 1.4)

- Obliger à créer un compte **avant** de voir les prix → décourage une cliente pressée.
- Cacher le prix total des options jusqu'à la fin → mauvaise surprise.
- Trop d'étapes ou de champs → Estelle cherche la rapidité et les bons plans.
