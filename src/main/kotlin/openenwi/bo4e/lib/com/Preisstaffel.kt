package openenwi.bo4e.lib.com

import java.math.BigDecimal

/**
 * Gibt die Staffelgrenzen der jeweiligen Preise an.
 *
 * veröffentlicht am 11. April 2018
 *
 * @see [COM Preisstaffel](https://www.bo4e.de/dokumentation/komponenten/com-preisstaffel)
 */
data class Preisstaffel(
    val einheitspreis: BigDecimal,
    val staffelgrenzeVon: BigDecimal,
    val staffelgrenzeBis: BigDecimal,
    val sigmoidparameter: Sigmoidparameter?
)
