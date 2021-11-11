package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.ExterneReferenz
import de.openenwi.bo4e.lib.com.Verbrauch
import de.openenwi.bo4e.lib.enum.BOTyp
import de.openenwi.bo4e.lib.enum.Lokationstyp

/**
 * Abbildung von Mengen, die Lokationen zugeordnet sind.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [BO Energiemenge](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-energiemenge)
 */
interface Energiemenge : Geschaeftsobjekt {
    val lokationsId: String
    val lokationstyp: Lokationstyp
    val energieverbrauch: List<Verbrauch>
}

data class EnergiemengeImpl(
    override val lokationsId: String,
    override val lokationstyp: Lokationstyp,
    override val energieverbrauch: List<Verbrauch>,

    override val versionStruktur: Int = 1,
    override val boTyp: BOTyp = BOTyp.ENERGIEMENGE,
    override val externeReferenzen: Set<ExterneReferenz> = emptySet(),
) : Energiemenge
