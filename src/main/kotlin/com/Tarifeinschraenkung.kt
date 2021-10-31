package de.openenwi.bo4e.lib.com

import de.openenwi.bo4e.lib.enum.Voraussetzungen

/**
 * Mit dieser Komponente werden Einschränkungen für die Anwendung von Tarifen modelliert.
 *
 * veröffentlicht am 30. Mai 2018
 *
 * @see [COM Tarifeinschraenkung](https://www.bo4e.de/dokumentation/komponenten/com-tarifeinschraenkung)
 */
data class Tarifeinschraenkung(
    val zusatzprodukte: List<String>,
    val voraussetzungen: List<Voraussetzungen>,
    val einschraenkungzaehler: Set<Geraet>,
    val einschraenkungleistung: Set<Menge>
)
