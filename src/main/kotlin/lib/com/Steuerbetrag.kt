package de.progresslab.bo4e.lib.com

import de.progresslab.bo4e.lib.enum.Steuerkennzeichen
import de.progresslab.bo4e.lib.enum.Waehrungscode
import java.math.BigDecimal

/**
 * Abbildung eines Steuerbetrages.
 *
 * veröffentlicht am 06. Juni 2018
 *
 * @see "https://www.bo4e.de/dokumentation/komponenten/com-steuerbetrag"
 */
data class Steuerbetrag(
    val steuerkennzeichen: Steuerkennzeichen,
    val basiswert: BigDecimal,
    val steuerwert: BigDecimal,
    val waehrung: Waehrungscode
)
