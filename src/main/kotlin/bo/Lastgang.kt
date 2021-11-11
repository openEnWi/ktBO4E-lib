package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.ExterneReferenz
import de.openenwi.bo4e.lib.com.Zeitreihenwert
import de.openenwi.bo4e.lib.enum.BOTyp
import de.openenwi.bo4e.lib.enum.Mengeneinheit
import de.openenwi.bo4e.lib.enum.Sparte

/**
 * Modell zur Abbildung eines Lastganges.
 * In diesem Modell werden die Messwerte mit einem vollständigen Zeitintervall angegeben
 * und es bietet daher eine hohe Flexibilität in der Übertragung jeglicher zeitlich veränderlicher Messgrössen.
 *
 * veröffentlicht am 07. Oktober 2020
 *
 * @see [BO Lastgang](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-lastgang)
 */
interface Lastgang : Geschaeftsobjekt {
        val sparte: Sparte
        val version: String?
        val lokationsId: String
        val obiskennzahl: String?
        val messgroesse: Mengeneinheit
        val werte: List<Zeitreihenwert>
}

data class LastgangImpl(
    override val sparte: Sparte,
    override val version: String?,
    override val lokationsId: String,
    override val obiskennzahl: String?,
    override val messgroesse: Mengeneinheit,
    override val werte: List<Zeitreihenwert>,

    override val versionStruktur: Int = 1,
    override val boTyp: BOTyp = BOTyp.LASTGANG,
    override val externeReferenzen: Set<ExterneReferenz> = emptySet(),
) : Lastgang
