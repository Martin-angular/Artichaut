# Intégration GitLab → ClickUp : guide d'utilisation

## Prérequis

### 1. Token ClickUp configuré dans GitLab

La variable `CLICKUP_API_TOKEN` doit être présente dans **GitLab > Settings > CI/CD > Variables** avec :
- **Key** : `CLICKUP_API_TOKEN`
- **Value** : ton token personnel ClickUp (commence par `pk_...`)
- **Masked** : ✅ (recommandé)
- **Protected** : ❌ (décocher, sinon la variable n'est pas disponible sur les branches non protégées)

Pour obtenir ou régénérer ton token ClickUp : **ClickUp > Profil > Apps > API Token**.

### 2. Vérifier que le token fonctionne

Avant de pousser, tester le token en local :

```powershell
curl.exe -s -X GET "https://api.clickup.com/api/v2/user" -H "Authorization: pk_TON_TOKEN"
```

Si la réponse retourne tes informations utilisateur, le token est valide.

---

## Règle à respecter : format du message de commit

### Anatomie d'un message de commit

Un bon message de commit se lit en une ligne et suit toujours la même structure :

```
<type>: <description courte à l'impératif> CU-<identifiant_tache>
```

- **`<type>`** — la nature du changement (voir tableau ci-dessous).
- **`<description>`** — ce que fait le commit, courte, en français, à l'impératif (« ajoute », « corrige »… pas « ajouté »).
- **`CU-<identifiant>`** — l'identifiant de la tâche ClickUp. C'est **lui** qui déclenche la notification.

### Les types de commit conventionnels

| Type | Quand l'utiliser | Exemple complet |
|------|------------------|-----------------|
| `feat` | Nouvelle fonctionnalité | `feat: ajoute le formulaire de réservation CU-869ebv7br` |
| `fix` | Correction de bug | `fix: corrige le calcul du prix total CU-869ebv7br` |
| `test` | Ajout ou modif de tests | `test: ajoute les tests de réduction fidélité CU-869ebv7br` |
| `ci` | Configuration du pipeline / CI-CD | `ci: ajoute le job de déploiement staging CU-869ebv7br` |
| `docs` | Documentation | `docs: complète le guide GitLab-ClickUp CU-869ebv7br` |
| `refactor` | Réorganisation du code sans changer le comportement | `refactor: extrait la logique de prix dans un service CU-869ebv7br` |
| `chore` | Tâche technique (dépendances, config) | `chore: met à jour les dépendances npm CU-869ebv7br` |

### Où placer le `CU-...`

Le pipeline **scanne tout le message** : le `CU-...` peut donc être n'importe où. Par convention, on le met **à la fin** de la première ligne. Si le message contient plusieurs `CU-...`, seul le **premier** est pris en compte.

### Où trouver l'identifiant d'une tâche ClickUp

Dans ClickUp, ouvrir la tâche : l'ID est visible dans l'URL ou en bas de la tâche.

```
https://app.clickup.com/t/869ebv7br  →  identifiant = 869ebv7br
→  à écrire dans le commit : CU-869ebv7br
```

### ⚠️ Règle stricte sur le format de l'identifiant

Le pipeline détecte l'identifiant avec le motif **`CU-` suivi uniquement de lettres minuscules et de chiffres** (`CU-[a-z0-9]+`). Conséquences :

- Écris l'ID **en minuscules** : `CU-869ebv7br` ✅ — `CU-869EBV7BR` ❌ (majuscules non détectées).
- Pas d'espace ni de tiret dans l'ID : `CU-869ebv7br` ✅ — `CU- 869ebv7br` ❌.
- Le préfixe `CU-` est **obligatoire**, collé à l'ID.

### Exemples valides ✅

```
feat: ajoute le tunnel de réservation CU-869ebv7br
fix: corrige l'empreinte carte bancaire CU-8a2k9x1
test: couvre les seuils de fidélité (10e / 100e nuit) CU-869ebv7br
```

### Exemples qui NE déclenchent PAS la notification ❌

```
feat: ajoute le formulaire de réservation        → aucun CU-, rien n'est posté
fix: corrige bug 869ebv7br                        → il manque le préfixe CU-
ci: update pipeline CU-869EBV7BR                  → majuscules, non détecté
wip                                               → ni type, ni tâche (à éviter)
```

Ces commits ne feront **pas planter** le pipeline : le job `notify` détecte simplement l'absence de tâche et se termine sans rien poster.

---

## Ce que fait le pipeline automatiquement

Dès qu'un commit contenant `CU-xxxxx` est poussé sur GitLab :

1. Le job `clickup-notify` s'exécute
2. Il extrait l'identifiant de tâche du message de commit
3. Il poste un commentaire sur la tâche ClickUp avec :
   - Le titre du commit
   - Le SHA court
   - La branche
   - L'auteur

**Exemple de commentaire posté dans ClickUp :**
```
Commit GitLab | feat: ajout formulaire réservation | a1b2c3d4 | master | Martin
```

---

## Cas où la notification ne se déclenche pas

| Situation | Cause |
|-----------|-------|
| Pas de commentaire posté | Aucun `CU-` dans le message de commit |
| Job échoue avec "Token invalid" | Token expiré ou mauvaise valeur dans la variable GitLab |
| Variable vide | Variable marquée "Protected" sur une branche non protégée |

---

## Résumé du processus

```
1. Créer ou identifier la tâche dans ClickUp → noter son ID
2. Développer la fonctionnalité
3. Commiter avec l'ID dans le message : git commit -m "feat: description CU-<id>"
4. Pousser sur GitLab : git push
5. Le pipeline poste automatiquement un commentaire sur la tâche ClickUp
```
