package de.openenwi.bo4e.lib.enum

/**
 * Produktmerkmale im Zusammenhang mit der Tarifdefinition.
 *
 * veröffentlicht am 30. Mai 2018
 *
 * @see [ENUM Tarifmerkmal](https://www.bo4e.de/dokumentation/enumerations/enum-tarifmodell)
 */
enum class Tarifmerkmal(val beschreibung: String) {
    STANDARD("Standardprodukt"),
    VORKASSE("Vorkassenprodukt"),
    PAKET  ("Paketpreisprodukt"),
    KOMBI("Kombiprodukt"),
    FESTPREIS("Festpreisprodukt"),
    BAUSTROM("Baustromprodukt"),
    HAUSLICHT("Hauslichtprodukt"),
    HEIZSTROM("Heizstromprodukt"),
}
