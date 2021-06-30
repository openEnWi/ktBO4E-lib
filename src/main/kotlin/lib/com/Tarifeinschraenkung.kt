package de.progresslab.bo4e.lib.com

import de.progresslab.bo4e.lib.enum.Voraussetzungen

/**
 * Mit dieser Komponente werden Einschränkungen für die Anwendung von Tarifen modelliert.
 *
 * veröffentlicht am 30. Mai 2018
 */
data class Tarifeinschraenkung(
    val zusatzprodukte: List<String>,
    val voraussetzungen: List<Voraussetzungen>,
    val einschraenkungzaehler: Set<Geraet>,
    val einschraenkungleistung: Set<Menge>
)
