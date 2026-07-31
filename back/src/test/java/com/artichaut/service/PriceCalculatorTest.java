package com.artichaut.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * Test UNITAIRE de la logique de calcul de prix.
 */
class PriceCalculatorTest {

    private final PriceCalculator calculator = new PriceCalculator();

    @Test
    void calcule_le_prix_de_base() {
        // Chambre standard 70€/nuit/personne, 2 nuits, 3 personnes = 420
        assertEquals(420, calculator.basePrice(70, 2, 3));
    }

    @Test
    void refuse_les_valeurs_negatives() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.basePrice(70, -1, 2));
    }
}
