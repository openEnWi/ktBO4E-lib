package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.Preisposition
import de.openenwi.bo4e.lib.com.Zeitraum
import de.openenwi.bo4e.lib.enum.Preisstatus
import de.openenwi.bo4e.lib.enum.Sparte

/**
 * Das allgemeine Modell zur Abbildung von Preisen.
 * Davon abgeleitet können, über die Zuordnung identifizierender Merkmale,
 * spezielle Preisblatt-Varianten modelliert werden.
 *
 * veröffentlicht am 11. April 2018
 *
 * @see [BO Preisblatt](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-preisblatt)
 */
interface Preisblatt : Geschaeftsobjekt {
    val bezeichnung: String
    val sparte: Sparte
    val preisstatus: Preisstatus
    val herausgeber: Marktteilnehmer?
    val gueltigkeit: Zeitraum
    val preispositionen: Set<Preisposition>
}

data class PreisblattImpl(
    override val bezeichnung: String,
    override val sparte: Sparte,
    override val preisstatus: Preisstatus,
    override val herausgeber: Marktteilnehmer?,
    override val gueltigkeit: Zeitraum,
    override val preispositionen: Set<Preisposition>,
    private val geschaeftsobjekt: Geschaeftsobjekt,
) : Geschaeftsobjekt by geschaeftsobjekt, Preisblatt
