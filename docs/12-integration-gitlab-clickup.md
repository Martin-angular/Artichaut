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

Pour que le commentaire soit posté automatiquement sur une tâche ClickUp, le message de commit **doit contenir l'identifiant de la tâche** au format suivant :

```
CU-<identifiant_tache>
```

### Exemples valides

```
feat: ajout du formulaire de réservation CU-869ebv7br
fix: correction bug affichage CU-abc123
ci: mise à jour pipeline CU-869ebv7br
```

### Où trouver l'identifiant d'une tâche ClickUp

Dans ClickUp, ouvrir la tâche et copier l'ID visible dans l'URL ou en bas de la tâche :

```
https://app.clickup.com/t/869ebv7br  →  identifiant = 869ebv7br
```

Le préfixe `CU-` est **obligatoire** dans le message de commit pour déclencher la notification.

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
