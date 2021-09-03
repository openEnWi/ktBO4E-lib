package openenwi.bo4e.lib.com

import openenwi.bo4e.lib.enum.Mengeneinheit
import openenwi.bo4e.lib.enum.Wertermittlungsverfahren
import java.math.BigDecimal
import java.time.ZonedDateTime

/**
 * Abbildung eines zeitlich abgegrenzten Verbrauchs.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [COM Verbrauch](https://www.bo4e.de/dokumentation/komponenten/com-verbrauch)
 */
data class Verbrauch(
    val startdatum: ZonedDateTime,
    val enddatum: ZonedDateTime,
    val wertermittlungsverfahren: Wertermittlungsverfahren,
    val obiskennzahl: String,
    val wert: BigDecimal,
    val einheit: Mengeneinheit
)
