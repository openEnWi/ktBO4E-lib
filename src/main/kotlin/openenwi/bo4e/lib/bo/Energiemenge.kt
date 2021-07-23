package openenwi.bo4e.lib.bo

import openenwi.bo4e.lib.com.Verbrauch
import openenwi.bo4e.lib.enum.BOTyp
import openenwi.bo4e.lib.enum.Lokationstyp

/**
 * Abbildung von Mengen, die Lokationen zugeordnet sind.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see "https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-energiemenge"
 */
data class Energiemenge(
    val lokationsId: String,
    val lokationstyp: Lokationstyp,
    val energieverbrauch: List<Verbrauch>
) : Geschaeftsobjekt(boTyp = BOTyp.ENERGIEMENGE)
