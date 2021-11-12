package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.ExterneReferenz
import de.openenwi.bo4e.lib.com.Preisposition
import de.openenwi.bo4e.lib.com.Zeitraum
import de.openenwi.bo4e.lib.enum.BOTyp
import de.openenwi.bo4e.lib.enum.KundengruppeKA
import de.openenwi.bo4e.lib.enum.Preisstatus
import de.openenwi.bo4e.lib.enum.Sparte

/**
 * Die Variante des Preisblattmodells zur Abbildung von allgemeinen Abgaben
 *
 * veröffentlicht am 08. Mai 2018
 *
 * @see [BO PreisblattKonzessionsabgabe](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-preisblattkonzessionsabgabe)
 */
interface PreisblattKonzessionsabgabe : Preisblatt {
    val kundengruppeKA: KundengruppeKA
}

data class PreisblattKonzessionsabgabeImpl(
    override val kundengruppeKA: KundengruppeKA,

    override val bezeichnung: String,
    override val sparte: Sparte,
    override val preisstatus: Preisstatus,
    override val herausgeber: Marktteilnehmer?,
    override val gueltigkeit: Zeitraum,
    override val preispositionen: Set<Preisposition>,

    override val versionStruktur: Int = 1,
    override val boTyp: BOTyp = BOTyp.PREISBLATTKONZESSIONSABGABE,
    override val externeReferenzen: Set<ExterneReferenz> = emptySet(),
) : PreisblattKonzessionsabgabe
