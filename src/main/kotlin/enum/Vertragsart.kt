package de.openenwi.bo4e.lib.enum

/**
 * Aufzählung der Vertragsarten
 *
 * veröffentlicht am 05. September 2018
 *
 * @see [ENUM Vertragsart](https://www.bo4e.de/dokumentation/enumerations/enum-vertragsart)
 */
enum class Vertragsart(val beschreibung: String) {
    ENERGIELIEFERVERTRAG("Energieliefervertrag"),
    NETZNUTZUNGSVERTRAG("Netznutzungsvertrag"),
    BILANZIERUNGSVERTRAG("Bilanzierungsvertrag"),
    MESSSTELLENBETRIEBSVERTRAG("Messstellenbetriebsvertrag"), // Abweichung von BO4E (Tippfehler, a zuviel)
    BUENDELVERTRAG("Bündelvertrag"),
}
