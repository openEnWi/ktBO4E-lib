package openenwi.bo4e.lib.bo

import openenwi.bo4e.lib.com.Betrag
import openenwi.bo4e.lib.com.Kostenblock
import openenwi.bo4e.lib.com.Zeitraum
import openenwi.bo4e.lib.enum.BOTyp
import openenwi.bo4e.lib.enum.Kostenklasse

/**
 * Dieses BO wird zur Übertagung von hierarchischen Kostenstrukturen verwendet.
 * Die Kosten werden dabei in Kostenblöcke und diese wiederum in Kostenpositionen strukturiert
 *
 * veröffentlicht am 28. Februar 2018
 *
 * @see "https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-kosten"
 */
data class Kosten(
    val kostenklasse: Kostenklasse,
    val gueltigkeit: Zeitraum,
    val summeKosten: Betrag?,
    val kostenbloecke: List<Kostenblock>
): Geschaeftsobjekt(boTyp = BOTyp.KOSTEN)
