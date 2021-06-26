package de.progresslab.bo4e.lib.enum

/**
 * Unterscheidungsmöglichkeiten für die Sparte.
 *
 * veröffentlicht am 17. Januar 2018
 */
enum class Sparte(val beschreibung: String) {
    STROM("Strom"),
    GAS("Gas"),
    FERNWAERME("Fernwärme"),
    NAHWAERME("Nahwärme"),
    WASSER("Wasserversorgung"),
    ABWASSER("Abwasserentsorgung"),
}
