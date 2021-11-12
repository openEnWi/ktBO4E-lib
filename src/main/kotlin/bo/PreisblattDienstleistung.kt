package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.ExterneReferenz
import de.openenwi.bo4e.lib.com.Geraeteeigenschaften
import de.openenwi.bo4e.lib.com.Preisposition
import de.openenwi.bo4e.lib.com.Zeitraum
import de.openenwi.bo4e.lib.enum.BOTyp
import de.openenwi.bo4e.lib.enum.Bilanzierungsmethode
import de.openenwi.bo4e.lib.enum.Dienstleistungstyp
import de.openenwi.bo4e.lib.enum.Preisstatus
import de.openenwi.bo4e.lib.enum.Sparte

/**
 * Die Variante des Preisblattmodells zur Abbildung der Preise für wahlfreie Dienstleistungen.
 *
 * veröffentlicht am 25. April 2018
 *
 * @see [BO PreisblattDienstleistung](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-preisblattdienstleistung)
 */
interface PreisblattDienstleistung : Preisblatt {
    val bilanzierungsmethode: Bilanzierungsmethode
    val basisdienstleistung: Dienstleistungstyp
    val inklusivedienstleistung: Set<Dienstleistungstyp>
    val geraetedetails: Geraeteeigenschaften?
}

data class PreisblattDienstleistungImpl(
    override val bilanzierungsmethode: Bilanzierungsmethode,
    override val basisdienstleistung: Dienstleistungstyp,
    override val inklusivedienstleistung: Set<Dienstleistungstyp>,
    override val geraetedetails: Geraeteeigenschaften?,

    override val bezeichnung: String,
    override val sparte: Sparte,
    override val preisstatus: Preisstatus,
    override val herausgeber: Marktteilnehmer?,
    override val gueltigkeit: Zeitraum,
    override val preispositionen: Set<Preisposition>,

    override val versionStruktur: Int = 1,
    override val boTyp: BOTyp = BOTyp.PREISBLATTDIENSTLEISTUNG,
    override val externeReferenzen: Set<ExterneReferenz> = emptySet(),
) : PreisblattDienstleistung
