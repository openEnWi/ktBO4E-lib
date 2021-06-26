package de.progresslab.bo4e.lib.enum

/**
 * Aulistung der verschiedenen Berechnungsmethoden für ein Preisblatt.
 *
 * veröffentlicht am 30. Mai 2018
 */
enum class Tarifkalkulationsmethode(val beschreibung: String) {
    KEINE("Es wird keine Berechnung durchgeführt, sondern lediglich die Menge mit dem Preis multipliziert."),
    STAFFELN(
        "Staffelmodell, d.h. die Gesamtmenge wird in eine Staffel eingeordnet " +
                "und für die gesamte Menge gilt der so ermittelte Preis"
    ),
    ZONEN(
        "Zonenmodell, d.h. die Gesamtmenge wird auf die Zonen aufgeteilt " +
                "und für die Teilmengen gilt der jeweilige Preis der Zone."
    ),
    BESTABRECHNUNG_STAFFEL("Bestabrechnung innerhalb der Staffelung"),
    PAKETPREIS("Preis für ein Paket (eine Menge)."),
}
