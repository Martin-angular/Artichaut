# Lecture active du cahier des charges — Notes d'équipe

> Étape 1.1 de l'itération 1. Observations à partager en mise en commun.
> Complète l'analyse structurée dans `01-analyse-cdc.md`.

## ✅ Ce qui est clair et structurant

- **Modèle tarifaire** entièrement chiffré : 3 types de chambres avec numéros précis, tarifs/nuit/personne, capacité max 3 personnes. Modélisable directement en base.
- **Mécanique de fidélité** explicite : -10 % dès la 10ᵉ nuit, -25 % dès la 100ᵉ, « à vie ». Seuils et taux donnés.
- **Rôles et droits** nettement délimités (Client / Personnel hôtelier / Administrateur), avec ce que chacun peut et ne peut pas faire (ex : le personnel ne touche pas au site vitrine).
- **Contenu du site vitrine** détaillé section par section (Hero, Avantages, Vidéo, Avis, Actualités, Footer) avec les champs attendus.
- **Choix techniques imposés** : Spring Boot + Angular, séparation back/front (API + SPA), tests fonctionnels par route, CI, principes SOLID.
- **MVP défini par le client** (réservation en ligne, comptes clients, gestion basique chambres/tarifs) + demande de livraison progressive.

## ❓ Ce qui est flou, contradictoire ou discutable

- **Séquence de paiement** : ordre exact entre estimatif / choix des options / empreinte CB peu clair. **Prestataire de paiement** non nommé (vrai PSP type Stripe ou simulation ?).
- **Décompte des nuits pour la fidélité** : par personne, par compte, ou par chambre ? Cas des réservations groupées / professionnels ?
- **Facturation à 12h le jour d'arrivée** et **annulation à 24h** : fuseaux horaires et cas limites à préciser.
- **QR Code « IDENTITÉ »** ajoutant les frais à la note : sous-entend un système de note/facturation en séjour dont le périmètre n'est pas décrit — potentiellement gros.
- **Météo (M2M)** : implique une API externe non nommée (coût, fiabilité).
- **Interface d'administration** (« optionnel ») et **multilingue** (« à terme ») : compte dans l'évaluation ou hors périmètre ? À trancher.
- **Éco-conception « min. 30 % »** : cible claire mais **méthode de mesure** et **responsable** à définir.

## 💡 Ce qui inspire des idées / premières pistes

- **Contrat d'API dès le départ** (OpenAPI) grâce à la séparation back/front → travail en parallèle fluide entre devs.
- **CMS en blocs de contenu génériques et réutilisables** plutôt qu'en champs figés → bandeaux promo, futures sections et multilingue plus faciles à faire évoluer.
- **Moteur de tarification isolé** comme module métier à part (tarifs + options + fidélité + annulation), testé unitairement — cœur de valeur et zone à risque.
- **Green IT comme fil conducteur** dès les maquettes (images optimisées, lazy loading, sobriété des composants) plutôt qu'une contrainte de dernière minute.
- **Pistes benchmark UX** : Booking, sites de groupes hôteliers ; cas d'usage les plus riches = le tunnel de réservation.

## À partager en mise en commun (2-3 points)

1. **À creuser ensemble** : la mécanique exacte de paiement (empreinte, facturation à 12h, annulation 24h) — elle conditionne une grande partie du scope MVP.
2. **Élément inspirant** : modéliser le CMS en blocs réutilisables plutôt qu'en champs fixes.
3. **Zone grise à trancher** : le niveau d'exigence réel sur l'interface admin et le multilingue, pour fixer les frontières du MVP.
