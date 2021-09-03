package openenwi.bo4e.lib.enum

/**
 * Unterscheidungsmöglichkeiten für die Sparte.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [ENUM Sparte](https://www.bo4e.de/dokumentation/enumerations/enum-sparte)
 */
enum class Sparte(val beschreibung: String) {
    STROM("Strom"),
    GAS("Gas"),
    FERNWAERME("Fernwärme"),
    NAHWAERME("Nahwärme"),
    WASSER("Wasserversorgung"),
    ABWASSER("Abwasserentsorgung"),
}
