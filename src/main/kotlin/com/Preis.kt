package de.openenwi.bo4e.lib.com

import de.openenwi.bo4e.lib.enum.Mengeneinheit
import de.openenwi.bo4e.lib.enum.Preisstatus
import de.openenwi.bo4e.lib.enum.Waehrungseinheit
import java.math.BigDecimal

/**
 * veröffentlicht am 17. Januar 2018
 *
 * @see [COM Preis](https://www.bo4e.de/dokumentation/komponenten/com-preis)
 */
data class Preis(
    val wert: BigDecimal,
    val einheit: Waehrungseinheit,
    val bezugswert: Mengeneinheit,
    val status: Preisstatus?
)
