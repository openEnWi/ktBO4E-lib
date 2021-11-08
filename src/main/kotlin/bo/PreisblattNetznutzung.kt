package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.Preisposition
import de.openenwi.bo4e.lib.com.Zeitraum
import de.openenwi.bo4e.lib.enum.BOTyp
import de.openenwi.bo4e.lib.enum.Bilanzierungsmethode
import de.openenwi.bo4e.lib.enum.Kundengruppe
import de.openenwi.bo4e.lib.enum.Netzebene
import de.openenwi.bo4e.lib.enum.Preisstatus
import de.openenwi.bo4e.lib.enum.Sparte

/**
 * Die Variante des Preisblattmodells zur Abbildung der Netznutzungspreise.
 *
 * veröffentlicht am 11. April 2018
 *
 * @see [BO PreisblattKonzessionsabgabe](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-preisblattkonzessionsabgabe)
 */
data class PreisblattNetznutzung(
    val bilanzierungsmethode: Bilanzierungsmethode,
    val netzebene: Netzebene,
    val kundengruppe: Kundengruppe,
    private val preisblatt: Preisblatt,
) : Preisblatt by preisblatt {
    constructor(
        bilanzierungsmethode: Bilanzierungsmethode,
        netzebene: Netzebene,
        kundengruppe: Kundengruppe,

        bezeichnung: String,
        sparte: Sparte,
        preisstatus: Preisstatus,
        herausgeber: Marktteilnehmer?,
        gueltigkeit: Zeitraum,
        preispositionen: Set<Preisposition>,
    ) : this(
        bilanzierungsmethode,
        netzebene,
        kundengruppe,
        PreisblattImpl(
            bezeichnung,
            sparte,
            preisstatus,
            herausgeber,
            gueltigkeit,
            preispositionen,
            GeschaeftsobjektImpl(1, BOTyp.PREISBLATTNETZNUTZUNG)
        )
    )
}
