package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.ExterneReferenz
import de.openenwi.bo4e.lib.com.Tagesvektor
import de.openenwi.bo4e.lib.com.Zeitintervall
import de.openenwi.bo4e.lib.enum.BOTyp
import de.openenwi.bo4e.lib.enum.Lokationstyp
import de.openenwi.bo4e.lib.enum.Mengeneinheit
import de.openenwi.bo4e.lib.enum.Sparte

/**
 * Modell zur Abbildung eines kompakten Lastganges.
 * In diesem Modell werden die Messwerte in Form von Tagesvektoren mit fester Anzahl von Werten übertragen.
 * Daher ist dieses BO nur zur Übertragung von äquidistanten Messwertverläufen geeignet.
 *
 * veröffentlicht am 07. Oktober 2020
 *
 * @see [BO Lastgangkompakt](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-lastgangkompakt")
 */
interface Lastgangkompakt : Geschaeftsobjekt {
    val sparte: Sparte
    val version: String?
    val lokationsId: String?
    val lokationstyp: Lokationstyp
    val obiskennzahl: String?
    val messgroesse: Mengeneinheit
    val zeitintervall: Zeitintervall
    val tagesvektoren: List<Tagesvektor>
}

data class LastgangkompaktImpl(
    override val sparte: Sparte,
    override val version: String?,
    override val lokationsId: String?,
    override val lokationstyp: Lokationstyp,
    override val obiskennzahl: String?,
    override val messgroesse: Mengeneinheit,
    override val zeitintervall: Zeitintervall,
    override val tagesvektoren: List<Tagesvektor>,

    override val versionStruktur: Int = 1,
    override val boTyp: BOTyp = BOTyp.LASTGANG,
    override val externeReferenzen: Set<ExterneReferenz> = emptySet(),
) : Lastgangkompakt
