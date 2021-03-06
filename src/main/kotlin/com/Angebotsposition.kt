package de.openenwi.bo4e.lib.com

/**
 * Unterhalb von Angebotsteilen sind die Angebotspositionen eingebunden.
 * Hier werden die angebotenen Bestandteile einzeln aufgeführt.
 *
 * Beispiel:
 * Positionsmenge: 4000 kWh
 * Positionspreis: 24,56 ct/kWh
 * Positionskosten: 982,40 €
 *
 * @see [COM Angebotsposition](https://www.bo4e.de/dokumentation/komponenten/com-angebotsposition)
 */
data class Angebotsposition(
    val positionsbezeichnung: String,
    val positionsmenge: Menge?,
    val positionspreis: Preis,
    val positionskosten: Betrag?
)
