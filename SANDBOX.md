# Bac à sable — vérifier le pipeline CI/CD

Mini projet servant à **valider que la CI lance bien les tests**, avant de développer les vraies fonctionnalités.

## Contenu

```
back/                       → Spring Boot (Maven)
  src/main/java/com/artichaut/
    ArtichautApplication.java  → point d'entrée
    web/HelloController.java   → route GET /api/hello
    service/PriceCalculator.java → logique de prix (exemple métier)
  src/test/java/com/artichaut/
    web/HelloControllerTest.java  → test FONCTIONNEL de la route
    service/PriceCalculatorTest.java → test UNITAIRE
front/                      → Vue.js (Vite + Vitest)
  src/components/HelloArtichaut.vue      → composant
  src/components/HelloArtichaut.test.js  → test du composant
.gitlab-ci.yml             → pipeline (build + test back & front)
```

## Lancer en local

**Back** (nécessite Java 17 + Maven) :
```
cd back
mvn test          # lance les tests
mvn spring-boot:run   # démarre l'API sur http://localhost:8080/api/hello
```

**Front** (nécessite Node 20) :
```
cd front
npm install
npm run test      # lance les tests
npm run dev       # démarre le site en local
```

## Ce que fait le pipeline

À chaque push sur GitLab, `.gitlab-ci.yml` exécute 4 jobs : `back-build`, `back-test`,
`front-build`, `front-test`. Si un test échoue, le pipeline passe au rouge — c'est le
comportement attendu (voir `docs/diagramme_user_story.md`).

## Historique des tests pipeline

| Date | Type | Résultat |
|------|------|----------|
| 2026-07-30 | MCP direct Claude Code → ClickUp | ✅ OK |
| 2026-07-30 | Commit GitLab → pipeline → ClickUp | (en cours) |

## À ajouter au .gitignore

```
back/target/
front/node_modules/
front/dist/
```
