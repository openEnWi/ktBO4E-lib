package de.openenwi.bo4e.lib.com

import de.openenwi.bo4e.lib.enum.Mengeneinheit
import de.openenwi.bo4e.lib.enum.Preisstatus
import de.openenwi.bo4e.lib.enum.Preistyp
import de.openenwi.bo4e.lib.enum.Waehrungseinheit
import java.math.BigDecimal

/**
 * veröffentlicht am 26. Juni 2019
 *
 * @see [COM Tarifpreis](https://www.bo4e.de/dokumentation/komponenten/com-tarifpreis)
 * @see Preis
 */
data class Tarifpreis(
    val preistyp: Preistyp,
    val beschreibung: String?,
    // Preis
    val wert: BigDecimal,
    val einheit: Waehrungseinheit,
    val bezugswert: Mengeneinheit,
    val status: Preisstatus?
)
