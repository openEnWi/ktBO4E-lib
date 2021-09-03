package openenwi.bo4e.lib.com

import openenwi.bo4e.lib.enum.*
import java.math.BigDecimal

/**
 * Preis für eine definierte Lieferung oder Leistung innerhalb eines Preisblattes
 *
 * veröffentlicht am 11. April 2018
 *
 * @see [COM Preisposition](https://www.bo4e.de/dokumentation/komponenten/com-preisposition)
 */
data class Preisposition(
    val berechnungsmethode: Kalkulationsmethode,
    val leistungstyp: Leistungstyp,
    val leistungsbezeichung: String,
    val preiseinheit: Waehrungseinheit,
    val bezugsgroesse: Mengeneinheit,
    val zeitbasis: Zeiteinheit?,
    val tarifzeit: Tarifzeit?,
    val bdewArtikelnummer: BDEWArtikelnummer?,
    val zonungsgroesse: Bemessungsgroesse?,
    val freimengeBlindarbeit: BigDecimal?,
    val freimengeLeistungsfaktor: BigDecimal?,
    val preisstaffeln: Set<Preisstaffel>
)
