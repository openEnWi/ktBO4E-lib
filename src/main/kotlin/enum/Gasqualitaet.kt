package de.openenwi.bo4e.lib.enum

/**
 * Unterscheidung für hoch- und niedrig-kalorisches Gas.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [ENUM Gasqualitaet](https://www.bo4e.de/dokumentation/enumerations/enum-gasqualitat)
 */
enum class Gasqualitaet(val beschreibung: String) {
    H_GAS("High Caloric Gas"),
    L_GAS("Low Caloric Gas")
}
