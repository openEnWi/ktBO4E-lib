package de.openenwi.bo4e.lib.com

import de.openenwi.bo4e.lib.enum.Messwertstatus
import de.openenwi.bo4e.lib.enum.Messwertstatuszusatz
import java.math.BigDecimal

/**
 * Abbildung eines kompakten Zeitreihenwertes in dem ausschliesslich der Wert und Statusinformationen stehen.
 *
 * veröffentlicht am 07. Oktober 2020
 *
 * @see [COM Zeitreihenwertkompakt](https://www.bo4e.de/dokumentation/komponenten/com-zeitreihenwertkompakt)
 */
data class Zeitreihenwertkompakt(
    val wert: BigDecimal,
    val status: Messwertstatus?,
    val statuszusatz: Messwertstatuszusatz?
)
