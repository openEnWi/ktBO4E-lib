package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.Energiemix
import de.openenwi.bo4e.lib.com.ExterneReferenz
import de.openenwi.bo4e.lib.com.Vertragskonditionen
import de.openenwi.bo4e.lib.com.Zeitraum
import de.openenwi.bo4e.lib.enum.BOTyp
import de.openenwi.bo4e.lib.enum.Kundentyp
import de.openenwi.bo4e.lib.enum.Sparte
import de.openenwi.bo4e.lib.enum.Tarifart
import de.openenwi.bo4e.lib.enum.Tarifmerkmal
import de.openenwi.bo4e.lib.enum.Tariftyp

/**
 * Objekt zur Kommunikation von Kosten, die im Rahmen der Tarifanwendung entstehen.
 *
 * veröffentlicht am 30. Mai 2018
 *
 * @see [BO Tarifkosten](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-tarifkosten)
 */
interface Tarifkosten : Tarifinfo {
    val kosten: Kosten
}

data class TarifkostenImpl(
    override val kosten: Kosten,

    override val bezeichnung: String,
    override val anbietername: String,
    override val sparte: Sparte,
    override val kundentyp: Kundentyp,
    override val tarifart: Tarifart,
    override val tariftyp: Tariftyp,
    override val tarifmerkmal: Tarifmerkmal,
    override val website: String?,
    override val anbieter: Marktteilnehmer,
    override val zeitlicheGueltigkeit: Zeitraum?,
    override val energiemix: Energiemix?,
    override val vertragskonditionen: Vertragskonditionen?,

    override val versionStruktur: Int = 1,
    override val boTyp: BOTyp = BOTyp.TARIFINFO,
    override val externeReferenzen: Set<ExterneReferenz> = emptySet(),
) : Tarifkosten
