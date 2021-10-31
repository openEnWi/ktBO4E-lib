package de.openenwi.bo4e.lib.com

import de.openenwi.bo4e.lib.enum.Mengeneinheit
import java.math.BigDecimal

/**
 * Abbildung einer Menge mit Wert und Einheit.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [COM Menge](https://www.bo4e.de/dokumentation/komponenten/com-menge)
 */
data class Menge(val wert: BigDecimal, val einheit: Mengeneinheit)
