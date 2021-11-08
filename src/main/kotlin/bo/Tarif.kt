package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.AufAbschlagRegional
import de.openenwi.bo4e.lib.com.Energiemix
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
data class Tarif(
    val preisstand: Instant,
    val tarifeinschraenkungen: Tarifeinschraenkung?,
    val berechnungsparameter: Tarifberechnungsparameter,
    val preisgarantie: Preisgarantie?,
    val tarifAufAbschlaege: AufAbschlagRegional?,
    val tarifpreise: List<TarifpreispositionProOrt>,

    private val tarifinfo: Tarifinfo,
) : Tarifinfo by tarifinfo {
    constructor(
        preisstand: Instant,
        tarifeinschraenkungen: Tarifeinschraenkung?,
        berechnungsparameter: Tarifberechnungsparameter,
        preisgarantie: Preisgarantie?,
        tarifAufAbschlaege: AufAbschlagRegional?,
        tarifpreise: List<TarifpreispositionProOrt>,

        bezeichnung: String,
        anbietername: String,
        sparte: Sparte,
        kundentyp: Kundentyp,
        tarifart: Tarifart,
        tariftyp: Tariftyp,
        tarifmerkmal: Tarifmerkmal,
        website: String?,
        anbieter: Marktteilnehmer,
        zeitlicheGueltigkeit: Zeitraum?,
        energiemix: Energiemix?,
        vertragskonditionen: Vertragskonditionen?,
    ) : this(
        preisstand,
        tarifeinschraenkungen,
        berechnungsparameter,
        preisgarantie,
        tarifAufAbschlaege,
        tarifpreise,

        TarifinfoImpl(
            bezeichnung,
            anbietername,
            sparte,
            kundentyp,
            tarifart,
            tariftyp,
            tarifmerkmal,
            website,
            anbieter,
            zeitlicheGueltigkeit,
            energiemix,
            vertragskonditionen,
            GeschaeftsobjektImpl(1, BOTyp.TARIFINFO)
        )
    )
}
