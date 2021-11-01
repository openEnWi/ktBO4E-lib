package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.*
import de.openenwi.bo4e.lib.enum.*
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
        )
    )
}
