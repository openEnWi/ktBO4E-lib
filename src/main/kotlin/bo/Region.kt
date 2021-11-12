package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.ExterneReferenz
import de.openenwi.bo4e.lib.com.Preisposition
import de.openenwi.bo4e.lib.com.Regionskriterium
import de.openenwi.bo4e.lib.com.Zeitraum
import de.openenwi.bo4e.lib.enum.BOTyp
import de.openenwi.bo4e.lib.enum.Preisstatus
import de.openenwi.bo4e.lib.enum.Sparte

/**
 * Modellierung einer Region als Menge von Kriterien, die eine Region beschreiben.
 *
 * veröffentlicht am 22. August 2018
 *
 * @see [BO Region](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-region)
 */
interface Region : Geschaeftsobjekt {
    val bezeichnung: String
    val positivListe: List<Regionskriterium>
    val negativListe: List<Regionskriterium>
}

data class RegionImpl(
    override val bezeichnung: String,
    override val positivListe: List<Regionskriterium>,
    override val negativListe: List<Regionskriterium>,

    override val versionStruktur: Int = 1,
    override val boTyp: BOTyp = BOTyp.REGION,
    override val externeReferenzen: Set<ExterneReferenz> = emptySet(),
) : Region
