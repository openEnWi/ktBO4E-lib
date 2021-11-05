package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.Geraeteeigenschaften
import de.openenwi.bo4e.lib.com.Preisposition
import de.openenwi.bo4e.lib.com.Zeitraum
import de.openenwi.bo4e.lib.enum.Bilanzierungsmethode
import de.openenwi.bo4e.lib.enum.Dienstleistungstyp
import de.openenwi.bo4e.lib.enum.Netzebene
import de.openenwi.bo4e.lib.enum.Preisstatus
import de.openenwi.bo4e.lib.enum.Sparte

/**
 * Die Variante des Preisblattmodells zur Abbildung der Preise für den Messstellenbetrieb
 * und damit verbundene Leistungen.
 *
 * veröffentlicht am 18. April 2018
 *
 * @see [BO PreisblattMessung](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-preisblattmessung)
 */
data class PreisblattMessung(
    val bilanzierungsmethode: Bilanzierungsmethode,
    val messebene: Netzebene,
    val inklusivedienstleistung: Set<Dienstleistungstyp>,
    val zaehler: Geraeteeigenschaften,
    val inklusivegeraete: Set<Geraeteeigenschaften>,
    private val preisblatt: Preisblatt,
) : Preisblatt by preisblatt {
    constructor(
        bilanzierungsmethode: Bilanzierungsmethode,
        messebene: Netzebene,
        inklusivedienstleistung: Set<Dienstleistungstyp>,
        zaehler: Geraeteeigenschaften,
        inklusivegeraete: Set<Geraeteeigenschaften>,

        bezeichnung: String,
        sparte: Sparte,
        preisstatus: Preisstatus,
        herausgeber: Marktteilnehmer?,
        gueltigkeit: Zeitraum,
        preispositionen: Set<Preisposition>,
    ) : this(
        bilanzierungsmethode,
        messebene,
        inklusivedienstleistung,
        zaehler,
        inklusivegeraete,
        PreisblattImpl(
            bezeichnung,
            sparte,
            preisstatus,
            herausgeber,
            gueltigkeit,
            preispositionen,
        )
    )
}
