package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.AufAbschlag
import de.openenwi.bo4e.lib.com.Energiemix
import de.openenwi.bo4e.lib.com.ExterneReferenz
import de.openenwi.bo4e.lib.com.Preisgarantie
import de.openenwi.bo4e.lib.com.Tarifberechnungsparameter
import de.openenwi.bo4e.lib.com.Tarifeinschraenkung
import de.openenwi.bo4e.lib.com.Tarifpreisposition
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
 * Tarifinformation mit Preisen, Aufschlägen und Berechnungssystematik.
 *
 * veröffentlicht am 30. Mai 2018
 *
 * @see [BO Tarifpreisblatt](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-tarifpreisblatt)
 */
interface Tarifpreisblatt : Tarifinfo {
    val preisstand: Instant
    val tarifeinschraenkungen: Tarifeinschraenkung?
    val preisgarantien: Preisgarantie?
    val berechnungsparameter: Tarifberechnungsparameter
    val tarifAufAbschlaege: AufAbschlag?
    val tarifpreise: List<Tarifpreisposition>
}

data class TarifpreisblattImpl(
    override val preisstand: Instant,
    override val tarifeinschraenkungen: Tarifeinschraenkung?,
    override val preisgarantien: Preisgarantie?,
    override val berechnungsparameter: Tarifberechnungsparameter,
    override val tarifAufAbschlaege: AufAbschlag?,
    override val tarifpreise: List<Tarifpreisposition>,

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
    override val boTyp: BOTyp = BOTyp.TARIFPREISBLATT,
    override val externeReferenzen: Set<ExterneReferenz> = emptySet(),
) : Tarifpreisblatt
