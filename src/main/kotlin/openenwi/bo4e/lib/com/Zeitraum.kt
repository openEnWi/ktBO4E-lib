package openenwi.bo4e.lib.com

import openenwi.bo4e.lib.enum.Zeiteinheit
import java.math.BigDecimal
import java.time.LocalDate
import java.time.ZonedDateTime

/**
 * Diese Komponente wird zur Abbildung von Zeiträumen in Form von Dauern oder der Angabe von Start und Ende verwendet.
 *
 * Es muss daher eine der drei Möglichkeiten angegeben sein:
 * - Einheit und Dauer oder
 * - Zeitraum: Startdatum bis Enddatum oder
 * - Zeitraum: Startzeitpunkt (Datum und Uhrzeit) bis Endzeitpunkt (Datum und Uhrzeit)
 *
 * veröffentlicht am 28. Februar 2018
 */
data class Zeitraum(
    val einheit: Zeiteinheit,
    val dauer: BigDecimal,
    val startdatum: LocalDate,
    val enddatum: LocalDate,
    val startzeitpunkt: ZonedDateTime,
    val endzeitpunkt: ZonedDateTime
)
