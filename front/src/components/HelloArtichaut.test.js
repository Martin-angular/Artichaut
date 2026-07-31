import { describe, it, expect } from 'vitest'
import { mount } from '@vue/test-utils'
import HelloArtichaut from './HelloArtichaut.vue'

describe('HelloArtichaut', () => {
  it("affiche le message d'accueil", () => {
    const wrapper = mount(HelloArtichaut)
    expect(wrapper.text()).toContain("Bonjour de l'Hôtel Artichaut")
  })
})
