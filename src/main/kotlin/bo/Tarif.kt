package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.AufAbschlagRegional
import de.openenwi.bo4e.lib.com.Energiemix
import de.openenwi.bo4e.lib.com.ExterneReferenz
import de.openenwi.bo4e.lib.com.Preisgarantie
import de.openenwi.bo4e.lib.com.Tarifberechnungsparameter
import de.openenwi.bo4e.lib.com.Tarifeinschraenkung
import de.openenwi.bo4e.lib.com.TarifpreispositionProOrt
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
 * Abbildung eines Tarifs mit regionaler Zuordnung von Preisen und Auf- und Abschlägen.
 *
 * veröffentlicht am 12. Dezember 2018
 *
 * @see [BO Tarif](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-tarifinfo-1)
 */
interface Tarif : Tarifinfo {
    val preisstand: Instant
    val tarifeinschraenkungen: Tarifeinschraenkung?
    val berechnungsparameter: Tarifberechnungsparameter
    val preisgarantie: Preisgarantie?
    val tarifAufAbschlaege: AufAbschlagRegional?
    val tarifpreise: List<TarifpreispositionProOrt>
}

data class TarifImpl(
    override val preisstand: Instant,
    override val tarifeinschraenkungen: Tarifeinschraenkung?,
    override val berechnungsparameter: Tarifberechnungsparameter,
    override val preisgarantie: Preisgarantie?,
    override val tarifAufAbschlaege: AufAbschlagRegional?,
    override val tarifpreise: List<TarifpreispositionProOrt>,

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
    override val boTyp: BOTyp = BOTyp.TARIF,
    override val externeReferenzen: Set<ExterneReferenz> = emptySet(),
) : Tarif
