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
 * Das BO Tarifinfo liefert die Merkmale, die einen Endkundentarif identifizierbar machen.
 * Dieses BO dient als Basis für weitere BOs mit erweiterten Anwendungsmöglichkeiten.
 *
 * veröffentlicht am 30. Mai 2018
 *
 * @see [BO Tarifinfo](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-tarifinfo)
 */
interface Tarifinfo: Geschaeftsobjekt {
    val bezeichnung: String
    val anbietername: String
    val sparte: Sparte
    val kundentyp: Kundentyp
    val tarifart: Tarifart
    val tariftyp: Tariftyp
    val tarifmerkmal: Tarifmerkmal
    val website: String?
    val anbieter: Marktteilnehmer
    val zeitlicheGueltigkeit: Zeitraum?
    val energiemix: Energiemix?
    val vertragskonditionen: Vertragskonditionen?
}

data class TarifinfoImpl(
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
) : Tarifinfo
