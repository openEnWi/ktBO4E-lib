package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.Geraeteeigenschaften
import de.openenwi.bo4e.lib.com.Preisposition
import de.openenwi.bo4e.lib.com.Zeitraum
import de.openenwi.bo4e.lib.enum.BOTyp
import de.openenwi.bo4e.lib.enum.Bilanzierungsmethode
import de.openenwi.bo4e.lib.enum.Dienstleistungstyp
import de.openenwi.bo4e.lib.enum.Preisstatus
import de.openenwi.bo4e.lib.enum.Sparte

/**
 * Die Variante des Preisblattmodells zur Abbildung der Preise für wahlfreie Dienstleistungen.
 *
 * veröffentlicht am 25. April 2018
 *
 * @see [BO PreisblattDienstleistung](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-preisblattdienstleistung)
 */
data class PreisblattDienstleistung(
    val bilanzierungsmethode: Bilanzierungsmethode,
    val basisdienstleistung: Dienstleistungstyp,
    val inklusivedienstleistung: Set<Dienstleistungstyp>,
    val geraetedetails: Geraeteeigenschaften?,
    private val preisblatt: Preisblatt,
) : Preisblatt by preisblatt {
    constructor(
        bilanzierungsmethode: Bilanzierungsmethode,
        basisdienstleistung: Dienstleistungstyp,
        inklusivedienstleistung: Set<Dienstleistungstyp>,
        geraetedetails: Geraeteeigenschaften?,
        bezeichnung: String,
        sparte: Sparte,
        preisstatus: Preisstatus,
        herausgeber: Marktteilnehmer?,
        gueltigkeit: Zeitraum,
        preispositionen: Set<Preisposition>,
    ) : this(
        bilanzierungsmethode,
        basisdienstleistung,
        inklusivedienstleistung,
        geraetedetails,
        PreisblattImpl(
            bezeichnung,
            sparte,
            preisstatus,
            herausgeber,
            gueltigkeit,
            preispositionen,
            GeschaeftsobjektImpl(1, BOTyp.PREISBLATTDIENSTLEISTUNG)
        )
    )
}
