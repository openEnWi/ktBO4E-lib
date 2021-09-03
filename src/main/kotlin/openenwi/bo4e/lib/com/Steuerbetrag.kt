package openenwi.bo4e.lib.com

import openenwi.bo4e.lib.enum.Steuerkennzeichen
import openenwi.bo4e.lib.enum.Waehrungscode
import java.math.BigDecimal

/**
 * Abbildung eines Steuerbetrages.
 *
 * veröffentlicht am 06. Juni 2018
 *
 * @see [COM Steuerbetrag](https://www.bo4e.de/dokumentation/komponenten/com-steuerbetrag)
 */
data class Steuerbetrag(
    val steuerkennzeichen: Steuerkennzeichen,
    val basiswert: BigDecimal,
    val steuerwert: BigDecimal,
    val waehrung: Waehrungscode
)
