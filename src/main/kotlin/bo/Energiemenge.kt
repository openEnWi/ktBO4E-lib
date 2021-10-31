package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.bo.Geschaeftsobjekt.Companion.typ
import de.openenwi.bo4e.lib.com.Verbrauch
import de.openenwi.bo4e.lib.enum.BOTyp
import de.openenwi.bo4e.lib.enum.BOTyp.ENERGIEMENGE
import de.openenwi.bo4e.lib.enum.Lokationstyp

/**
 * Abbildung von Mengen, die Lokationen zugeordnet sind.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [BO Energiemenge](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-energiemenge)
 */
data class Energiemenge(
    val lokationsId: String,
    val lokationstyp: Lokationstyp,
    val energieverbrauch: List<Verbrauch>,
    val geschaeftsobjekt: Geschaeftsobjekt = typ(ENERGIEMENGE)
) : Geschaeftsobjekt by geschaeftsobjekt
