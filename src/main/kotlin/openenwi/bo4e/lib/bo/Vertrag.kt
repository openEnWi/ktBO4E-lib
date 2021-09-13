package openenwi.bo4e.lib.bo

import openenwi.bo4e.lib.com.Unterschrift
import openenwi.bo4e.lib.com.Vertragskonditionen
import openenwi.bo4e.lib.com.Vertragsteil
import openenwi.bo4e.lib.enum.BOTyp
import openenwi.bo4e.lib.enum.Sparte
import openenwi.bo4e.lib.enum.Vertragsart
import openenwi.bo4e.lib.enum.Vertragsstatus
import java.time.LocalDateTime

/**
 * Modell für die Abbildung von Vertragsbeziehungen.
 * Das Objekt dient dazu, alle Arten von Verträgen, die in der Energiewirtschaft Verwendung finden, abzubilden.
 *
 * veröffentlicht am 05. September 2018
 *
 * @see [BO Vertrag](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-vertrag)
 */
data class Vertrag(
    val geschaeftsobjekt: Geschaeftsobjekt = Geschaeftsobjekt(boTyp = BOTyp.VERTRAG),
    val vertragsnummer: String,
    val beschreibung: String?,
    val vertragsart: Vertragsart,
    val vertragstatus: Vertragsstatus,
    val sparte: Sparte,
    val vertragsbeginn: LocalDateTime,
    val vertragsende: LocalDateTime,
    val vertragspartner1: Geschaeftspartner,
    val vertragspartner2: Geschaeftspartner,
    val unterzeichnervp1: Unterschrift,
    val unterzeichnervp2: Unterschrift,
    val vertragskonditionen: Set<Vertragskonditionen>,
    val vertragsteile: List<Vertragsteil>
)
