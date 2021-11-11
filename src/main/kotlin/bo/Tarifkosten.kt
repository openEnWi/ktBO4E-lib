package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.Energiemix
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
data class Tarifkosten(
    val kosten: KostenImpl,

    private val tarifinfo: Tarifinfo,
) : Tarifinfo by tarifinfo {
    constructor(
        kosten: KostenImpl,

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
        kosten,

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
            GeschaeftsobjektImpl(1, BOTyp.TARIFKOSTEN)
        )
    )
}
