package openenwi.bo4e.lib.enum

/**
 * Spezifiziert die Energierichtung einer Markt- und/oder Messlokation.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [ENUM Energierichtung](https://www.bo4e.de/dokumentation/enumerations/enum-energierichtung)
 */
enum class Energierichtung(val beschreibung: String) {
    AUSSP("Ausspeisung"),
    EINSP("Einspeisung")
}
