package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.ExterneReferenz
import de.openenwi.bo4e.lib.com.Preisposition
import de.openenwi.bo4e.lib.com.Zeitraum
import de.openenwi.bo4e.lib.enum.BOTyp
import de.openenwi.bo4e.lib.enum.Bilanzierungsmethode
import de.openenwi.bo4e.lib.enum.Kundengruppe
import de.openenwi.bo4e.lib.enum.Netzebene
import de.openenwi.bo4e.lib.enum.Preisstatus
import de.openenwi.bo4e.lib.enum.Sparte

/**
 * Die Variante des Preisblattmodells zur Abbildung der Netznutzungspreise.
 *
 * veröffentlicht am 11. April 2018
 *
 * @see [BO PreisblattKonzessionsabgabe](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-preisblattkonzessionsabgabe)
 */
interface PreisblattNetznutzung : Preisblatt {
    val bilanzierungsmethode: Bilanzierungsmethode
    val netzebene: Netzebene
    val kundengruppe: Kundengruppe
}

data class PreisblattNetznutzungImpl(
    override val bilanzierungsmethode: Bilanzierungsmethode,
    override val netzebene: Netzebene,
    override val kundengruppe: Kundengruppe,

    override val bezeichnung: String,
    override val sparte: Sparte,
    override val preisstatus: Preisstatus,
    override val herausgeber: Marktteilnehmer?,
    override val gueltigkeit: Zeitraum,
    override val preispositionen: Set<Preisposition>,

    override val versionStruktur: Int = 1,
    override val boTyp: BOTyp = BOTyp.PREISBLATTNETZNUTZUNG,
    override val externeReferenzen: Set<ExterneReferenz> = emptySet(),
) : PreisblattNetznutzung
