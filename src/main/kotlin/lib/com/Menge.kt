package de.progresslab.bo4e.lib.com

import de.progresslab.bo4e.lib.enum.Mengeneinheit
import java.math.BigDecimal

/**
 * Abbildung einer Menge mit Wert und Einheit.
 *
 * veröffentlicht am 17. Januar 2018
 */
data class Menge(val wert: BigDecimal, val einheit: Mengeneinheit)
