package de.openenwi.bo4e.lib.enum

/**
 * Zur Differenzierung von Grund/Ersatzversorgungstarifen und sonstigen angebotenen Tarifen.
 *
 * veröffentlicht am 30. Mai 2018
 *
 * @see [ENUM Tariftyp](https://www.bo4e.de/dokumentation/enumerations/enum-tariftyp)
 */
enum class Tariftyp(val beschreibung: String) {
    GRUND_ERSATZVERSORGUNG("Grund- und Ersatzversorgung"),
    GRUNDVERSORGUNG("Grundversorgung"),
    ERSATZVERSORGUNG("Ersatzversorgung"),
    SONDERTARIF("Sondertarif"),
}
