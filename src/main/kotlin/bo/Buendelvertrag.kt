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
interface Buendelvertrag : Vertrag {
    val einzelvertraege: List<Vertrag>
}

data class BuendelvertragImpl(
    override val einzelvertraege: List<Vertrag>,

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

    override val versionStruktur: Int = 1,
    override val boTyp: BOTyp = BOTyp.BUENDELVERTRAG,
    override val externeReferenzen: Set<ExterneReferenz> = emptySet(),
) : Buendelvertrag
