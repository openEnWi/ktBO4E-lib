package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.Unterschrift
import de.openenwi.bo4e.lib.com.Vertragskonditionen
import de.openenwi.bo4e.lib.com.Vertragsteil
import de.openenwi.bo4e.lib.enum.Sparte
import de.openenwi.bo4e.lib.enum.Vertragsart
import de.openenwi.bo4e.lib.enum.Vertragsstatus
import java.time.LocalDateTime

/**
 * Modell für die Abbildung von Vertragsbeziehungen.
 * Das Objekt dient dazu, alle Arten von Verträgen, die in der Energiewirtschaft Verwendung finden, abzubilden.
 *
 * veröffentlicht am 05. September 2018
 *
 * @see [BO Vertrag](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-vertrag)
 */
interface Vertrag : Geschaeftsobjekt {
    val vertragsnummer: String
    val beschreibung: String?
    val vertragsart: Vertragsart
    val vertragstatus: Vertragsstatus
    val sparte: Sparte
    val vertragsbeginn: LocalDateTime
    val vertragsende: LocalDateTime
    val vertragspartner1: Geschaeftspartner
    val vertragspartner2: Geschaeftspartner
    val unterzeichnervp1: Unterschrift
    val unterzeichnervp2: Unterschrift
    val vertragskonditionen: Set<Vertragskonditionen>
    val vertragsteile: List<Vertragsteil>
}

data class VertragImpl(
    override val vertragsnummer: String,
    override val beschreibung: String?,
    override val vertragsart: Vertragsart,
    override val vertragstatus: Vertragsstatus,
    override val sparte: Sparte,
    override val vertragsbeginn: LocalDateTime,
    override val vertragsende: LocalDateTime,
    override val vertragspartner1: Geschaeftspartner,
    override val vertragspartner2: Geschaeftspartner,
    override val unterzeichnervp1: Unterschrift,
    override val unterzeichnervp2: Unterschrift,
    override val vertragskonditionen: Set<Vertragskonditionen>,
    override val vertragsteile: List<Vertragsteil>,
    private val geschaeftsobjekt: Geschaeftsobjekt,
) : Geschaeftsobjekt by geschaeftsobjekt, Vertrag
