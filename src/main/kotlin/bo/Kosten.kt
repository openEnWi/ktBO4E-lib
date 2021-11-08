package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.Betrag
import de.openenwi.bo4e.lib.com.Kostenblock
import de.openenwi.bo4e.lib.com.Zeitraum
import de.openenwi.bo4e.lib.enum.Kostenklasse

/**
 * Dieses BO wird zur Übertagung von hierarchischen Kostenstrukturen verwendet.
 * Die Kosten werden dabei in Kostenblöcke und diese wiederum in Kostenpositionen strukturiert
 *
 * veröffentlicht am 28. Februar 2018
 *
 * @see [BO Kosten](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-kosten)
 */
data class Kosten(
    val kostenklasse: Kostenklasse,
    val gueltigkeit: Zeitraum,
    val summeKosten: Betrag?,
    val kostenbloecke: List<Kostenblock>,
    private val geschaeftsobjekt: Geschaeftsobjekt,
) : Geschaeftsobjekt by geschaeftsobjekt
