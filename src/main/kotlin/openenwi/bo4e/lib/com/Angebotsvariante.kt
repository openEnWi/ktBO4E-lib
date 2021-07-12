package openenwi.bo4e.lib.com

import openenwi.bo4e.lib.enum.Angebotsstatus
import java.time.LocalDate
import java.time.ZonedDateTime

/**
 * Führt die verschiedenen Ausprägungen der Angebotsberechnung auf.
 *
 * veröffentlicht am 17. Januar 2018
 */
data class Angebotsvariante(
    val angebotsstatus: Angebotsstatus,
    val beschreibung: String?,
    val erstelldatum: LocalDate,
    val bindefrist: ZonedDateTime,
    val gesamtmenge: Menge?,
    val gesamtkosten: Betrag?,
    val teile: List<Angebotsteil>
)
