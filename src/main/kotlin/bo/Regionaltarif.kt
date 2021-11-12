package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.Energiemix
import de.openenwi.bo4e.lib.com.ExterneReferenz
import de.openenwi.bo4e.lib.com.RegionalePreisgarantie
import de.openenwi.bo4e.lib.com.RegionaleTarifpreisposition
import de.openenwi.bo4e.lib.com.RegionalerAufAbschlag
import de.openenwi.bo4e.lib.com.Tarifberechnungsparameter
import de.openenwi.bo4e.lib.com.Tarifeinschraenkung
import de.openenwi.bo4e.lib.com.Vertragskonditionen
import de.openenwi.bo4e.lib.com.Zeitraum
import de.openenwi.bo4e.lib.enum.BOTyp
import de.openenwi.bo4e.lib.enum.Kundentyp
import de.openenwi.bo4e.lib.enum.Sparte
import de.openenwi.bo4e.lib.enum.Tarifart
import de.openenwi.bo4e.lib.enum.Tarifmerkmal
import de.openenwi.bo4e.lib.enum.Tariftyp
import java.time.Instant

/**
 * veröffentlicht am 30. Mai 2018
 *
 * @see [BO Regionaltarif](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-regionaltarif)
 */
interface Regionaltarif : Tarifinfo {
    val preisstand: Instant
    val tarifeinschraenkungen: Tarifeinschraenkung?
    val preisgarantien: Set<RegionalePreisgarantie>
    val berechnungsparameter: Tarifberechnungsparameter
    val tarifAufAbschlaege: RegionalerAufAbschlag?
    val tarifpreise: List<RegionaleTarifpreisposition>
}

data class RegionaltarifImpl(
    override val preisstand: Instant,
    override val tarifeinschraenkungen: Tarifeinschraenkung?,
    override val preisgarantien: Set<RegionalePreisgarantie>,
    override val berechnungsparameter: Tarifberechnungsparameter,
    override val tarifAufAbschlaege: RegionalerAufAbschlag?,
    override val tarifpreise: List<RegionaleTarifpreisposition>,

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
    override val boTyp: BOTyp = BOTyp.REGIONALTARIF,
    override val externeReferenzen: Set<ExterneReferenz> = emptySet(),
) : Regionaltarif
