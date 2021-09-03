package openenwi.bo4e.lib.com

import java.math.BigDecimal

/**
 * Gibt die Staffelgrenzen der jeweiligen Preise an.
 *
 * veröffentlicht am 12. Dezember 2018
 *
 * @see [COM TarifpreisstaffelProOrt](https://www.bo4e.de/dokumentation/komponenten/com-tarifpreisstaffelproort)
 */
data class TarifpreisstaffelProOrt(
    val arbeitspreis: BigDecimal,
    val arbeitspreisNT: BigDecimal,
    val grundpreis: BigDecimal,
    val staffelgrenzeVon: BigDecimal,
    val staffelgrenzeBis: BigDecimal
)
