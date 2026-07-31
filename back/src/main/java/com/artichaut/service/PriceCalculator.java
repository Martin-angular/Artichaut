package com.artichaut.service;

import org.springframework.stereotype.Service;

/**
 * Petit exemple de logique métier testable unitairement :
 * calcul du prix de base d'un séjour (tarif x nuits x personnes).
 */
@Service
public class PriceCalculator {

    public int basePrice(int pricePerNightPerPerson, int nights, int persons) {
        if (pricePerNightPerPerson < 0 || nights < 0 || persons < 0) {
            throw new IllegalArgumentException("Les valeurs ne peuvent pas être négatives");
        }
        return pricePerNightPerPerson * nights * persons;
    }
}
