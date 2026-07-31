<script setup>
import { ref } from 'vue'

const message = ref("Bonjour de l'Hôtel Artichaut")
</script>

<template>
  <section>
    <h1>{{ message }}</h1>
    <p>Bac à sable front-end — vérification du pipeline CI/CD.</p>
  </section>
</template>
