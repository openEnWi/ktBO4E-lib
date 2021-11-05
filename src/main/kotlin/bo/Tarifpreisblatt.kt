package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.AufAbschlag
import de.openenwi.bo4e.lib.com.Energiemix
import de.openenwi.bo4e.lib.com.Preisgarantie
import de.openenwi.bo4e.lib.com.Tarifberechnungsparameter
import de.openenwi.bo4e.lib.com.Tarifeinschraenkung
import de.openenwi.bo4e.lib.com.Tarifpreisposition
import de.openenwi.bo4e.lib.com.Vertragskonditionen
import de.openenwi.bo4e.lib.com.Zeitraum
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
data class Tarifpreisblatt(
    val preisstand: Instant,
    val tarifeinschraenkungen: Tarifeinschraenkung?,
    val preisgarantien: Preisgarantie?,
    val berechnungsparameter: Tarifberechnungsparameter,
    val tarifAufAbschlaege: AufAbschlag?,
    val tarifpreise: List<Tarifpreisposition>,

    private val tarifinfo: Tarifinfo,
) : Tarifinfo by tarifinfo {
    constructor(
        preisstand: Instant,
        tarifeinschraenkungen: Tarifeinschraenkung?,
        preisgarantien: Preisgarantie?,
        berechnungsparameter: Tarifberechnungsparameter,
        tarifAufAbschlaege: AufAbschlag?,
        tarifpreise: List<Tarifpreisposition>,

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
