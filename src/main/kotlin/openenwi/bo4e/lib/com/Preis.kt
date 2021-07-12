package openenwi.bo4e.lib.com

import openenwi.bo4e.lib.enum.Mengeneinheit
import openenwi.bo4e.lib.enum.Preisstatus
import openenwi.bo4e.lib.enum.Waehrungseinheit
import java.math.BigDecimal

data class Preis(
    val wert: BigDecimal,
    val einheit: Waehrungseinheit,
    val bezugswert: Mengeneinheit,
    val status: Preisstatus?
)
