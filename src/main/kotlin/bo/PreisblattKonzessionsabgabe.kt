package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.Preisposition
import de.openenwi.bo4e.lib.com.Zeitraum
import de.openenwi.bo4e.lib.enum.BOTyp
import de.openenwi.bo4e.lib.enum.KundengruppeKA
import de.openenwi.bo4e.lib.enum.Preisstatus
import de.openenwi.bo4e.lib.enum.Sparte

/**
 * Die Variante des Preisblattmodells zur Abbildung von allgemeinen Abgaben
 *
 * veröffentlicht am 08. Mai 2018
 *
 * @see [BO PreisblattKonzessionsabgabe](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-preisblattkonzessionsabgabe)
 */
data class PreisblattKonzessionsabgabe(
    val kundengruppeKA: KundengruppeKA,
    private val preisblatt: Preisblatt,
) : Preisblatt by preisblatt {
    constructor(
        kundengruppeKA: KundengruppeKA,
        bezeichnung: String,
        sparte: Sparte,
        preisstatus: Preisstatus,
        herausgeber: Marktteilnehmer?,
        gueltigkeit: Zeitraum,
        preispositionen: Set<Preisposition>,
    ) : this(
        kundengruppeKA,
        PreisblattImpl(
            bezeichnung,
            sparte,
            preisstatus,
            herausgeber,
            gueltigkeit,
            preispositionen,
            GeschaeftsobjektImpl(1, BOTyp.PREISBLATTKONZESSIONSABGABE)
        )
    )
}
