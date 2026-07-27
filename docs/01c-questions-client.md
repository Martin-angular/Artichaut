# Questions à poser au client / formateur

> Zones grises relevées lors de la lecture du cahier des charges (`01b-notes-lecture-cdc.md`).
> À trancher avant de figer le périmètre du MVP.

## Paiement & réservation

1. **Prestataire de paiement** : attend-on une vraie intégration (type Stripe/PayPal) ou une simulation d'empreinte CB suffit-elle pour le projet ?
2. **Séquence** : l'empreinte CB est-elle saisie avant ou après le choix des options ? À quel moment exact la réservation est-elle « confirmée » ?
3. **Facturation à 12h le jour d'arrivée** : la carte est-elle débitée automatiquement à ce moment, ou juste rendue non-annulable ?
4. **Annulation à 24h** : comment gère-t-on les cas limites (annulation la veille à 12h01) ? Quel fuseau horaire fait foi ?
5. **Empreinte CB non débitée** : faut-il gérer le débit réel en fin de séjour, ou est-ce hors périmètre ?

## Fidélité

6. **Décompte des nuits** : les nuits se comptent-elles par personne, par compte client, ou par chambre ?
7. **Réservations groupées / professionnels** : à qui profite la réduction quand une personne réserve pour plusieurs voyageurs ?
8. **Cumul** : la réduction -25 % remplace-t-elle le -10 %, ou n'y a-t-il jamais cumul (seuils exclusifs) ?

## Périmètre & priorités

9. **Interface d'administration** (marquée « optionnel ») : compte-t-elle dans l'évaluation, ou l'API sécurisée seule suffit-elle ?
10. **Multilingue** (« à terme ») : à prévoir dans le MVP, dans une itération suivante, ou totalement hors périmètre ?
11. **QR Code « IDENTITÉ »** et ajout automatique des frais à la note : quel est le périmètre réel attendu ? Faut-il un vrai système de note/facturation en séjour ?

## Communication & services externes

12. **Météo (M2M)** : une API météo particulière est-elle imposée ? Un budget/clé API est-il fourni ?
13. **Emails** : quel outil d'envoi attend-on (SMTP simple, service type SendGrid) ? Faut-il gérer les gabarits multilingues ?
14. **Email « préparer son séjour »** : envoi 7 jours avant l'arrivée — attend-on un vrai job planifié (scheduler) ou un déclenchement à la confirmation suffit-il ?

## Qualité & éco-conception

15. **Score Green IT ≥ 30 %** : quel outil de mesure fait référence (EcoIndex, extension GreenIT-Analysis) ? Qui valide le score ?
16. **Couverture de tests** : y a-t-il un taux de couverture minimum attendu, ou « chaque route testée fonctionnellement » suffit-il ?
17. **CI** : une plateforme est-elle imposée (GitHub Actions, GitLab CI) ?

## Données & RGPD

18. **Durée de conservation** des données personnelles : une durée précise est-elle imposée ?
19. **Export / suppression sur demande** : attend-on une fonctionnalité automatisée (self-service côté client) ou une procédure manuelle côté admin ?
