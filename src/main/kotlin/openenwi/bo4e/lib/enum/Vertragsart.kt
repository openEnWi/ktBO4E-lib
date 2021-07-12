package openenwi.bo4e.lib.enum

/**
 * Aufzählung der Vertragsarten
 *
 * veröffentlicht am 05. September 2018
 */
enum class Vertragsart(val beschreibung: String) {
    ENERGIELIEFERVERTRAG("Energieliefervertrag"),
    NETZNUTZUNGSVERTRAG("Netznutzungsvertrag"),
    BILANZIERUNGSVERTRAG("Bilanzierungsvertrag"),
    MESSSTELLENBETRIEBSVERTRAG("Messstellenbetriebsvertrag"), // Abweichung von BO4E (Tippfehler, a zuviel)
    BUENDELVERTRAG("Bündelvertrag"),
}
