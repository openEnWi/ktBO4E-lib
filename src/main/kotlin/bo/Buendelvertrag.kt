package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.ExterneReferenz
import de.openenwi.bo4e.lib.com.Unterschrift
import de.openenwi.bo4e.lib.com.Vertragskonditionen
import de.openenwi.bo4e.lib.com.Vertragsteil
import de.openenwi.bo4e.lib.enum.BOTyp
import de.openenwi.bo4e.lib.enum.Sparte
import de.openenwi.bo4e.lib.enum.Vertragsart
import de.openenwi.bo4e.lib.enum.Vertragsstatus
import java.time.LocalDateTime
import java.util.Collections.emptyList

/**
 * Abbildung eines Bündelvertrags.
 * Es handelt sich hierbei um eine Liste von Einzelverträgen, die in einem Vertragsobjekt gebündelt sind.
 *
 * veröffentlicht am 05. September 2018
 *
 * @see [BO Buendelvertrag](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-buendelvertrag)
 */
data class Buendelvertrag(
    val einzelvertraege: List<Vertrag>,
    private val vertrag: Vertrag,
) : Vertrag by vertrag {
    constructor(
        vertragsnummer: String,
        beschreibung: String?,
        vertragstatus: Vertragsstatus,
        sparte: Sparte,
        vertragsbeginn: LocalDateTime,
        vertragsende: LocalDateTime,
        vertragspartner1: Geschaeftspartner,
        vertragspartner2: Geschaeftspartner,
        unterzeichnervp1: Unterschrift,
        unterzeichnervp2: Unterschrift,
        vertragskonditionen: Set<Vertragskonditionen>,
        vertragsteile: List<Vertragsteil>,
        einzelvertraege: List<Vertrag> = emptyList(),
    ) : this(
        einzelvertraege,
        VertragImpl(
            vertragsnummer,
            beschreibung,
            Vertragsart.BUENDELVERTRAG,
            vertragstatus,
            sparte,
            vertragsbeginn,
            vertragsende,
            vertragspartner1,
            vertragspartner2,
            unterzeichnervp1,
            unterzeichnervp2,
            vertragskonditionen,
            vertragsteile,
            GeschaeftsobjektImpl(1, BOTyp.BUENDELVERTRAG, emptySet<ExterneReferenz>()) // TODO
        )
    )
}
