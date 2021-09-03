package openenwi.bo4e.lib.com

import openenwi.bo4e.lib.enum.Messwertstatus
import openenwi.bo4e.lib.enum.Messwertstatuszusatz
import java.math.BigDecimal
import java.time.ZonedDateTime

/**
 * Abbildung eines Zeitreihenwertes bestehend aus Zeitraum, Wert und Statusinformationen.
 *
 * veröffentlicht am 07. Oktober 2020
 *
 * @see [COM Zeitreihenwert](https://www.bo4e.de/dokumentation/komponenten/com-zeitreihenwert)
 * @see Zeitreihenwertkompakt
 */
data class Zeitreihenwert(
    val datumUhrzeitVon: ZonedDateTime,
    val datumUhrzeitBis: ZonedDateTime,
    // Zeitreihenwertkompakt
    val wert: BigDecimal,
    val status: Messwertstatus?,
    val statuszusatz: Messwertstatuszusatz?
)
