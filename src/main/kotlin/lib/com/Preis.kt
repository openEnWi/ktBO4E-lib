package de.progresslab.bo4e.lib.com

import de.progresslab.bo4e.lib.enum.Mengeneinheit
import de.progresslab.bo4e.lib.enum.Preisstatus
import de.progresslab.bo4e.lib.enum.Waehrungseinheit
import java.math.BigDecimal

data class Preis(
    val wert: BigDecimal,
    val einheit: Waehrungseinheit,
    val bezugswert: Mengeneinheit,
    val status: Preisstatus?
)
