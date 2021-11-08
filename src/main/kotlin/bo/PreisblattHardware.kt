package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.Geraeteeigenschaften
import de.openenwi.bo4e.lib.com.Preisposition
import de.openenwi.bo4e.lib.com.Zeitraum
import de.openenwi.bo4e.lib.enum.BOTyp
import de.openenwi.bo4e.lib.enum.Bilanzierungsmethode
import de.openenwi.bo4e.lib.enum.Dienstleistungstyp
import de.openenwi.bo4e.lib.enum.Netzebene
import de.openenwi.bo4e.lib.enum.Preisstatus
import de.openenwi.bo4e.lib.enum.Sparte

/**
 * Die Variante des Preisblattmodells zur Abbildung der Preise für zusätzliche Hardware.
 *
 * veröffentlicht am 11. Dezember 2019
 *
 * @see [BO PreisblattHardware](https://www.bo4e.de/dokumentation/geschaeftsobjekte/preisblatthardware)
 */
data class PreisblattHardware(
    val bilanzierungsmethode: Bilanzierungsmethode,
    val messebene: Netzebene,
    val inklusivedienstleistung: Set<Dienstleistungstyp>,
    val basisgeraet: Geraeteeigenschaften?,
    val inklusivegeraete: Set<Geraeteeigenschaften>,
    private val preisblatt: Preisblatt,
) : Preisblatt by preisblatt {
    constructor(
        bilanzierungsmethode: Bilanzierungsmethode,
        messebene: Netzebene,
        inklusivedienstleistung: Set<Dienstleistungstyp>,
        basisgeraet: Geraeteeigenschaften?,
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
        basisgeraet,
        inklusivegeraete,
        PreisblattImpl(
            bezeichnung,
            sparte,
            preisstatus,
            herausgeber,
            gueltigkeit,
            preispositionen,
            GeschaeftsobjektImpl(1, BOTyp.PREISBLATTHARDWARE)
        )
    )
}
