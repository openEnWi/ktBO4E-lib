package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.ExterneReferenz
import de.openenwi.bo4e.lib.com.Zeitreihenwert
import de.openenwi.bo4e.lib.enum.BOTyp
import de.openenwi.bo4e.lib.enum.Medium
import de.openenwi.bo4e.lib.enum.Mengeneinheit
import de.openenwi.bo4e.lib.enum.Messart
import de.openenwi.bo4e.lib.enum.Messgroesse
import de.openenwi.bo4e.lib.enum.Wertermittlungsverfahren

/**
 * Abbildung einer allgemeinen Zeitreihe mit einem Wertvektor.
 * Die Werte können mit wahlfreier zeitlicher Distanz im Vektor abgelegt sein.
 *
 * veröffentlicht am 07. Oktober 2020
 *
 * @see [BO Zeitreihe](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-zeitreihe)
 */
interface Zeitreihe : Geschaeftsobjekt {
    val bezeichnung: String
    val beschreibung: String?
    val version: String?
    val messgroesse: Messgroesse
    val messart: Messart
    val medium: Medium
    val einheit: Mengeneinheit
    val wertherkunft: Wertermittlungsverfahren?
    val werte: Set<Zeitreihenwert>
}

data class ZeitreiheImpl(
    override val bezeichnung: String,
    override val beschreibung: String?,
    override val version: String?,
    override val messgroesse: Messgroesse,
    override val messart: Messart,
    override val medium: Medium,
    override val einheit: Mengeneinheit,
    override val wertherkunft: Wertermittlungsverfahren?,
    override val werte: Set<Zeitreihenwert>,

    override val versionStruktur: Int = 1,
    override val boTyp: BOTyp = BOTyp.ZEITREIHE,
    override val externeReferenzen: Set<ExterneReferenz> = emptySet(),
) : Zeitreihe
