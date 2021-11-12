package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.ExterneReferenz
import de.openenwi.bo4e.lib.com.Geraeteeigenschaften
import de.openenwi.bo4e.lib.com.Preisposition
import de.openenwi.bo4e.lib.com.Zeitraum
import de.openenwi.bo4e.lib.enum.BOTyp
import de.openenwi.bo4e.lib.enum.Bilanzierungsmethode
import de.openenwi.bo4e.lib.enum.Dienstleistungstyp
import de.openenwi.bo4e.lib.enum.Netzebene
import de.openenwi.bo4e.lib.enum.Preisstatus
import de.openenwi.bo4e.lib.enum.Sparte

/**
 * Die Variante des Preisblattmodells zur Abbildung der Preise für den Messstellenbetrieb
 * und damit verbundene Leistungen.
 *
 * veröffentlicht am 18. April 2018
 *
 * @see [BO PreisblattMessung](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-preisblattmessung)
 */
interface PreisblattMessung : Preisblatt {
    val bilanzierungsmethode: Bilanzierungsmethode
    val messebene: Netzebene
    val inklusivedienstleistung: Set<Dienstleistungstyp>
    val zaehler: Geraeteeigenschaften
    val inklusivegeraete: Set<Geraeteeigenschaften>
}

data class PreisblattMessungImpl(
    override val bilanzierungsmethode: Bilanzierungsmethode,
    override val messebene: Netzebene,
    override val inklusivedienstleistung: Set<Dienstleistungstyp>,
    override val zaehler: Geraeteeigenschaften,
    override val inklusivegeraete: Set<Geraeteeigenschaften>,

    override val bezeichnung: String,
    override val sparte: Sparte,
    override val preisstatus: Preisstatus,
    override val herausgeber: Marktteilnehmer?,
    override val gueltigkeit: Zeitraum,
    override val preispositionen: Set<Preisposition>,

    override val versionStruktur: Int = 1,
    override val boTyp: BOTyp = BOTyp.PREISBLATTMESSUNG,
    override val externeReferenzen: Set<ExterneReferenz> = emptySet(),
) : PreisblattMessung
