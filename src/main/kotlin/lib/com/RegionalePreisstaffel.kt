package de.progresslab.bo4e.lib.com

import java.math.BigDecimal

/**
 * Abbildung einer Preisstaffel mit regionaler Abgrenzung.
 *
 * veröffentlicht am 30. Mai 2018
 *
 * @see "https://www.bo4e.de/dokumentation/komponenten/com-regionalepreisstaffel"
 */
data class RegionalePreisstaffel(
    val einheitspreis: BigDecimal,
    val staffelgrenzeVon: BigDecimal,
    val staffelgrenzeBis: BigDecimal,
    val sigmoidparameter: Sigmoidparameter?,
    val regionaleGueltigkeit: RegionaleGueltigkeit
)
