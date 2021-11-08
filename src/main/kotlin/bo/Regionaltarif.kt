package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.Energiemix
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
data class Regionaltarif(
    val preisstand: Instant,
    val tarifeinschraenkungen: Tarifeinschraenkung?,
    val preisgarantien: Set<RegionalePreisgarantie>,
    val berechnungsparameter: Tarifberechnungsparameter,
    val tarifAufAbschlaege: RegionalerAufAbschlag?,
    val tarifpreise: List<RegionaleTarifpreisposition>,

    private val tarifinfo: Tarifinfo,
) : Tarifinfo by tarifinfo {
    constructor(
        preisstand: Instant,
        tarifeinschraenkungen: Tarifeinschraenkung?,
        preisgarantien: Set<RegionalePreisgarantie>,
        berechnungsparameter: Tarifberechnungsparameter,
        tarifAufAbschlaege: RegionalerAufAbschlag?,
        tarifpreise: List<RegionaleTarifpreisposition>,

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
        preisgarantien,
        berechnungsparameter,
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
            GeschaeftsobjektImpl(1, BOTyp.REGIONALTARIF)
        )
    )
}
